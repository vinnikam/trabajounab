package solucion;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinni
 */
public class Utilidades {
    public void ejecutaComando(String comando){
//        try {
//            final String os = System.getProperty("os.name");
//            if (os.contains("Windows")) {
//                Runtime.getRuntime().exec("cls");
//            } else {
//                Runtime.getRuntime().exec("clear");
//            } 
//        }   catch (final Exception e) {
//                e.printStackTrace();
//                }

    
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        /*No hacer nada*/
//        System.out.println("Borra");
//        try {
//            Runtime.getRuntime().exec(comando);
//        }catch (IOException cq){
//            cq.printStackTrace();
//
//        }
        
        
        
//        System.out.println("Borra");
//        try {
//            Runtime.getRuntime().exec(comando);
//        }catch (IOException cq){
//            cq.printStackTrace();
//            
//        }
    }
    
}
