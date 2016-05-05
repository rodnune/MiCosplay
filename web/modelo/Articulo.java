
public class Articulo {
    


    private String nombre;
    private double precio;
    private String desc;
    private String categoria;
    private char estadoArticulo;
    
    
    public Articulo(String nombre,double precio,String desc,String categoria,char estadoArticulo){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.desc = desc;
        this.estadoArticulo = estadoArticulo;
        
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public char getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(char estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }
}
