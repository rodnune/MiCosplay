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
    
    public static ResultSet getUsuario(String nick, String password) throws SQLException, ClassNotFoundException {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
        PreparedStatement pst = conn.prepareStatement("Select * from USUARIO where NICK=? and PASSWORD=?");
        pst.setString(1, nick);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        
        return rs;
        
    }
    
    
    
    public static boolean comprobarNick(String nick, String password) throws SQLException, ClassNotFoundException {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
        PreparedStatement pst = conn.prepareStatement("Select NICK,PASSWORD from USUARIO where NICK=? and PASSWORD=?");
        pst.setString(1, nick);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return true;
        }
        else {
            return false;
            
            
        }
        
        
    }
    
    public static void actualizarPassword(String nick,String newPass) throws SQLException, ClassNotFoundException {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
         String query = "UPDATE USUARIO SET PASSWORD = ? WHERE NICK = ?";
    PreparedStatement ps = conn.prepareStatement(query);
    ps.setString(1, newPass);
    ps.setString(2, nick);
        ps.executeUpdate();
        conn.close();
        
        
        
    }
    
}

  