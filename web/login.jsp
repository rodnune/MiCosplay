<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<% Usuario usuario = (Usuario) session.getAttribute("user");
if(usuario!=null){

    response.sendRedirect(redirectURL);

}
%>

<!DOCTYPE html>

<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MiCosplay</title>

        <!-- Bootstrap core CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/commons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

        <meta charset="UTF-8">
    </head>

    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="inicio.html"><img class="navbar-brand" src="img/logotipo.png" alt="image logo"></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="elemento" href="#"><img class="icono" src="img/perfil.png" alt="profile img"></a>
                        </li>
                        <li>
                            <a class="elemento" href="#"><img class="icono" src="img/ajustes.png" alt="settings img"></a>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Search...">
                    </form> </div>
            </div>
        </nav>

        <div class="row">
            <form action="LoginServlet" method="post" class="inicio_sesion">
                <h1>Login</h1>
                <div class="form-group">
                    <label for="exampleInputText1">Nick:</label>
                    <input type="text" name="nick" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Contraseña:</label>
                    <input type="password" name="password" class="form-control" required>
                </div>
                <input type="submit" value="Entrar">
                <input type="button" value="Registrarse" onclick="window.location = 'inicio.html'" />   
            </form>
        </div>
    </body>

</html>
