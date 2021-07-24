/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vinni
 */
public class OperacionesM {
    
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public int leerNumeroSoloInt(String mensaje){
        Scanner lector = new Scanner(System.in);
        int num1;
        do{
            System.out.print(mensaje);
            try {
                num1 = lector.nextInt();
            }catch(InputMismatchException e){
                System.out.println("se devuelve un cero por error");
                num1= 0;
            }finally{
                System.out.println("manejo error");
            }
            
        }while(num1<0);
        return num1;
    }
    public int leerNumero(String mensaje){
        Scanner lector = new Scanner(System.in);
        int num1;
        String valorleido;
        do{
            System.out.print(mensaje);
            try {
                valorleido = lector.next();
                num1 = Integer.parseInt(valorleido);
                
            }catch(NumberFormatException e){
                num1= -1;
            }
            
        }while(num1<0);
        return num1;
    }
    
}
