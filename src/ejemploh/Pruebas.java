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
public class Pruebas {
    public static void main(String[] args) {
        Usuario elusuario = new Usuario();
        //elusuario.nombre = "gabriel";
        elusuario.asignoaNombre("gabriel");
        
        
        //elusuario.apellido = "lopez";
        elusuario.asignarApellido("lopez");
        //elusuario.perfil = "Adminstra la nomina -Contador titulado";
        
        String elnombre = elusuario.consultaNombre();
        elnombre = elusuario.getNombre();
        
        System.out.println(elnombre +" "+ elusuario.consultarApellido());
        
        elusuario.matricularse("01/01/2020");
        
        
    }
    
}
