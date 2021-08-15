/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriocontac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */

public class UtilidadPersistencia {
    private final String ARCHIVO = "libreta.asi";
    public boolean guardarArchivo(ArrayList<Contacto> contactos){
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(ARCHIVO);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(contactos);
            //se cierra archivo
            oo.close();
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException ex) {
                
            }
        }
        return false;
    }
    public ArrayList<Contacto> abrirArchivo(){
        ArrayList<Contacto> contactosArchivo = null;
        FileInputStream fo = null;
        try {
            fo = new FileInputStream(ARCHIVO);
            ObjectInputStream oo = new ObjectInputStream(fo);
            contactosArchivo = (ArrayList<Contacto>)oo.readObject();
            //se cierra archivo
            oo.close();
            fo.close();
            return contactosArchivo;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilidadPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return null;
    }
    
}
