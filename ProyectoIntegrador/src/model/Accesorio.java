package model;

public class Accesorio extends Producto {

    private String tipo;
    private String material;

    public Accesorio(int codigo, float precio, String descripcion, String tipo, String Material) {
        super(codigo, precio, descripcion);
        this.tipo = tipo;
        this.material = material;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String[] getInfo() {
        return new String[]{Integer.toString(codigo), Float.toString(precio),
             descripcion, tipo, material};
    }

}
