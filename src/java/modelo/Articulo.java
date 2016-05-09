package modelo;

public class Articulo {
    


    private String nombre;
    private double precio;
    private String desc;
    private String categoria;
    private String subcategoria;
    private char estadoArticulo;
    private Usuario user;

    
   
    public Articulo(String nombre,double precio,String desc,String categoria,String subcategoria,
            char estadoArticulo,Usuario user){
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.estadoArticulo = 'D';
        this.user = user;
        
        this.user = user;
        
        
    }
    
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
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
    
    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }
}
