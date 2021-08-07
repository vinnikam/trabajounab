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
public class EjemArr {
    public static void main(String[] args) {
        int pares[] = new int[10];
        
        pares[0]= 2;
        pares[1]= 4;
        pares[2]= 6;
        pares[3]= 8;
        pares[4]= 10;
        pares[5]= 12;
        pares[6]= 14;
        pares[7]= 16;
        pares[8]= 18;
        pares[9]= 20;
        
        System.out.println(pares.length);
        
        System.out.println("pocicion 3 "+pares[2]);
              
        
        String nombre[] = new String[5];
        
        nombre[4] = "Tatis";
        nombre[0] = "SALENTOS";
        
        System.out.println(nombre[1]);
        
        
        String nombres[] = {"JUAN", "ROBERTO", "", null};
        
        System.out.println(nombres);
        
        Vehiculo veh [] = new Vehiculo[3];
        
        Vehiculo veh1 = new Vehiculo("bbb", "MOTOS");
        veh[1] = veh1;
        System.out.println(veh[1]);
    }
    
}
