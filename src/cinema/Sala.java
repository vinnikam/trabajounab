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
public class Sala {
    private ArrayList<Silla> sillaPRE;
    private ArrayList<Silla> sillaGEN;
    private int tamsillasPRE;
    private int tamsillasGEN;
    
    public Sala(int tamsillasPRE, int tamsillasGEN) {
        this.sillaPRE = new ArrayList<>();
        this.sillaGEN = new ArrayList<>();
        this.tamsillasGEN = tamsillasGEN;
        this.tamsillasPRE = tamsillasPRE;
    }
    public int disponiblesGEN(){
        return this.tamsillasGEN-this.sillaGEN.size();
    }
    public int disponiblesPRE(){
        return this.tamsillasPRE-this.sillaPRE.size();
    }
    public void ocuparSillaGEN(Silla silla){
        if (this.sillaGEN.size()<this.tamsillasGEN)
            this.sillaGEN.add(silla);
    }
    public void ocuparSillaPRE(Silla silla){
        if (this.sillaPRE.size()<this.tamsillasPRE)
            this.sillaPRE.add(silla);
    }
    
    public static void main(String[] args) {
            Sala lassalas =new Sala(5, 10);
    }
}
