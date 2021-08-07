/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Vinni
 */
public class Vehiculo {
    private String placa;
    private Date horaEntrada;
    private Date horaSalida;
    private long valorPagar;
    private String tipo;
    
    public Vehiculo(String placa, String tipo){
        this.placa = placa;
        this.tipo = tipo.trim().toUpperCase();
        
    }
    //CONSULTAR PLACA
    public String consultaPlaca(){
        return this.placa;
    }
    //CONSULTAR TIPO
    public String consultaTipo(){
        return this.tipo;
    }
    
    public Date consultaHoraEntrada(){
        return this.horaEntrada;
    }
    
    public void asignarHoraEntrada(Date horaEntrada){
        this.horaEntrada = horaEntrada;
    }
    
    public Date consultaHoraSalida(){
        return this.horaSalida;
    }
    public void asignarHoraSalida(Date horaSalida){
        this.horaSalida = horaSalida;
    }
    
    public long consultaValorPagar(){
        return this.valorPagar;
    }
    
    public long calcularPago(int valorMinuto){
        
        long diff = this.horaSalida.getTime() - this.horaEntrada.getTime();
        long minutos = TimeUnit.MILLISECONDS.toMinutes(diff);
        
        //int minutos = 34;//difer hrafin-horafin; 
        this.valorPagar = minutos*valorMinuto;
        return this.valorPagar;
    }
}
