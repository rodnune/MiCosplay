  function validarAjustes(){
       var passAct = document.getElementById("password");
       var pass1 = document.getElementById("newPassword");
       var pass2= document.getElementById("newPassword2");
       
    if(passAct.value===pass1.value){
         alert("La nueva contraseña debe ser distinta a la actual");
    }
   else if(pass1.value!==pass2.value){
        alert("La contraseña introducida debe coincidir en ambos campos");
        pass1.focus();
        pass2.focus();
  }else{
      alert("Se han realizado los cambios");
  }
}
    
