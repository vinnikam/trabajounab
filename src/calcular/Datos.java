/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

/**
 *
 * @author Vinni
 */
public class Datos {
    
    //atributos
    public int numero1;
    public int numero2;
    
    public int resultado;
    
//    public Datos(){
//        this.numero1 = 0;
//        this.numero2 = 0;
//        this.resultado = 0;
//        
//    }
    //operaciones - metodos
    public void sumar(){
        resultado = numero1+numero2;
    }
    
    public void sumar(int num, int otronum){
        resultado = num+otronum;
    }
    
}
