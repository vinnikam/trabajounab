package calcular;

/**
 *
 * @author Vinni
 */
public class Ejecucion {
  
    //operacion 
    public static void main(String strg[]){
        System.out.println("Iniciando");
        
        
        //Usar clase instacia de clase o variable de clase
        Datos unnombre = new Datos();
        
        unnombre.numero1 = 8;
        unnombre.numero2 = 9;
        
        unnombre.sumar();
        
        System.out.println("clase unnombre suma "+unnombre.resultado);
        
        unnombre.sumar(89, 4560);
        
         System.out.println("clase unnombre suma2 sobrecarga "+unnombre.resultado);
        
         
         Datos otro  = new Datos();
         otro.numero1 = 9;
         otro.numero2 = 787;
         
         otro.sumar();
         
         System.out.println("clase otro "+otro.resultado);
         
         System.out.println("COntructor");
         
         
         
         EquipoFutbol eq = new EquipoFutbol("El-equipo"); // invocacion al contructor
         
         System.out.println(eq.nombre);
         
    }
}
