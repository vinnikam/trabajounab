package solucion;

import java.io.IOException;
import java.math.MathContext;
import java.util.Scanner;

/**
 *
 * @author Vinni
 */
public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando operacion ");
        //secuencia 
        /*1. captura numeros
        1.1 validar numeros        
        2. invocar operacion - realizarla
        3. mostrar resultado       */
        //JDK -- Scanner. 
//        Scanner lector = new Scanner(System.in);
//        int num1;
//        do{
//            System.out.print("Digite el numero (1) o reingreselo por que no es valido : ");
//            num1 = lector.nextInt();
//            
//        }while(num1<0);
//        int num2;
//        do{
//            System.out.print("Digite el numero (2) o reingreselo por que no es valido :");
//            num2 = lector.nextInt();
//        }while (num2<0);

       

        OperacionesM oper = new OperacionesM();
        int num1 =  oper.leerNumero("Digite el numero (1) o reingreselo por que no es valido : ");
        int num2 =  oper.leerNumero("Digite el numero (2) o reingreselo por que no es valido : ");
        
        
        Double  rta = oper.sumar(num1, num2);
        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es " + rta.intValue());
         
        Double num11 =  oper.leerNumeroCQ("Digite el numero (1) o reingreselo por que no es valido : ");
        double num22 =  oper.leerNumeroCQ1("Digite el numero (2) o reingreselo por que no es valido : ");
        
        
        rta = oper.sumar(num11, num22);
        
        

        System.out.println("El resultado de sumar (2)" + num11.intValue() + " + " + num22 + " es " + rta);

        System.out.println("Finalizando operacion ");
        
        
        
        
    }
    

}
