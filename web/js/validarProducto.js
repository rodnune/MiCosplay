function comprueba_extension(archivo) { 
   extensiones_permitidas = new Array(".gif", ".jpg", ".png", ".jpeg", ".bmp"); 
   mierror = ""; 
   if (!archivo) { 
    
      	mierror = "No has seleccionado ningún archivo"; 
   }else{ 
      //recupero la extensión de este nombre de archivo 
      extension = (archivo.substring(archivo.lastIndexOf("."))).toLowerCase(); 
      //alert (extension); 
      //compruebo si la extensión está entre las permitidas 
      permitida = false; 
      for (var i = 0; i < extensiones_permitidas.length; i++) { 
         if (extensiones_permitidas[i] === extension) { 
         permitida = true; 
         break; 
         } 
      } 
      if (!permitida) { 
         mierror = "Comprueba la extensión de los archivos a subir. \nSólo se pueden subir archivos con extensiones: " + extensiones_permitidas.join(); 
      	}else{ 
         	//submito! 
         //alert ("Todo correcto. Voy a submitir el formulario."); 
         //formulario.submit(); 
         return 1; 
      	} 
   } 
   //si estoy aqui es que no se ha podido submitir 
   alert (mierror); 
   return 0; 
}

function validarCategoria(){
   var indice = document.getElementById("categorias").selectedIndex;
    if( indice === null || indice === 0 ) {
            return false;
        }
    }
    
    function validarSubcategoria(){
   var indice = document.getElementById("subcategorias").selectedIndex;
    if( indice === null || indice === 0 ) {
            return false;
        }
    }


function validarProducto(){
    //var exprRegNombre = /^([a-z ñáéíóú]{2,100})$/i;
    var verificar = true;
    var nombre = document.getElementById("nombre");
    var precio = document.getElementById("precio");
    var foto = document.getElementById("foto");
    var descripcion = document.getElementById("localidad");
    if(!nombre.value){
        alert("Introduzca el nombre del producto");
        nombre.focus();
        verificar = false;
    }
    else if(!precio.value){
        alert("Introduzca el precio del producto");
        precio.focus();
        verificar = false;
    }
        
    else if(comprueba_extension(foto)!==1){

        verificar = false;
    }
    
    else if(validarCategoria()){

        verificar = false;
    }
    
    else if(validarSubcategoria()){

        verificar = false;
    }
    
    
    else if(!descripcion.value){
        alert("Introduzca la descripcion del producto");
        descripcion.focus();
        verificar = false;
    }
    
 
    
    
    if(verificar){
  
        //document.registro.submit();
    }
}
