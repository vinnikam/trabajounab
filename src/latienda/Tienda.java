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
public class Tienda {
    private ArrayList<Producto> inventarioProd;
    private ArrayList<Usuario> clientes;
    
    //llena el array
    public void prepararInventario(){
        
    }
    public Usuario venderProducto(Usuario usu, Producto pCompra, int cantidad){
        for (Producto productoEn : inventarioProd) {
            if (productoEn.getCodigo().equals(pCompra.getCodigo()) && productoEn.getExistencias()>cantidad){
                
                productoEn.setExistencias(productoEn.getExistencias()-cantidad);
                
                pCompra.setExistencias(cantidad);
                usu.comprarProducto(pCompra);
                
            }
            
        }
        return usu;
    }

    public ArrayList<Producto> getInventarioProd() {
        return inventarioProd;
    }

    public void setInventarioProd(ArrayList<Producto> inventarioProd) {
        this.inventarioProd = inventarioProd;
    }
    
    
}
