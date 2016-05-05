
import java.sql.*;
import modelo.ConnectionPool;
import modelo.Usuario;

public class UsuarioDB {
    public static int insertarUsuario(Usuario user) {
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    String query ="INSERT INTO USUARIO (nombre,apellidos,nick,localidad,email,visitas,passemail,password) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellidos());
            ps.setString(3, user.getNick());
            ps.setString(4, user.getLocalidad());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getVisitas());
            ps.setString(7, user.getPassEmail());
            ps.setString(8, user.getPass());
            int res = ps.executeUpdate();
            ps.close();
            pool.freeConnection(connection);
            return res;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    
    }
}
