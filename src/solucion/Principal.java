package solucion;

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
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite el numero (1) :");
        int num1 = lector.nextInt();
        System.out.print("Digite el numero (2) :");
        int num2 = lector.nextInt();
        
        OperacionesM oper = new OperacionesM();
        int rta = oper.sumar(num1, num2);
        
        System.out.println("El resultado de sumar "+num1+" + "+num2+" es "+rta);
        
        System.out.println("Finalizando operacion ");
    }
    
}
