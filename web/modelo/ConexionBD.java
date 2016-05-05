package modelo;
import java.sql.*;

public class ConexionBD {
    

    private static Connection conexion = null;
    private Statement st;
    private final String urlBD = "jdbc:derby://localhost:1527/MiCosplayDB";
    private final String userName = "root";
    private final String password = "cosplay";
    private final String driverName = "org.apache.derby.jdbc.ClientDriver";
    private static ConexionBD conexionBD;

    private ConexionBD() throws SQLException, ClassNotFoundException {
        Class.forName(driverName);
    }

    public static ConexionBD getInstancia() throws SQLException, ClassNotFoundException {
        if (conexionBD == null) {
            conexionBD = new ConexionBD();
        }
        return conexionBD;
    }
    
    public void ejecutaUpdate(String sql) throws SQLException, ClassNotFoundException {
        conexion = DriverManager.getConnection(urlBD, userName, password);
        st = conexion.createStatement();
        st.executeUpdate(sql);
        close();
    }

    public  void close() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("No se ha podido cerrar la conexion con la BD");
        }

    }

    
          
    }
