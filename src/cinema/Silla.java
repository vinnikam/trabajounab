/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Vinni
 */
public class Silla {
    private int  tipo; // 1 preferencial // 2 general
    private double precio;
    private double valor;
    private String codigo;
    private boolean trespm;
    private boolean reserva; 
    private boolean masdos;
    private boolean ultimas10;
    
    
    public Silla(int tipo) {
        this.tipo = tipo;
        if (this.tipo == 1){
            this.valor = 10000;
        }else{
            this.valor = 8500;
        }
    }
    public double valorPagar(){
        this.precio = 0;
        if (trespm ){
            this.precio -= 200;
        }
        if (this.ultimas10){
            this.precio-=300;
        }
        this.precio +=this.valor;
        return this.precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isTrespm() {
        return trespm;
    }

    public void setTrespm(boolean trespm) {
        this.trespm = trespm;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public boolean isMasdos() {
        return masdos;
    }

    public void setMasdos(boolean masdos) {
        this.masdos = masdos;
    }

    public boolean isUltimas10() {
        return ultimas10;
    }

    public void setUltimas10(boolean ultimas10) {
        this.ultimas10 = ultimas10;
    }
    
    
    
}
