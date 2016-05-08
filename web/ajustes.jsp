

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>MiCosplay</title>

  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
  <link href="css/commons.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
   <script src="js/validarAjustes.js"></script>
</head>

<body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a href="inicio.html"><img class="navbar-brand" src="img/logotipo.png" alt="image logo"></a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
          <li>
            <a class="elemento" href="perfil.html"><img class="icono" src="img/perfil.png" alt="profile img"></a>
          </li>
          <li>
            <a class="elemento" href="#"><img class="icono" src="img/ajustes.png" alt="settings img"></a>
          </li>
        </ul>
        <form class="navbar-form navbar-right">
          <input type="text" class="form-control" placeholder="Search...">
        </form>
      </div>
    </div>
  </nav>
  <!--Modificar detalles del perfil-->
  <div class="container main">
    <h2>Ajustes del perfil</h2>
    <form id="ajustes" action="AjustesServlet" method="post" onsubmit="return validarAjustes()">
      <div class="form-group">
        <label for="fotoPerfil">Cambiar foto de perfil</label>
        <input type="file" id="fotoNueva">
      </div>

      <div class="form-group">
        <label>Modificar descripción</label>
        <textarea class="form-control" rows="3" name="nDescription" id="nDescription" placeholder="Nueva descripcion"></textarea>
      </div>
      <div class="form-group">
        <label>Introduzca la contraseña actual</label>
        <input type="password" class="form-control" id="password" placeholder="Actual contraseña" required>
      </div>

      <div class="form-group">
        <label>Introduzca la nueva contraseña</label>
        <input type="password" class="form-control" name="newPassword" id="newPassword" placeholder="Nueva contraseña" required>
      </div>

      <div class="form-group">
        <label>Introduzca de nuevo la nueva contraseña</label>
        <input type="password" class="form-control" id="newPassword2" placeholder="Nueva contraseña" required>
      </div>

      <p><input type="submit" role="button" value="Guardar cambios"><a class="btn btn-default btn_detalles" href="#" role="button">Cancelar</a><a href="registro.html">¿No recuerda su actual contraseña?</a></p>
    </form>
  </div>
</body>

</html>
