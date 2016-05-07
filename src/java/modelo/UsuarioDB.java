package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDB {
    
    public static void insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
        Statement stmt = conn.createStatement();
        String query ="INSERT INTO USUARIO (nombre,apellidos,nick,localidad,email,visitas,password) "
                + "VALUES ('"+user.getNombre() +"', '"+user.getApellidos()+"', '"+user.getNick()+"', '"
                + ""+user.getLocalidad()+"', '"+user.getEmail()+"', "+user.getVisitas()+", "
                + "'"+user.getPass()+"')";
        
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
        
    }
    
    
    public static boolean comprobarNick(String email, String password) throws SQLException, ClassNotFoundException {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
        PreparedStatement pst = conn.prepareStatement("Select EMAIL,PASSWORD from USUARIO where EMAIL=? and PASSWORD=?");
        pst.setString(1, email);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return true;
        }
        else {
            return false;
            
            
        }
        
        
    }
    
}

  