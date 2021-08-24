/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

import java.util.Date;

/**
 *
 * @author Vinni
 */
public class Llamada {
    private Long codigo; 
    private long numeroOrigen;
    private long numeroDestino;
    private String tipoDestino;
    private Date fecha;
    private int minutos;

    public Llamada(Long codigo, long numeroOrigen, long numeroDestino, 
            String tipoDestino, Date fecha, int minutos) {
        this.codigo = codigo;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.tipoDestino = tipoDestino;
        this.fecha = fecha;
        this.minutos = minutos;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
}
