/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;

/**
 *
 * @author Vinni
 */
public class Cine {
    private SalasMap sala1 ;
    private SalasMap sala2 ;

    public Cine() {
        this.sala1 = new SalasMap(10, 20);
        this.sala2 = new SalasMap(0, 25);
    }
    
    public void comprarBoletosSala1(Silla silla, int sala){
        if (sala == 1){
            if (silla.getTipo() == 1){//preferencial
                this.sala1.asignarSillaPre(silla.getCodigo(), silla);
            }else if (silla.getTipo() == 2){//general
                this.sala1.asignarSillaGen(silla.getCodigo(), silla);
            }
        }
        if (sala == 2){
            if (silla.getTipo() == 1){//preferencial
                this.sala1.asignarSillaPre(silla.getCodigo(), silla);
            }else if (silla.getTipo() == 2){//general
                this.sala1.asignarSillaGen(silla.getCodigo(), silla);
            }
        }
    }
    public ArrayList<String> disponibles(int lasala){
         if (lasala == 1){
             return sala1.disponibles();
         }
         if (lasala == 2){
             return sala2.disponibles();
         }
        return new ArrayList<>();
        
    }
    
    
    
}
