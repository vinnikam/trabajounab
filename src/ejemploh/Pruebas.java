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

    public static void mainT(String[] args) {
        Usuario elusuario = new Usuario("gabriel");
        //elusuario.nombre = "gabriel";
        //elusuario.asignarNombre("gabriel");

        //elusuario.apellido = "lopez";
        elusuario.asignarApellido("lopez");
        //elusuario.perfil = "Adminstra la nomina -Contador titulado";

        String elnombre = elusuario.consultaNombre();
        elnombre = elusuario.getNombre();

        System.out.println(elnombre + " " + elusuario.consultarApellido());

        elusuario.matricularse("01/01/2020", 0);

    }

    public static void main(String[] args) {
        Usuario usu = new Usuario("JORGITO");
        //usu.setNombre("JORGITO");
        usu.matricularse("2/8/2021", 1000000);

        Administrador adm = new Administrador("pepito");
        //adm.asignarNombre();
        adm.matricularse("30/7/2021", 1000000);
        
        Estudiante est = new Estudiante("juanita", "jrojas", "34334");
        //est.asignarNombre();
        est.matricularse("28/6/2021", 1000000);
    }

}
