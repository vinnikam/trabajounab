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
public class Estudiante extends Usuario{
    public String correo;
    public String clave;
    
    public Estudiante(String nombre, String correo , String clave){
        super(nombre);
        this.correo = correo;
        this.clave = clave;
        
    }
    public Estudiante(String nombre, String apellido, String correo , String clave){
        super(nombre, apellido);
        this.correo = correo;
        this.clave = clave;
        
    }
    
    @Override
    protected void matricularse(String fechaMatricula, long valor){
        System.out.println(" ESTUDIANTE MATRICULADO SE INSCRIBIO A LA PAGINA WEB EL " + fechaMatricula );
        double valorF = valor * 0.6;
        System.out.println("valor pagado "+valorF);
    }
}
