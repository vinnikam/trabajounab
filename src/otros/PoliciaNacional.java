/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

/**
 *
 * @author Vinni
 */
public class PoliciaNacional {
    
    String nombre;
    String numeroPlaca;
    String esposa_o;
    
    public PoliciaNacional(String elnombre, String laplaca){
        this.nombre = elnombre;
        this.numeroPlaca = laplaca;
        
    }
    
   public String toString(){
       return "nombre "+nombre+" placa "+numeroPlaca;
   }
    
    
    
    public static void main(String[] args) {
        PoliciaNacional poli = new PoliciaNacional("Helios", "POLICUN00154");
//        System.out.println("NO se le olvide colocar nombre y placa cuando use la clase");
//        poli.nombre = "Helios";
//        poli.numeroPlaca="POLICUN00154";
        System.out.println(poli);
        PoliciaNacional poli1 = new PoliciaNacional("Juanita", "POLIANT00554");
        System.out.println(poli1);
        
    }
}
