/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bd.ManejadorConexion;
import java.sql.Connection;
import org.junit.Assert;
import org.junit.Test;
import solucion.OperacionesM;

/**
 *
 * @author Vinni
 */
public class BDTest {
    @Test
    public void pruebaConexion(){
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        
        Assert.assertNotNull(cActivo);
    }
    @Test
    public void pruebaConexionUfail(){
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        
        Assert.assertNotNull(cActivo);
    }
}
