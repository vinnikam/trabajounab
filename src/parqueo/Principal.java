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
        Vehiculo moto1 = new Vehiculo("bb", "MOTO");
        Vehiculo moto2 = new Vehiculo("cc", "MOTO");
        
        Date fecha = new Date();
        System.out.println(fecha);
        
        Parqueadero p = new Parqueadero();
        for (int i = 0; i < 10; i++) {
            p.addMoto(moto);
        }
        p.imprimeMotos();
        
        p.addMoto(moto1);
        p.imprimeMotos();
        
        
        
        long vpagar = p.salir("bb", "MOTO");
        System.out.println(vpagar);
        System.out.println(p.consultaValorRecaudado());   
        
        vpagar = p.salir("cc", "MOTO");
        System.out.println(vpagar);
        System.out.println(p.consultaValorRecaudado());   
        
        vpagar = p.salir("cc", "MOTO");
        System.out.println(vpagar);
        
        System.out.println(p.consultaValorRecaudado());   
        
        
        
    }
}
