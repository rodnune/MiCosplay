package modelo;
import java.sql.*;


public class UsuarioDB {
    
    public static int insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException {

            ConexionBD conexion = ConexionBD.getInstancia();
       
    String query ="INSERT INTO USUARIO (nombre,apellidos,nick,localidad,email,visitas,passemail,password) "
            + "VALUES ('"+user.getNombre() +"', '"+user.getApellidos()+"', '"+user.getNick()+"', '"
            + ""+user.getLocalidad()+"', '"+user.getEmail()+"', "+user.getVisitas()+", "
            + "'"+user.getPassEmail()+"', '"+user.getPass()+"')";
            
             conexion.ejecutaUpdate(query);
             conexion.close();

            
       return 0;
    }
        
     
    
     }

  

