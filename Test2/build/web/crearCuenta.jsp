<%-- 
    Document   : crearCuenta
    Created on : Jun 19, 2017, 10:28:53 PM
    Author     : jordan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>legacy-landing</title>
    <%-- linea necesaria para agregar bootstrap --%>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/Article-Clean.css">
    <link rel="stylesheet" href="assets/css/Article-List.css">
    <link rel="stylesheet" href="assets/css/Carousel-Hero.css">
    <link rel="stylesheet" href="assets/css/Footer-Dark.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="assets/css/Navigation-with-Button1.css">
    <link rel="stylesheet" href="assets/css/Projects-Horizontal.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <link rel="stylesheet" href="assets/css/Team-Boxed.css">
</head>

<body>
    <nav class="navbar navbar-default navigation-clean-button">
        <div class="container">
            <div class="navbar-header"><a class="navbar-brand navbar-link" href="index.jsp"><img src="assets/img/citt.png" alt="" height="480" width="960"/></a>
                <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
            </div>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="index.jsp">Inicio </a></li>
                    <li role="presentation"><a href="noticias.jsp">Noticias </a></li>
                </ul>
                <p class="navbar-text navbar-right actions"><a class="navbar-link login" href="login.jsp">Entrar </a> <a class="btn btn-default action-button" role="button" href="crearCuenta.jsp">Registro </a></p>
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="boletin.jsp">Boletín de Proyectos</a></li>
                    <li role="presentation"><a href="controllerListarWorkshop">Talleres</a></li>
                </ul>
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="https://tree.taiga.io/discover">LEGACY-Taiga </a></li>
                    <li role="presentation"><a href="https://try.gogs.io/explore/repos">LEGACY-GOGS </a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="register-photo">
        <div class="form-container">
            <div class="image-holder"></div>
            <form action="<c:url value="/controllerCrearCuenta" />" method="post">
               
                <h2 class="text-center"><strong>Creación de cuenta de usuario</strong></h2>
                <h3 class="text-center">Datos de la cuenta</h3>
                <div class="form-group" >
                    <input class="form-control" type="email" name="user-name" placeholder="Nombre de Usuario">
                </div>
                <div class="form-group" > 
                    <input class="form-control" type="password" name="password" placeholder="Contraseña">
                </div>
                <div class="form-group" >
                    <input class="form-control" type="password" name="password-repeat" placeholder="Contraseña (Repetir)">
                </div>
                <h3 class="text-center">Datos Personales</h3>
                <div class="form-group" >
                    <input class="form-control" type="text" name="rut" placeholder="RUT">
                </div>
                <div class="form-group" >
                    <input class="form-control" type="text" name="nombre" placeholder="Nombre Completo">
                </div>
                <div class="form-group" >
                    <input class="form-control" type="text" name="apelpat" placeholder="Apellido Paterno">
                </div>
                <div class="form-group" >
                    <input class="form-control" type="text" name="apelmat" placeholder="Apellido Materno">
                </div>
                 <div  class="form-group" >
                     <text> Carrera :  </text>
                     <select required name="carrera">
                         <option value="seleccione">Seleccione..</option>
                         <c:forEach var="v" items="${carreras}">
                            <option value="<c:out value="${v.getIdCarrera()}"/>"><c:out value="${v.getNombre()}"/></option>                            
                         </c:forEach>   
                    </select>
                </div>
                <div  class="form-group" >
                     <text> Track :  </text>
                     <select required name="track">
                         <option value="0">Seleccione..</option>
                         <c:forEach var="t" items="${tracks}">
                            <option value="<c:out value="${t.getIdTrack()}"/>"><c:out value="${t.getNombre()}"/></option>                            
                         </c:forEach>   
                    </select>
                </div>
                
                
                
                
                
                <div class="form-group">
                    <div class="checkbox">
                        <label class="control-label">
                            <input type="checkbox">Estoy de acuerdo con las condiciones de uso.</label>
                    </div>
                </div>
                <div class="form-group">
                    <button class="btn btn-primary btn-block" type="submit" style="background-color:rgb(43,133,0);max-width:50%;">Registrar Cuenta</button>
                </div><a href="login.jsp" class="already">¿Ya tienes una cuenta? Entra aquí..</a></form>
        </div>
             
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>

