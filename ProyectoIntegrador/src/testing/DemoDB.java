package testing;

import java.sql.SQLException;

/**
 * Clase de prueba para Conexion.java
 * 
 * @author Daniel Estrada
 */
public class DemoDB {

    public static void main(String[] args) {
        
        Conexion c = new Conexion();
        
        try {
            c.connect();
            System.out.println("Se conecto");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            c.insert(new String [] {null, "'Origin Of Symmetry'", "179.99"}, "Producto");
            System.out.println("Se guardo");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        try {
            c.select("producto");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
