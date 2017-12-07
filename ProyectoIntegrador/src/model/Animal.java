package model;

public abstract class Animal extends Producto {
    
    protected String tamaño;
    protected String color;
    
    public Animal(int codigo, float precio, String descripcion, String tamaño, String color) {
        super(codigo, precio, descriction);
        this.tamaño = tamaño;
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }
    
}
