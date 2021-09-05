/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Vinni
 */
public class SalasMap {
    
    private Map <String, Silla> sillasGEN ;
    private Map<String, Silla> sillasPRE ;
    
    private int tamsillasPRE;
    private int tamsillasGEN;

    public SalasMap(int tamsillasPRE, int tamsillasGEN) {
        this.tamsillasPRE = tamsillasPRE;
        this.tamsillasGEN = tamsillasGEN;
        sillasGEN = new HashMap<>();
        sillasPRE = new HashMap<>();
        String codigo = "";
        for (int i = 0; i < tamsillasPRE; i++) {
            codigo = "PRE_S"+(i+1);
            sillasPRE.put(codigo, null);
            
        }
        for (int i = 0; i < tamsillasGEN; i++) {
            codigo = "GEN_S"+(i+1);
            sillasGEN.put(codigo, null);
            
        }
    }
    public boolean asignarSilla(String codSilla, Silla lasilla){
        if (codSilla.contains("GEN")){
            return asignarSillaGen(codSilla, lasilla);
        }else{
            return asignarSillaPre(codSilla, lasilla);
        }
        
    }
    private boolean asignarSillaGen (String codSilla, Silla lasilla){
        if (this.sillasGEN.get(codSilla) == null){
            this.sillasGEN.put(codSilla, lasilla);
            return true;
        }
        return false;
    }
    private boolean asignarSillaPre (String codSilla, Silla lasilla){
        if (this.sillasPRE.get(codSilla) == null){
            this.sillasPRE.put(codSilla, lasilla);
            return true;
        }
        return false;
    }
    public ArrayList<String> disponibles(){
        ArrayList<String> codigos = new ArrayList<>();
        Set<String> codigoSilla = this.sillasGEN.keySet();
        for (String cod : codigoSilla) {
            if (this.sillasGEN.get(cod) == null){
                codigos.add(cod);
            }
        }
        codigoSilla = this.sillasPRE.keySet();
        for (String cod : codigoSilla) {
            if (this.sillasPRE.get(cod) == null){
                codigos.add(cod);
            }
        }
        return codigos;
    }
    public ArrayList<String> ocupadosPRE(){
        ArrayList<String> codigos = new ArrayList<>();
        Set<String> codigoSilla = this.sillasPRE.keySet();
        codigoSilla = this.sillasPRE.keySet();
        for (String cod : codigoSilla) {
            if (this.sillasPRE.get(cod) != null){
                codigos.add(cod);
            }
        }
        return codigos;
    }
    public ArrayList<String> ocupadosGEN(){
        ArrayList<String> codigos = new ArrayList<>();
        Set<String> codigoSilla = this.sillasGEN.keySet();
        for (String cod : codigoSilla) {
            if (this.sillasGEN.get(cod) != null){
                codigos.add(cod);
            }
        }
        
        return codigos;
    }
    public double calculaRecaudo(){
        double totales= 0;
        ArrayList<String> llaves = this.ocupadosPRE();
        for (String llave : llaves) {
            totales +=this.sillasPRE.get(llave).valorPagar();
            
        }
        llaves = this.ocupadosGEN();
        for (String llave : llaves) {
            totales +=this.sillasGEN.get(llave).valorPagar();
            
        }
        return totales;
    }
    public static void main(String[] args) {
        SalasMap lassalas = new SalasMap(5, 10);
        System.out.println("FIN");
        ArrayList<String> codigos = lassalas.disponibles();
        for (String codigo : codigos) {
            System.out.println(codigo);
            
        }
        Silla silla = new Silla(1);
        lassalas.asignarSillaGen("GEN_S10", silla);
        lassalas.asignarSillaGen("GEN_S3", silla);
        lassalas.asignarSillaGen("GEN_S6", silla);
        lassalas.asignarSillaPre("PRE_S2", silla);
        lassalas.asignarSillaPre("PRE_S5", silla);
        codigos = lassalas.disponibles();
        System.out.println("- - -- -- - - -- - - ");
        for (String codigo : codigos) {
            System.out.println(codigo);
            
        }
        
    }
    
}
