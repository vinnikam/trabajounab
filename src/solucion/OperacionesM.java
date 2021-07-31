/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Operaciones matematicas
 *
 * @author Vinni
 */
public class OperacionesM {

    public Double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public Double resta(double num1, double num2) {
        return num1 - num2;
    }

    public Double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public int leerNumeroSoloInt(String mensaje) {
        Scanner lector = new Scanner(System.in);
        int num1;
        do {
            System.out.print(mensaje);
            try {
                num1 = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("se devuelve un cero por error");
                num1 = 0;
            } finally {
                System.out.println("manejo error");
            }

        } while (num1 < 0);
        return num1;
    }

    public int leerNumero(String mensaje) {
        Scanner lector = new Scanner(System.in);
        int num1;
        String valorleido;
        do {
            System.out.print(mensaje);
            try {
                valorleido = lector.next();
                num1 = Integer.parseInt(valorleido);

            } catch (NumberFormatException mismsalkd) {
                num1 = -1;
                //System.out.println(mismsalkd.getMessage());
                //mismsalkd.printStackTrace();

            }

        } while (num1 < 0);
        return num1;
    }

    public Double leerNumeroCQ(String mensaje) {
        Scanner lector = new Scanner(System.in);
        Double num1 = null;
        String valorleido;
        while (num1 == null) {
            System.out.print(mensaje);
            try {
                valorleido = lector.next();
                num1 = Double.parseDouble(valorleido);
            } catch (NumberFormatException mismsalkd) {
                num1 = null;
                //System.out.println(mismsalkd.getMessage());
                //mismsalkd.printStackTrace();
            }
        }
        return num1;
    }

    public double leerNumeroCQ1(String mensaje) {
        Scanner lector = new Scanner(System.in);
        Double num1 = null;
        String valorleido;
        do {
            System.out.print(mensaje);
            valorleido = lector.next();
            num1 = convertirNumero(valorleido);
        } while (num1 == null);
        return num1;
    }

    public Double convertirNumero(String numLeido) {
        Double num1 = null;
        try {

            num1 = Double.parseDouble(numLeido);

        } catch (NumberFormatException mismsalkd) {
            num1 = null;
        }
        return num1;
    }

    public void potencia() {
        //
    }
}
