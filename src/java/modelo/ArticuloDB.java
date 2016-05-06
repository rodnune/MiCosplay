package modelo;
import java.sql.*;


public class ArticuloDB {
    
    public static void insertarArticulo(Articulo article) throws SQLException, ClassNotFoundException {

            ConexionBD conexion = ConexionBD.getInstancia();
         
    String query ="INSERT INTO ARTICULO (nombre,nick,precio,estadoArticulo,descripcion,categoria,subcategoria) "
            + "VALUES ('"+article.getNombre() +"', '"+article.getUser().getNick()+"', "+article.getPrecio()+", "
            + "'"+article.getEstadoArticulo()+"', '"+article.getDesc()+"' , '"+article.getCategoria()+"' ,'"+article.getSubcategoria()+"')";
    
            
             conexion.ejecutaUpdate(query);
             conexion.close();

    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{


        Usuario user = new Usuario("mariano","rajoy","sasa","dsad","sass","sassf");
        Articulo art = new Articulo("hola",20.9,"sdgfd","sfef","sdcdf",'R',user);        
            
        insertarArticulo(art);
    
     }
}

  