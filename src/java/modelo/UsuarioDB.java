package modelo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDB {
    
    public static void insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
        Statement stmt = conn.createStatement();
       
          PreparedStatement ps;
    ps = conn.prepareStatement("insert into usuario(nombre,apellidos,nick,descripcion,fotoperfil,localidad,email,visitas,password) values(?,?,?,?,?,?,?,?,?)");
    ps.setString(1, user.getNombre());
    ps.setString(2, user.getApellidos());
    ps.setString(3, user.getNick());
    ps.setString(4, user.getDesc());
    FileInputStream fis = null;
    fis = new FileInputStream(user.getImagen());
   ps.setBinaryStream(5,fis,fis.available());
    ps.setString(6, user.getLocalidad());
    ps.setString(7, user.getEmail());
    ps.setInt(8, user.getVisitas());
    ps.setString(9, user.getPass());
       ps.executeUpdate();
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
         String query = "UPDATE USUARIO SET PASSWORD = '"+newPass+"' WHERE NICK = '"+nick+"'";
         Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
        
        
        
    }
    
    public static void actualizarDescripcion(String nick,String newDesc) throws SQLException, ClassNotFoundException {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay");
         String query = "UPDATE USUARIO SET DESCRIPCION = '"+newDesc+"' WHERE NICK = '"+nick+"'";
         Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
        
        
        
    }
   
}

  