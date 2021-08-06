/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

/**
 *
 * @author Vinni
 */
public class Parqueadero {
    private final int cuposCarro = 18;
    private final int cuposMoto = 10;
    private int valorMinMoto = 30;
    private int valorMinCarro = 60;
    private Vehiculo[] espaciosC;
    private Vehiculo[] espaciosM;
    private long valorRecaudado;
    
    public boolean addCarro(Vehiculo carro){
        return true;
    }
    
    public boolean addMoto(Vehiculo moto){
        
        return true;
    }
    public long salir(String placa, String tipo){
        return 1;
    }
    
}
