package testing;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import model.*;

public class Conexion {
    
    private final String url;
    private final String user;
    private final String password;
    private Connection c;
    private Statement st;
    
    /**
     * Crea una conexion con una base de datos, usuario y contraseña predefinidos.
     */
    public Conexion() {
        url = "jdbc:mysql://localhost:3306/prueba";
        user = "root";
        password = "admin";
    }
    
    /**
     * Conecta con la base de datos de MySQL 'prueba'
     * 
     * @throws SQLException 
     */
    public void connect() throws SQLException {
        c = DriverManager.getConnection(url, user, password);
        st = c.createStatement();
    }
    
    /**
     * Inserta en la base de datos en la tabla especifícada, la información dentro del arreglo.
     *
     * @param data Arreglo con los datos a almacenar dentro de la base de datos
     * @param table Tabla en la base de datos donde se guardarán los registros
     * @throws SQLException 
     */
    public void insert(String [] data, String table) throws SQLException {
        String query = "INSERT INTO " + table + " VALUES (";
        
        for (int i = 0; i < data.length; i++) {
            query += data[i];
            
            if (i < data.length - 1) {
                query += ", ";
            }
        }
        
        query += ");";
        st.execute(query);
    }
    
    /**
     * Muestra todos los registros de una tabla especifica en la base de datos.
     * 
     * @param table La tabla en la base de datos de donde se consultarán los datos
     * @throws SQLException 
     */
    public void select(String table) throws SQLException {
        ResultSet rs = st.executeQuery("SELECT * FROM " + table);
        ResultSetMetaData md = rs.getMetaData();
        
        int cols = md.getColumnCount();
        
        while(rs.next()) {
            for (int i = 1; i <= cols; i++) {
                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Retorna un objeto de tipo Producto de acuerdo a los parametros especificados
     * con la informacion de la base de datos
     * 
     * @param code El id del producto
     * @param table La tabla donde esta registrado en la base de datos.
     * @return Una instancia de Producto inicializada.
     * @throws SQLException, Exception 
     */
    public Producto getProducto(int code, String table) throws SQLException, Exception {
        ResultSet rs = st.executeQuery("SELECT * FROM " + table + " WHERE ID = " + code);
        Producto p = null;
        
        switch(table.toLowerCase()) {
            case "accesorio":
                p = new Accesorio(rs.getInt(1), rs.getFloat(2), rs.getString(3),
                rs.getString(4), rs.getString(5));
                break;
            case "alimento":
                p = new Alimento(rs.getInt(1), rs.getFloat(2), rs.getString(3),
                rs.getString(4), rs.getString(5));
                break;
            /*case "perro":
                p = new Alimento(rs.getInt(1), rs.getFloat(2), rs.getString(3),
                rs.getString(4), rs.getString(5), rs.getString(6));
                break;
            case "gato":
                p = new Alimento(rs.getInt(1), rs.getFloat(2), rs.getString(3),
                rs.getString(4), rs.getString(5), rs.getString(6));
                break;
            case "ave":
                p = new Alimento(rs.getInt(1), rs.getFloat(2), rs.getString(3),
                rs.getString(4), rs.getString(5), rs.getString(6));
                break;*/
            default: break;
        }

        return p;
    }
}
