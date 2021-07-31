/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import solucion.DatosOpera;

/**
 *
 * @author Vinni
 */
public class JugandoHerencia {
     public static void main(String[] args) {
        Animal unloro = new Animal();
        unloro.color = "rojo-amarillo";
        unloro.nombre = "paquito";
        
        Animal ungato = new Animal();
        ungato.color = "amarillo";
        ungato.nombre = "Jojoi";
        
         System.out.println("instancia de animal "+unloro.toString());
         
         Mamifero perro = new Mamifero();
         perro.amamantar = false;
         perro.nombre = "Firulais";
         
         Mamifero leon = new Mamifero();
         leon.amamantar = false;
         leon.nombre = "blaquito";
         
         System.out.println(perro.toString());
        
         
         Bovinos mivaquita = new Bovinos();
         mivaquita.raza = "Holstein";
         mivaquita.nombre = "blanquita";
         mivaquita.numHijos = 0;
         
         System.out.println(mivaquita.toString());

    }
    
}
