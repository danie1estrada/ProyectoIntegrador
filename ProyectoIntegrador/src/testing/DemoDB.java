package testing;

import java.sql.SQLException;

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
            c.insert(new String [] {null, "Perro", "12500"}, "Producto");
            System.out.println("Se guardo");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        try {
            c.select();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
