package modelo;

<<<<<<< HEAD

=======
>>>>>>> origin/master
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;

public class ConnectionPool {

<<<<<<< HEAD
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/MiCosplayDB");
=======
    private static ConnectionPool pool
            = null;
    private static DataSource dataSource
            = null;

    private ConnectionPool() {
        try {
            InitialContext ic
                    = new InitialContext();
            dataSource
                    = (DataSource) ic.lookup("java:/comp/env/jdbc/MiCosplayDB");
>>>>>>> origin/master
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConnectionPool getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }

<<<<<<< HEAD
    public void freeConnection(Connection c) {
=======
    public void freeConnection(
                    Connection c
            ) {
>>>>>>> origin/master
        try {
            c.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
<<<<<<< HEAD
=======


>>>>>>> origin/master
