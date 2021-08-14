package latienda;

/**
 *
 * @author Vinni
 */
public class Producto {
    
    private String codigo ; 
    private String nombre;
    private double valor;
    private String empaque;
    private int existencias;

    public Producto(String codigo, String nombre, double valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    @Override
    public String toString() {
        return this.codigo+" "+this.nombre;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    
    
    
    
}
