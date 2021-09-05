/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Vinni
 */
public class Cine {
    private Map<String, Funcion> funciones;

    public Cine() {
        this.funciones = new HashMap<String, Funcion>();
        
    }
    public boolean adicionarFuncion(Funcion funcion){
        String nombre = funcion.getPelicula();
        if (funcion.isTrespm()){
            nombre+="3";
        }
        else{
            nombre+="6";
        }
        this.funciones.put(nombre, funcion);
        return true;
    }
    public ArrayList<String> boletasDisponiblesFuncion(Funcion funcion){
        
        return funcion.getSala().disponibles();
        
    }
    public ArrayList<String> funcionesDisponibles(){
        
        Set<String> funcionnombre = this.funciones.keySet();
        ArrayList<String> codigos = new ArrayList<>(funcionnombre);
        
        return codigos;
    } 
    public boolean comprarBoleta(String funcion, ArrayList<Silla> sillas){
        Funcion lafuncion = this.funciones.get(funcion);
        if (lafuncion != null){
            for (Silla silla : sillas) {
                silla.setTrespm(lafuncion.isTrespm());
                lafuncion.getSala().asignarSilla(silla.getCodigo(), silla);
            }
            return true;
        }
        return false;
    }
    public double valorXfuncion(String funcion){
        double rta = this.funciones.get(funcion) != null ? this.funciones.get(funcion).calculaRecaudo():0;
        if (this.funciones.get(funcion) != null){
            rta = this.funciones.get(funcion).calculaRecaudo()
        }else{
            rta = 0;
        }
        return rta;
    }
    public static void main(String[] args) {
        Cine c = new Cine();
        
        Funcion f = new Funcion("TERMINA-HECTOR", "ACCION", true);
        SalasMap sala = new SalasMap(0, 25);
        f.setSala(sala);
        
        c.adicionarFuncion(f);
        
        
        ArrayList<String> dispoArrayList= c.boletasDisponiblesFuncion(f);
        
        for (String boletas : dispoArrayList) {
            System.out.println("BOLETAS "+boletas);
        }

        dispoArrayList= c.funcionesDisponibles();
        
        for (String funciones : dispoArrayList) {
            System.out.println("FUNCIONES ->"+funciones);
        }
        
        
        
        Silla s = new Silla(2);
        s.setCodigo("GEN_S4");
        s.setMasdos(true);
        s.setReserva(false);
        s.setUltimas10(true);
        
        Silla s1 = new Silla(2);
        s1.setCodigo("GEN_S5");
        s1.setMasdos(true);
        s1.setReserva(false);
        s1.setUltimas10(true);

        Silla s2 = new Silla(2);
        s2.setCodigo("GEN_S6");
        s2.setMasdos(true);
        s2.setReserva(false);
        s2.setUltimas10(true);
        
        ArrayList<Silla> silla = new ArrayList();
        silla.add(s);
        silla.add(s1);
        silla.add(s2);
        
        c.comprarBoleta("TERMINA-HECTOR3", silla);
        
        
        dispoArrayList= c.boletasDisponiblesFuncion(f);
        
        for (String boletas : dispoArrayList) {
            System.out.println("BOLETAS 2 "+boletas);
        }
        System.out.println(c.valorXfuncion("TERMINA-HECTOR3"));
        
        
        
        
    }
    
}
