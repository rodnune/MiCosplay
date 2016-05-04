function validarForm(){
    //var exprRegNombre = /^([a-z ñáéíóú]{2,100})$/i;
    //var exprRegMail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/
    var verificar = true;
    var nombre = document.getElementById("nombre");
    var apellidos = document.getElementById("apellidos");
    var nick = document.getElementById("nick");
    var localidad = document.getElementById("localidad");
    var email = document.getElementById("email");
    var vEmail = document.getElementById("email2");
    var pass = document.getElementById("pass");
    var vPass = document.getElementById("pass2");
    if(!nombre.value){
        alert("Introduzca su nombre");
        nombre.focus();
        verificar = false;
    }
    else if(!apellidos.value){
        alert("Introduzca sus apellidos");
        nombre.focus();
        verificar = false;
    }
    else if(!nick.value){
        alert("Introduzca su nick");
        nombre.focus();
        verificar = false;
    }
    else if(!localidad.value){
        alert("Introduzca la localidad a la que pertenece");
        nombre.focus();
        verificar = false;
    }
     else if(!email.value){
        alert("Introduzca su email");
        nombre.focus();
        verificar = false;
    }
    else if(!vEmail.value){
        alert("Introduzca la contraseña de su correo");
        nombre.focus();
        verificar = false;
    }
    else if(!pass.value){
        alert("Introduzca una contraseña para su cuenta");
        nombre.focus();
        verificar = false;
    }
    
    else if(!vPass.value || vPass.value!==pass.value){
        alert("La contraseña no coincide");
        nombre.focus();
        verificar = false;
    }
    
    if(verificar){
        alert("Se ha enviado el formulario");
        //document.registro.submit();
    }
}