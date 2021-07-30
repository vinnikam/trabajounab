package solucion;

/**
 *
 * @author Vinni
 */
public class DatosOpera {
    // atributos 
    Double operador1;
    Double operador2;
    Double respuesta;
    String nombre;
    
    public DatosOpera(){
        this.operador1 = 0D;
        this.operador2 = 0D;
        this.respuesta = 0D;
        this.nombre = "NINGUNA";
    }
    public String toString(){
       return "nombre "+nombre;
   }
}
