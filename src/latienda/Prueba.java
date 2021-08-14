/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latienda;

/**
 *
 * @author Vinni
 */
public class Prueba {
    public static void main(String[] args) {
        
        Tienda t = new Tienda();
        
        Usuario usu = new Usuario();
        
        Producto pComprar = new Producto("2", "Cocacola", 1500);
        
        usu = t.venderProducto(usu, pComprar, 2);
        
        for (Producto pcomprados : usu.getProductosComprados()) {
            System.out.println(pcomprados);
        }
        
        for (Producto pventa : t.getInventarioProd()) {
            System.out.println(pventa);
        }
        
        
        Producto p = new Producto("2", "cocacola", 123);
        
        //p.setCodigo("2232");
        //p.setEmpaque("");
        //p.setNombre("Cocacola");
        System.out.println(p);
        
       
    }
}
