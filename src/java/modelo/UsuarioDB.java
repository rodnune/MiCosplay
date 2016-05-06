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
        
     
    
     }

  