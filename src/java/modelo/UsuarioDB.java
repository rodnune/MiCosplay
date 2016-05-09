package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDB {
    
    public static void insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException {
        ConnectionPool pool= ConnectionPool.getInstance();
        Connection conn= pool.getConnection();
        Statement stmt = conn.createStatement();
        String query ="INSERT INTO USUARIO (nombre,apellidos,nick,descripcion,localidad,email,visitas,password) "
                + "VALUES ('"+user.getNombre() +"', '"+user.getApellidos()+"', '"+user.getNick()+"', '"+user.getDesc()+"', '"
                + ""+user.getLocalidad()+"', '"+user.getEmail()+"', "+user.getVisitas()+", "
                + "'"+user.getPass()+"')";
        
        stmt.executeUpdate(query);
        pool.freeConnection(conn);
        
    }
    
    public static ResultSet getUsuario(String nick, String password) throws SQLException, ClassNotFoundException {
        
        ConnectionPool pool= ConnectionPool.getInstance();
        Connection conn= pool.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select * from USUARIO where NICK=? and PASSWORD=?");
        pst.setString(1, nick);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        pool.freeConnection(conn);
        return rs;
        
    }
    
    
    
    public static boolean comprobarNick(String nick, String password) throws SQLException, ClassNotFoundException {
        
        
        ConnectionPool pool= ConnectionPool.getInstance();
        Connection conn= pool.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select NICK,PASSWORD from USUARIO where NICK=? and PASSWORD=?");
        pst.setString(1, nick);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            pool.freeConnection(conn);
            return true;
        }
        else {
            pool.freeConnection(conn);
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

  