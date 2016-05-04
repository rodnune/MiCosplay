
public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String password;
    private String nick;
    private String email;
    private int visitas;
    private String localidad;
    
    public Usuario(String nombre,String apellidos,String password
            ,String nick,String email,int visitas,String localidad){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
        this.nick = nick;
        this.email = email;
        this.visitas = visitas;
        this.localidad = localidad;
    }
    
    
}
