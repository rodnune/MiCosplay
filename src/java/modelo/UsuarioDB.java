package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDB {

    public static void insertarUsuario(Usuario user) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        Statement stmt = conn.createStatement();

        PreparedStatement ps;
        ps = conn.prepareStatement("insert into usuario(nombre,apellidos,nick,descripcion,localidad,email,visitas,password) values(?,?,?,?,?,?,?,?)");
        ps.setString(1, user.getNombre());
        ps.setString(2, user.getApellidos());
        ps.setString(3, user.getNick());
        ps.setString(4, user.getDesc());
        ps.setString(5, user.getLocalidad());
        ps.setString(6, user.getEmail());
        ps.setInt(7, user.getVisitas());
        ps.setString(8, user.getPass());
        ps.executeUpdate();

        pool.freeConnection(conn);

    }

    public static Usuario getUsuario(Object nickuser) throws SQLException, ClassNotFoundException, IOException {

        String nick = (String) nickuser;
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select * from USUARIO where NICK=?");
        pst.setString(1, nick);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Usuario usuario = new Usuario(rs.getString("NOMBRE"), rs.getString("APELLIDOS"), rs.getString("NICK"), rs.getString("DESCRIPCION"), rs.getString("LOCALIDAD"),rs.getInt("VISITAS"));
            pool.freeConnection(conn);
            return usuario;
        }
        pool.freeConnection(conn);
        return null;
    }

    public static boolean comprobarNick(String nick, String password) throws SQLException, ClassNotFoundException {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select NICK,PASSWORD from USUARIO where NICK=? and PASSWORD=?");
        pst.setString(1, nick);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            pool.freeConnection(conn);
            return true;
        } else {
            pool.freeConnection(conn);
            return false;

        }

    }

    public static void actualizarPassword(String nick, String newPass) throws SQLException, ClassNotFoundException {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        String query = "UPDATE USUARIO SET PASSWORD = '" + newPass + "' WHERE NICK = '" + nick + "'";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        pool.freeConnection(conn);;

    }

    public static void actualizarDescripcion(String nick, String newDesc) throws SQLException, ClassNotFoundException {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        String query = "UPDATE USUARIO SET DESCRIPCION = '" + newDesc + "' WHERE NICK = '" + nick + "'";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        pool.freeConnection(conn);


        
    }
   
}

  