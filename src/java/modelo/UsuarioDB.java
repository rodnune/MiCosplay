package modelo;
import java.sql.*;


public class UsuarioDB {
    
    public static void insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException {

            ConexionBD conexion = ConexionBD.getInstancia();
       
    String query ="INSERT INTO USUARIO (nombre,apellidos,nick,localidad,email,visitas,password) "
            + "VALUES ('"+user.getNombre() +"', '"+user.getApellidos()+"', '"+user.getNick()+"', '"
            + ""+user.getLocalidad()+"', '"+user.getEmail()+"', "+user.getVisitas()+", "
            + "'"+user.getPass()+"')";
            
             conexion.ejecutaUpdate(query);
             conexion.close();

    }
    
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
            
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
       
        System.out.println(comprobarUsuario("sasa", "sassf"));
    }
    
    
}

  