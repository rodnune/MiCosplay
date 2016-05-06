function validarRegistro(){
    var nombre = document.getElementById("nombre");
    var apellidos = document.getElementById("apellidos");
    var nick = document.getElementById("nick");
    var localidad = document.getElementById("localidad");
    var email = document.getElementById("email");
    var vemail = document.getElementById("email2");
    var password = document.getElementById("pass");
    var vpassword = document.getElementById("pass2");
    if(!nombre.value){
        alert("Introduzca su nombre");
        nombre.focus();
        return false;
    }
    else if(!apellidos.value){
        alert("Introduzca sus apellidos");
        nombre.focus();
        return false;
    }
    else if(!nick.value){
        alert("Introduzca su nick");
        nombre.focus();
        return false;;
    }
    else if(!localidad.value){
        alert("Introduzca la localidad a la que pertenece");
        nombre.focus();
        return false;
    }
     else if(!email.value){
        alert("Introduzca su email");
        nombre.focus();
        return false;
    }
    else if(email.value!==vemail.value){
        alert("Los dos campos del correo han de ser iguales");
        nombre.focus();
        return false;
    }
    else if(!password.value){
        alert("Introduzca su contraseña");
        nombre.focus();
        return false;
    }
     else if(password.value!==vpassword.value){
        alert("Los dos campos del correo han de ser iguales");
        nombre.focus();
        return false;
    }
   

    
    alert("Se ha enviado el formulario");
    return true;
   
}