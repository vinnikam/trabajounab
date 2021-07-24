/**
 *
 * @author Vinni
 */
public class Principal {
    
    //contexto de clase
    
    
    // variable DE CLASE // ATRIBUTOS 
    int alksdjlask = 8;
    boolean activo = true;
    boolean inactivo; 
    
    
    // metodo funcion
    //definen y programan las soluciones
    public static void main2(String[] args) {
        
        // contexto de metodo
        System.out.println("Inicio el programa");
        
        // invocar las metodos
        // crear una variable de clase -- invocar las funciones o metodos
        //tipoclase nombrequiero = valor inicial.  ();
        Operaciones misoperaciones = new Operaciones();
        
        misoperaciones.primos();
        String valor = "HELIOS";
        misoperaciones.caracteresPalabra1("la palabra ");
        misoperaciones.caracteresPalabra1(valor);
        //misoperaciones.caracteresPalabra1(String);

        int resultado = misoperaciones.caracteresPalabra(valor);
        System.out.println(resultado);
        
        boolean rest= misoperaciones.caracteresPalabra2();
        System.out.println(rest);
        
        int lasuma = misoperaciones.laSuma(2, 58);
        System.out.println(lasuma);
        
    }
        
    
}
