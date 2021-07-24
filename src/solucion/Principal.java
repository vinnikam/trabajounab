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
        boolean num1ok = false;
        boolean num2ok = false;

        if (num1 >= 0) {
            num1ok = true;
        }
        if (num2 >= 0) {
            num2ok = true;
        }
        if (num1ok == true && num2ok == true) {
            OperacionesM oper = new OperacionesM();
            int rta = oper.sumar(num1, num2);

            System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es " + rta);
        } else {
            System.out.println("No se pudo realizar por que los numeros son negativos.  ");
        }

        System.out.println("Finalizando operacion ");
    }

}
