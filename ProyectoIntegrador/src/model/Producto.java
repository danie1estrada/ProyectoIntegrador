
package model;

public abstract class Producto {
    
    protected int codigo; 
    protected float precio;
    protected String descripcion;
    
    
    public Producto(){
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public abstract String [] getInfo();
    
    
    
    
}
