/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploh;

/**
 *
 * @author Vinni
 */
public class Usuario {
    private String nombre;
    private String apellido;
    //private String perfil;
    public Double sueldo;
    
    public void asignoaNombre(String elnuevovalor){
        this.nombre = elnuevovalor;
    }
    public String consultaNombre(){
        return this.nombre;
    }
    
    public void asignarApellido(String unapellido){
        this.apellido = unapellido;
    }
    public String consultarApellido(){
        return this.apellido;
    }
    
    
    //en ingles
    public void setNombre(String elnuevovalor){
        this.nombre = elnuevovalor;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    protected void matricularse(String fechapago){
        System.out.println("Se matriculo");
    }
    
    
    
}
