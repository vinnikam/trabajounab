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
public class Administrador extends Usuario{
    public String usuario;
    public  String clave;

    public Administrador(String nombre){
        super(nombre);
    }
    public Administrador(String nombre,  String apellido){
        super(nombre, apellido);
    }
    @Override
    protected void matricularse(String fechaMatricula, long valor){
        System.out.println("ADMINISTRADOR MATRICULADO SE INSCRIBIO A LA PAGINA WEB EL " + fechaMatricula );
        double valorF = valor * 0.8;
        System.out.println("valor pagado "+valorF);
    }
}
