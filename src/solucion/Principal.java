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
        OperacionesM oper = new OperacionesM();
        Double opcion = 0D;
        DatosOpera dato = new DatosOpera();//ejecuta constructor
//        dato.operador1 = null;
//        dato.operador2 = null;
//        dato.respuesta = null;
//        dato.nombre = "Ninguna";
        dato = new DatosOpera();
        do {

            do {
                System.out.println("1. suma ");
                System.out.println("2. resta ");
                System.out.println("3. multiplica");
                System.out.println("4. salir");
                opcion = oper.leerNumeroCQ("Digite la opcion : ");
            } while (opcion == null || (opcion.intValue() < 1 || opcion.intValue() > 4));

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
            int a = 0;
            Integer aa = 0;

            Double ff = 0.0;
            double fff = 0;

            Long g = 0L;
            long gg = 0L;

            Boolean xx = true;
            boolean xxx = false;

            Double rta = 0D;
            System.out.println("DATOS OPERACION ANTERIOR");
            System.out.println("Se realiza la operacion : " + dato.nombre + " con operadores " + dato.operador1 + ", " + dato.operador2 + " y su resultado fue: " + dato.respuesta);

            if (opcion.intValue() == 1) {
                int num1 = oper.leerNumero("Digite el numero (1) o reingreselo por que no es valido : ");
                int num2 = oper.leerNumero("Digite el numero (2) o reingreselo por que no es valido : ");
                rta = oper.sumar(num1, num2);
                System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es " + rta.intValue());
                dato.operador1 = new Double(num1);
                dato.operador2 = new Double(num2);
                dato.respuesta = rta;
                dato.nombre = "SUMA";
            }
            if (opcion.intValue() == 2) {
                Double num11 = oper.leerNumeroCQ("Digite el numero (1) o reingreselo por que no es valido : ");
                double num22 = oper.leerNumeroCQ1("Digite el numero (2) o reingreselo por que no es valido : ");

                rta = oper.resta(num11, num22);
                System.out.println("El resultado de sumar (2)" + num11.intValue() + " + " + num22 + " es " + rta);
                dato.operador1 = num11;
                dato.operador2 = num22;
                dato.respuesta = rta;
                dato.nombre = "RESTA";
            }
            if (opcion.intValue() == 3) {
                Double num11 = oper.leerNumeroCQ("Digite el numero (1) o reingreselo por que no es valido : ");
                double num22 = oper.leerNumeroCQ1("Digite el numero (2) o reingreselo por que no es valido : ");

                rta = oper.multiplicar(num11, num22);
                System.out.println("El resultado de sumar (2)" + num11.intValue() + " + " + num22 + " es " + rta);
                dato.operador1 = num11;
                dato.operador2 = num22;
                dato.respuesta = rta;
                dato.nombre = "MULTIPLICACION";
            }

        } while (opcion.intValue() != 4);
        if (opcion.intValue() == 4) {
            System.exit(0);
        }
        Utilidades util = new Utilidades();
        //util.ejecutaComando("cls");

        System.out.println("Finalizando operacion ");

    }

    public static void main1(String[] args) {

        Utilidades util = new Utilidades();
        util.ejecutaComando("cls");
        double valor = Math.cos(0.9);
        System.out.println("Coseno " + valor);

        valor = Math.pow(3, 2);
        System.out.println("Potencia 3 e 2 " + valor);

        valor = Math.pow(3, 3);
        System.out.println("Potencia 3 e 3 " + valor);

        valor = Math.pow(27, (1 / 3));
        System.out.println("Raiz 27 e 1/3 " + valor);

        valor = Math.sqrt(4);
        System.out.println("Raiz 4 " + valor);
        util.ejecutaComando("cls");
    }

}
