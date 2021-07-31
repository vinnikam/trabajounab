/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Vinni
 */
public class Animal {
    public Double peso;
    public String color;
    public String nombre;
    
    @Override
    public String toString(){
       return "Clase Animal --> nombre "+nombre;
   }
    
}
