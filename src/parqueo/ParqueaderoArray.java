/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vinni
 */
public class ParqueaderoArray {
    public final int CUPOSCARRO = 18;
    public final int CUPOSMOTO = 10;
    
    private int valorMinMoto = 30;
    private int valorMinCarro = 60;
    
    private ArrayList<Vehiculo> espaciosC = new ArrayList<>();
    private ArrayList<Vehiculo> espaciosM = new ArrayList<Vehiculo>();
    
    
    private long valorRecaudado;
    private boolean existeCarro(Vehiculo carro){
        for (int i = 0; i < espaciosC.size(); i++) {
            if(espaciosC.get(i).consultaPlaca().equals(carro.consultaPlaca()))
            {
                return true;
            }
        }
        return false;
    }
    public boolean addCarro(Vehiculo carro){
        if (this.existeCarro(carro) == true){
            return false;
        }
        if (this.espaciosC.size()<this.CUPOSCARRO){
            Date fecha = new Date();
            carro.asignarHoraEntrada(fecha);
            espaciosC.add(carro);
            return true;
            
        }
            
        return false;
    }
    private boolean existeMoto(Vehiculo moto){
        for (int i = 0; i < espaciosM.size(); i++) {
            if(espaciosM.get(i).consultaPlaca().equals(moto.consultaPlaca()))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean addMoto(Vehiculo moto){
        if (this.existeMoto(moto) == true){
            return false;
        }
        //espaciosM arreglo 
        //asignar moto
                
        //recorrer vector .. buscar un null y si null escribe el vehiculo  
        //        y se retorna true 
        if (this.espaciosM.size()<this.CUPOSMOTO){
            Date fecha = new Date();
            moto.asignarHoraEntrada(fecha);
            espaciosM.add(moto);
            return true;
            
        }     
        return false;
    }
    public long salir(String placa, String tipo){
        if(tipo.equals("MOTO")){
            for (int i = 0; i < this.espaciosM.size(); i++){
                Vehiculo elveh = espaciosM.get(i);
                //if (espaciosM[i].consultaPlaca().equals(placa))
                if (elveh.consultaPlaca().equals(placa)){
                    Date fecha = new Date();
                    elveh.asignarHoraSalida(fecha);
                    long valorvehiculo = elveh.calcularPago(valorMinMoto);
                    espaciosM.remove(i) ;
                    
                    //similares
                    //this.valorRecaudado = this.valorRecaudado+valorvehiculo;
                    this.valorRecaudado += valorvehiculo;
                    
                    return valorvehiculo;
                    
                }
            }
            
        }else if (tipo.equals("CARRO")){
            for (int i = 0; i < this.espaciosC.size(); i++){
                Vehiculo elveh = espaciosC.get(i);
                //if (espaciosM[i].consultaPlaca().equals(placa))
                if (elveh.consultaPlaca().equals(placa)){
                    Date fecha = new Date();
                    elveh.asignarHoraSalida(fecha);
                    long valorvehiculo = elveh.calcularPago(valorMinMoto);
                    espaciosC.remove(i) ;
                    
                    //similares
                    //this.valorRecaudado = this.valorRecaudado+valorvehiculo;
                    this.valorRecaudado += valorvehiculo;
                    
                    return valorvehiculo;
                    
                }
            }
        }
        
        
        return -1;
    }
    
    public void asignarValorMinMoto(int valor){
        this.valorMinMoto = valor;
    }
    
    public int consultaValorMinMoto(){
        return this.valorMinMoto;
    }
    public void asignarValorMinCarro(int valor){
        this.valorMinCarro = valor;
    }
    
    public int consultaValorMinCarro(){
        return this.valorMinCarro;
    }
    public long consultaValorRecaudado(){
        return this.valorRecaudado;
    }
    
    public void imprimeMotos(){
        System.out.println("MOTOS");
        for (Vehiculo vehiculo : espaciosM) {
            System.out.println(vehiculo.consultaPlaca()+" - ");
            
        }
    }
    public void imprimeCarros(){
        System.out.println("CARROS");
        for (Vehiculo vehiculo : espaciosC) {
            System.out.println(vehiculo.consultaPlaca()+" - ");
            
        }
    }
    
    public int cuposDisponiblesCarro(){
        
        return this.CUPOSCARRO-this.espaciosC.size();
    }
    public int cuposDisponiblesMoto(){
        return this.CUPOSMOTO-this.espaciosM.size();        
    }
}
