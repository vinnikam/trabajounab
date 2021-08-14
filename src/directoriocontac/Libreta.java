/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriocontac;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Vinni
 */
public class Libreta  implements Serializable{
    
    private ArrayList<Contacto> contactos;

    public Libreta() {
        UtilidadPersistencia util = new UtilidadPersistencia();
        this.contactos = util.abrirArchivo();
        if (this.contactos == null ){
            this.contactos = new ArrayList<>();
        }
         
    }
    public Contacto buscarContacto(String nombre, String apellido, int telefono){
        for (Contacto elcontacto : contactos) {
            if(elcontacto.getNombre().equals(nombre) && 
                    elcontacto.getApellido().equals(apellido) &&
                    elcontacto.getTelefono() == telefono){
                return elcontacto;
            }
        }
        return null;  
    }
    
    public boolean adicionContacto(Contacto contacto){
        if(this.buscarContacto(contacto.getNombre(), 
                contacto.getApellido(), contacto.getTelefono()) != null){
            this.editarContacto(contacto);
        }else{
            this.contactos.add(contacto);
            UtilidadPersistencia util = new UtilidadPersistencia();
            if(util.guardarArchivo(contactos)){
                return true;
            }
        }
        return false;
    }   
    public boolean borrarContacto(Contacto contacto){
        return false;
    }   
    public boolean editarContacto(Contacto contacto){
        return false;
    }   
    public ArrayList<Contacto> listar(){
        return this.contactos;
    }   
    public ArrayList<Contacto> buscarXCelular(int celular){
        return this.contactos;
    }   
    public ArrayList<Contacto> buscarOrdenado(){
        return this.contactos;
    }   
    
    
}
