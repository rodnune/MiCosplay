<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<% Usuario usuario = (Usuario) session.getAttribute("user");%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>MiCosplay</title>

    <!-- Bootstrap core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/commons.css" rel="stylesheet">
    <link href="css/perfil.css" rel="stylesheet">
</head>


    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
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
                        <a class="elemento" href="perfil.jsp"><img class="icono" src="img/perfil.png" alt="profile img"></a>
                    </li>
                    <li>
                        <a class="elemento" href="ajustes.jsp"><img class="icono" src="img/ajustes.png" alt="settings img"></a>
                    </li>
                </ul>
                <form class="navbar-form navbar-right">
                    <input type="text" class="form-control" placeholder="Search...">
                </form </div>
            </div>
    </nav>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 sidebar">
                <ul class="nav">
                    <li>
                        <h4 class="titulo3">Acerca de mí</h4>
                        <p class="parrafo"><%= usuario.getDesc() %></p>
                    </li>
                    <li class="separacion"></li>
                    <li>
                        <h4 class="titulo3"><br>Visitas</h4>
                        <p class="parrafo"><%=usuario.getVisitas() %></p>
                    </li>
                    <li class="separacion"></li>
                </ul>
                <ul class="nav">
                    <li>
                        <h4 class="titulo3"><br>Vende</h4>
                        <ul class="list-group">
                            <a href="modificarArticulo.html" class="list-group-item casilla">GameCube</a>
                            <a href="modificarArticulo.html" class="list-group-item casilla">Traje Rey Mickey</a>
                            <a href="modificarArticulo.html" class="list-group-item casilla">Peluca Genos Onepunch-Man</a>
                        </ul>
                        <a class="btn btn-default btn_detalles" href="crearArticulo.html" role="button">Nuevo</a>
                    </li>
                    <li class="separacion"></li>
                    <li>
                        <h4 class="titulo3"><br>Encarga</h4>
                        <ul class="list-group">
                            <a href="modificarArticulo.html" class="list-group-item casilla active">Llave-Espada de Sora</a>
                            <a href="modificarArticulo.html" class="list-group-item casilla">Traje Onepunch-Man</a>
                        </ul>
                        <a class="btn btn-default btn_detalles" href="crearArticulo.html" role="button">Nuevo</a>
                    </li>
                    <li class="separacion"></li>
                </ul>
                <ul class="nav">
                    <li>
                        <h4 class="titulo3"><br>Seguidores</h4>
                        <div class="row placeholders">
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                        </div>
                    </li>
                    <li class="separacion"></li>
                    <li>
                        <h4 class="titulo3"><br>Sigue</h4>
                        <div class="row placeholders">
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                            <div class="col-sm-3 placeholder">
                                <a href="#"><img class="user-thumb" src="img/user_thumb.png" alt="user-thumb"></a>
                            </div>
                    </li>
                </ul>
                </div>
                <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9 left main">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <div class="row placeholders">
                            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3 placeholder">
                                <img src="<%= usuario.getImagen().getPath() %>" name="fotoperfil" id="fotoperfil" class= "img-user" alt="userphoto" />
                            </div>
                            <div class="titulo col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                <h1><%= usuario.getNick() %></h1>
                            </div>

                        </div>
                        <div class="opciones row">
                            <div class="opciones-tamano_1">
                                <a href="fotosPerfil.html" class="estilo_menu">Fotos</a>
                            </div>
                            <div class="opciones-tamano_1">
                                <a href="tutoriales.html" class="estilo_menu">Tutoriales</a>
                            </div>
                            <div class="opciones-tamano_1">
                                <a href="#" class="estilo_menu">Foro</a>
                            </div>
                            <div class="opciones-tamano_1">
                                <a href="#" class="estilo_menu">Vende</a>
                            </div>
                            <div class="opciones-tamano_1">
                                <a href="#" class="estilo_menu">Encarga</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <h2 class="sub-header eventos">Eventos</h2>

                        <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                            <img class="img-circle img-medium" src="img/people.jpg" alt="Generic placeholder image">
                            <h3 class="text-muted">Quedada Gamer</h3>
                            <p>La quedada tendrá lugar en la plaza portugalete a las 12:30. Habrá diversas carpas con máquinas recreativas y consolas. Se organizarán mini-campeonatos y se realizará una entrega de premios.</p>
                            <p><a class="btn btn-default btn_detalles" href="eventosReuniones.html" role="button">Más detalles</a></p>
                        </div>
                        <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                            <img class="img-circle img-medium" src="img/EventosYConcursos/Eventos/Salones/eventosalonleon.png" alt="Generic placeholder image">
                            <h3 class="text-muted">Level Up Leon</h3>
                            <p>Jornadas de Manganime, Cómic
                            Juegos de Mesa, Rol y Videojuegos</p>
                            <p><a class="btn btn-default btn_detalles" href="eventosSalones.html" role="button">Más detalles</a></p>
                        </div>
                        <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                            <img class="img-circle img-medium" src="img/EventosYConcursos/Eventos/Reuniones/jjba.png" alt="Generic placeholder image">
                            <h3 class="text-muted">Asociación Joe Stars</h3>
                            <p>La asociación JOE STAR próximamente se reunirá para ver en grupo el nuevo capítulo de su serie favorita previa presentación de los nuevos integrantes que se han unido recientemente. </p>
                            <p><a class="btn btn-default btn_detalles" href="eventosReuniones.html" role="button">Más detalles</a></p>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
                            <h2 class="featurette-heading">Expomanga Madrid 2016</h2>
                            <p class="lead">¡Os presentamos la nueva web de Expomanga! Aquí podréis encontrar toda la información necesaria para visitar nuestro próximo Salón, que se celebrará los días 6, 7 y 8 de Mayo en el Pabellón 12 de IFEMA – Feria de Madrid. ¡Se acabaron los problemas de acceso, las largas colas y esperas! Tendremos más espacio, más actividades, espectáculo e invitados… ¡más de todo!</p>
                            <p><a class="btn btn-default btn_detalles" href="eventosSalones.html" role="button">Más información</a></p>
                        </div>
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                            <img class="img-responsive center-block event-image" alt="event-image" src="img/expomanga.png" data-holder-rendered="true">
                        </div>
                    </div>

                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <h2 class="sub-header concursos">Concursos</h2>
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                            <img class="img-responsive center-block event-image" alt="event-image" src="img/kingdom.png">
                        </div>

                        <div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
                            <h2 class="featurette-heading">XI. Certamen de Kingdom Hearts</h2>
                            <p class="lead">¿Quieres averiguar que eres el mayor fan de la saga? ¿Cuánto sabes de ella? Demuestra que no tienes rival durante los días 11 y 12 de mayo. Podrás conocer a todas las estrellas de la saga y pondremos a prueba tu conocimiento sobre ella. Apúntate ya.</p>
                            <p><a class="btn btn-default btn_detalles" href="concursos.html" role="button">Más información</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>



</html>
