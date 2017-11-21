package testing;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Conexion {
    
    private final String url;
    private final String user;
    private final String password;
    private Connection c;
    private Statement st;
    
    public Conexion() {
        url = "jdbc:mysql://localhost:3306/prueba";
        user = "root";
        password = "admin";
    }
    
    public void connect() throws SQLException {
        c = DriverManager.getConnection(url, user, password);
        st = c.createStatement();
    }
    
    public void insert(String [] data, String table) throws SQLException {
        String query = "INSERT INTO " + table + " VALUES (";
        
        for (int i = 0; i < data.length; i++) {
            query += data[i];
            
            if (i < data.length - 1) {
                query += ", ";
            }
        }
        
        query += ");";
        
        System.out.println(query);
        st.execute(query);
    }
    
    public void select() throws SQLException {
        ResultSet rs = st.executeQuery("SELECT * FROM Producto");
        ResultSetMetaData md = rs.getMetaData();
        
        int cols = md.getColumnCount();
        
        while(rs.next()) {
            for (int i = 1; i <= cols; i++) {
                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }
        
    }
}
