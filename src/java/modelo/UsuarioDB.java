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
    
<<<<<<< HEAD
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
=======
    public static boolean comprobarUsuario(String nick,String pass) throws SQLException, ClassNotFoundException {

            ConexionBD conexion = ConexionBD.getInstancia();
           
    String query =  "SELECT NICK,PASSWORD FROM USUARIO U WHERE U.NICK = '"+nick+"' AND U.PASSWORD = '"+pass+"' ";
             ResultSet rs = conexion.ejecutaRecuperacion(query);
             if ( rs!=null && rs.next() ){ 
                 conexion.close();
                    return true;
                    }else{
                 conexion.close();
                return false;
             }
            
    }
    
    public static boolean comprobarNick(String nick) throws SQLException, ClassNotFoundException {

            ConexionBD conexion = ConexionBD.getInstancia();
           
    String query =  "SELECT NICK,PASSWORD FROM USUARIO U WHERE U.NICK = '"+nick+"' ";
             ResultSet rs = conexion.ejecutaRecuperacion(query);
             if ( rs!=null && rs.next() ){ 
                 conexion.close();
                    return true;
                    }else{
                 conexion.close();
                return false;
             }
>>>>>>> origin/master
            
            
            
        }
        
        
    }
    
<<<<<<< HEAD
=======
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
       
        System.out.println(comprobarUsuario("sasa", "sassf"));
    }
    
    
>>>>>>> origin/master
}

  