package model;

public class Alimento extends Producto {

    private String marca;
    private String fechaCad;
    
    public Alimento(){
    }

    public Alimento(int codigo, float precio, String descripcion, String marca, String fechaCad) {
        super(codigo, precio, descripcion);
        this.marca = marca;
        this.fechaCad = fechaCad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    @Override
    public String[] getInfo() {
        return new String[]{Integer.toString(codigo), Float.toString(precio),
            descripcion, marca, fechaCad};
    }
}
