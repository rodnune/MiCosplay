package modelo;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String nick;
    private String localidad;
    private File imagen;
    private String email;
    private String desc;
    private int visitas;
    private String pass;
    
    public Usuario(String nick,String pass) {
        this.nick = nick;     
        this.pass = pass;
    }
     public Usuario(String nombre, String apellidos,String nick,
             String localidad,String email,String pass) throws SQLException, ClassNotFoundException, IOException{
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nick = nick;
        this.localidad = localidad;
        this.email = email;
        this.desc = "";
        this.visitas = 0;
        this.pass = pass;
        UsuarioDB.insertarUsuario(this);
    }

    public Usuario(String nombre, String apellidos, String nick,
            String desc, String localidad, int visitas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nick = nick;
        this.desc = desc;
        this.localidad = localidad;
        this.localidad = localidad;
        this.email = email;
        this.visitas = visitas;


      }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    } 
    
}
