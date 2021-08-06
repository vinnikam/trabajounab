/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.util.Date;

/**
 *
 * @author Vinni
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Parqueo");
        Vehiculo moto = new Vehiculo("aaa", "MOTO");
        
        Date fecha = new Date();
        System.out.println(fecha);
        
        Parqueadero p = new Parqueadero();
        p.addMoto(moto);
    }
}
