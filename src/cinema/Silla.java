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
    
    
    public Silla(int tipo) {
        this.tipo = tipo;
        if (this.tipo == 1){
            this.valor = 10000;
        }else{
            this.valor = 8500;
        }
    }
    public double valorPagar(boolean trespm, boolean reserva, boolean masdos, boolean ultimas10){
        this.precio = 0;
        if (trespm && tipo == 1){
            this.precio += 200;
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
    
    
    
}
