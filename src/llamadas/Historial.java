/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class Historial {
    
    public int crearLlamada(Llamada llamada){
        ManejadorConexion manConex = new ManejadorConexion();
        Connection cActiva = manConex.conectarse();
        if (cActiva != null){
            String sql = "insert into llamadas (numero_origen, numero_destino ,"
                    + "tipo_destino, fecha, minutos) values (?, ?, ?, ?, ?)";
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                
                ps.setLong(1, llamada.getNumeroOrigen());
                ps.setLong(2, llamada.getNumeroDestino());
                ps.setString(3, llamada.getTipoDestino());
                Date fechasql = new Date(llamada.getFecha().getTime());
                ps.setDate(4,fechasql);
                ps.setInt(5, llamada.getMinutos());
                        
                return ps.executeUpdate();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Historial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return 0;
    }
    public boolean borrarLlamada(Llamada llamada){
        return true;
    }
    public boolean editarLlamada(Llamada llamada){
        return true;
    }
    public Llamada buscarLlamada(int id){
        return null;
    }
    public ArrayList<Llamada> buscarLlamadas(){
        return null;
    }
    
}
