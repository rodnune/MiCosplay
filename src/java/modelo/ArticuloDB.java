package modelo;
import java.sql.*;


public class ArticuloDB {
    
    public static void insertarArticulo(Articulo article) throws SQLException, ClassNotFoundException {

            Class.forName("org.apache.derby.jdbc.ClientDriver");
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiCosplayDB", "root", "cosplay")) {
            Statement stmt = conn.createStatement();
            String query ="INSERT INTO ARTICULO (nombre,nick,precio,estadoArticulo,descripcion,categoria,subcategoria) "
                    + "VALUES ('"+article.getNombre() +"', '"+article.getUser().getNick()+"', " +article.getPrecio()+", '"+article.getEstadoArticulo()+"', '"+article.getDesc()+"' , '"+article.getCategoria()+"' ,'"+article.getSubcategoria()+"')";
            
            stmt.executeUpdate(query);
            stmt.close();
        }

    }
    
}

  