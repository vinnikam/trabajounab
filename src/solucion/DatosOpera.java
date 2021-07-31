package solucion;

/**
 *
 * @author Vinni
 */
public class DatosOpera {
    // atributos 
    public Double operador1;
    public Double operador2;
    public Double respuesta;
    public String nombre;
    
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
