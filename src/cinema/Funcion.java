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
public class Funcion {
    private String pelicula;
    private String tipo; // terror 1 comedia 2 accion 3 drama 4 
    private boolean trespm;
    
    private SalasMap sala;
    
    private double recaudo;

    public Funcion(String pelicula, String tipo, boolean trespm) {
        this.pelicula = pelicula;
        this.tipo = tipo;
        this.trespm = trespm;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTrespm() {
        return trespm;
    }

    public void setTrespm(boolean trespm) {
        this.trespm = trespm;
    }

    public SalasMap getSala() {
        return sala;
    }

    public void setSala(SalasMap sala) {
        this.sala = sala;
    }
    
    public double calculaRecaudo(){
        return this.sala.calculaRecaudo();
    }
    
    
}
