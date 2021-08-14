/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latienda;

import java.util.ArrayList;

/**
 *
 * @author Vinni
 */
public class Usuario {
    private String nombre;
    private ArrayList<Producto> productosComprados;
    
    public void comprarProducto(Producto p){
        this.productosComprados.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }
    
}
