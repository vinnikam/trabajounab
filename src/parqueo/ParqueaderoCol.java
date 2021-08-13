/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Vinni
 */
public class ParqueaderoCol {
    public final int CUPOSCARRO = 18;
    public final int CUPOSMOTO = 10;
    
    private int valorMinMoto = 30;
    private int valorMinCarro = 60;
    
    private HashMap<String, Vehiculo> espaciosC = new HashMap<String, Vehiculo>();
    private HashMap<String, Vehiculo> espaciosM = new HashMap<String, Vehiculo>();
    
    private long valorRecaudado;
    
    
    private boolean existeCarro(Vehiculo carro){
       if(this.espaciosC.get(carro.consultaPlaca()) != null){
           return true;
       }
        return false;
    }
    public boolean addCarro(Vehiculo carro){
        if (this.existeCarro(carro) == true){
            return false;
        }
        
        if (this.espaciosC.size()<CUPOSCARRO){
            Date fecha = new Date();
            carro.asignarHoraEntrada(fecha);
            this.espaciosC.put(carro.consultaPlaca(), carro);
            return true;
        }
        
        return false;
    }
    private boolean existeMoto(Vehiculo moto){
        if(this.espaciosM.get(moto.consultaPlaca()) != null){
           return true;
       }
        return false;
    }
    
    public boolean addMoto(Vehiculo moto){
        if (this.existeMoto(moto) == true){
            return false;
        }
        if (this.espaciosM.size()<CUPOSMOTO){
            Date fecha = new Date();
            moto.asignarHoraEntrada(fecha);
            this.espaciosC.put(moto.consultaPlaca(), moto);
            return true;
        }
        
        return false;
    }
    public long salir(String placa, String tipo){
        if(tipo.equals("MOTO")){
            Vehiculo elveh = espaciosM.get(placa);
            if (elveh!= null){
                Date fecha = new Date();
                elveh.asignarHoraSalida(fecha);
                long valorvehiculo = elveh.calcularPago(valorMinMoto);
                this.espaciosM.remove(placa);
                this.valorRecaudado += valorvehiculo;
                return valorvehiculo;
            }
            
        }else if (tipo.equals("CARRO")){
            Vehiculo elveh = espaciosC.get(placa);
            if (elveh!= null){
                Date fecha = new Date();
                elveh.asignarHoraSalida(fecha);
                long valorvehiculo = elveh.calcularPago(valorMinCarro);
                this.espaciosC.remove(placa);
                this.valorRecaudado += valorvehiculo;
                return valorvehiculo;
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
        Iterator datos = this.espaciosM.entrySet().iterator();
        while(datos.hasNext()){
            Vehiculo v = (Vehiculo)datos.next();
            System.out.println(v.consultaPlaca()+" - ");
        }
    }
    public void imprimeCarros(){
        System.out.println("CARROS");
        for (Map.Entry<String, Vehiculo> dato : this.espaciosC.entrySet()){
            System.out.println(dato.getValue().consultaPlaca()+" - ");
        }
    }
    
    public int cuposDisponiblesCarro(){
        
        return CUPOSCARRO-this.espaciosC.size();
    }
    public int cuposDisponiblesMoto(){
        return CUPOSMOTO-this.espaciosM.size();
        
    }
}
