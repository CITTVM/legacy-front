<%-- 
    Document   : noticias
    Created on : Jun 19, 2017, 1:00:36 PM
    Author     : jordan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>legacy-landing</title>
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
            <div class="navbar-header"><a class="navbar-brand navbar-link" href="#"><img src="assets/img/citt.png" alt="" height="480" width="960"/></a>
                <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
            </div>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav">
                    <li class="active" role="presentation"><a href="index.jsp">Inicio </a></li>
                    <li class="active" role="presentation"><a href="noticias.jsp">Noticias </a></li>
                </ul>
                <p class="navbar-text navbar-right actions"><a class="navbar-link login" href="login.html">Entrar </a> <a class="btn btn-default action-button" role="button" href="crearCuenta.jsp">Registro </a></p>
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
    <div data-bs-parallax-bg="true" style="height:500px;background-image:url(https://unsplash.it/1800/900?image=1051);background-position:center;background-size:cover;">
        <div class="container">
            <div class="jumbotron" style="margin-top:149px;background-color:rgba(238,238,238,0.7);">
                <h1 class="text-center" style="margin-right:0px;margin-left:0px;">Noticias Principales</h1></div>
        </div>
    </div>
    <div class="article-list">
        <div class="container">
            <div class="intro"></div>
            <div class="row articles">
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="img/desk.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div
                class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="img/building.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
            <div
            class="col-md-4 col-sm-6 item">
                <a href="#"><img class="img-responsive" src="img/loft.jpg"></a>
                <h3 class="name">Article Title</h3>
                <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
    </div>
    </div>
    </div>
    <div class="article-list">
        <div class="container">
            <div class="row articles">
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="img/desk.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div
                class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="img/building.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
            <div
            class="col-md-4 col-sm-6 item">
                <a href="#"><img class="img-responsive" src="img/loft.jpg"></a>
                <h3 class="name">Article Title</h3>
                <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
    </div>
    </div>
    </div>
    <div class="footer-dark">
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-push-6 item text">
                        <h3>CITT Viña del Mar</h3>
                        <p>Estamento extracurricular para el desarrollo de soluciones para necesidades internas o externas para la vinculación con el medio, tambien para la realización de investigación de nuevas tecnologias para la formación excepcional
                            de los integrantes del CITT.</p>
                    </div>
                    <div class="col-md-3 col-md-pull-6 col-sm-4 item">
                        <h3>Especialidades </h3>
                        <ul>
                            <li><a href="#">Desarrollo Web</a></li>
                            <li><a href="#">Desarrollo de Videojuegos</a></li>
                            <li><a href="#">Desarrollo Móvil</a></li>
                            <li><a href="#">Domótica</a></li>
                            <li><a href="#">Robótica </a></li>
                            <li><a href="#">Desarrollo de Aplicaciones</a></li>
                        </ul>
                    </div>
                    <div class="col-md-3 col-md-pull-6 col-sm-4 item">
                        <h3>Acerca</h3>
                        <ul>
                            <li>CITT </li>
                            <li><a href="#">Capitanes </a></li>
                            <li><a href="#">Tracks de Desarrollo</a></li>
                        </ul>
                    </div>
                    <div class="col-md-12 col-sm-4 item social"><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a></div>
                </div>
                <p class="copyright">Centro de Innovación y Transferencia Tecnológica Sede Viña del Mar © 2017</p>
            </div>
        </footer>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>