/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    } 
    public Connection conectarseMDB(){
        String bd = "libreta_bd";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/"+bd, "contacto", "clave");
            return conexion;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    public void cerrarConexAct(Connection conex){
        try {
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
