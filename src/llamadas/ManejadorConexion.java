/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class ManejadorConexion {
    public Connection conectarse(){
        String bd = "libreta";
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/"+bd, "contacto", "clave");
            return conexion;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(bd.ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
            
    public void desconectase(Connection conexion){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(bd.ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
}
