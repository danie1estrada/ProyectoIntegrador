
package model;

public interface Almacenamiento {
    
    public void guardar(Producto p, String tabla);
    
    public Producto getProducto(int codigo);
        
    
    
}
