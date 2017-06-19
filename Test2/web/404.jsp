<%-- 
    Document   : 404
    Created on : Jun 19, 2017, 12:46:04 PM
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
    <link rel="stylesheet" href="Test2/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora">
    <link rel="stylesheet" href="Test2/assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="Test2/assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="Test2/assets/css/Article-Clean.css">
    <link rel="stylesheet" href="Test2/assets/css/Article-List.css">
    <link rel="stylesheet" href="Test2/assets/css/Carousel-Hero.css">
    <link rel="stylesheet" href="Test2/assets/css/Footer-Dark.css">
    <link rel="stylesheet" href="Test2/assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="Test2/assets/css/Navigation-with-Button1.css">
    <link rel="stylesheet" href="Test2/assets/css/Projects-Horizontal.css">
    <link rel="stylesheet" href="Test2/assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="Test2/assets/css/styles.css">
    <link rel="stylesheet" href="Test2/assets/css/Team-Boxed.css">
</head>

<body>
    <nav class="navbar navbar-default navigation-clean-button">
        <div class="container">
            <div class="navbar-header"><a class="navbar-brand navbar-link" href="#">Proyecto LEGACY - Landing</a>
                <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
            </div>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav">
                    <li class="active" role="presentation"><a href="index.jsp">Inicio </a></li>
                    <li role="presentation"><a href="noticias.jsp">Noticias </a></li>
                </ul>
                <p class="navbar-text navbar-right actions"><a class="navbar-link login" href="login.jsp">Entrar </a> <a class="btn btn-default action-button" role="button" href="#">Registro </a></p>
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="boletin.jsṕ">Boletín de Proyectos</a></li>
                    <li role="presentation"><a href="#">Talleres</a></li>
                </ul>
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="https://tree.taiga.io/discover">LEGACY-Taiga </a></li>
                    <li role="presentation"><a href="https://try.gogs.io/explore/repos">LEGACY-GOGS </a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="carousel slide" data-ride="carousel" id="carousel-1">
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <div class="jumbotron hero-nature carousel-hero">
                    <h1 class="hero-title">Error 404</h1>
                    <p class="hero-subtitle">La página que intentaste acceder no se encuentra disponible.</p>
                    <p><a class="btn btn-primary btn-lg hero-button" role="button" href="index.jsp">Volver </a></p>
                </div>
            </div>
        </div>
        <div><a class="left carousel-control" href="#carousel-1" role="button" data-slide="prev"><span class="sr-only">Previous</span></a><a class="right carousel-control" href="#carousel-1" role="button" data-slide="next"><span class="sr-only">Next</span></a></div>
        <ol
        class="carousel-indicators">
            <li data-target="#carousel-1" data-slide-to="0" class="active"></li>
            </ol>
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
    <script src="Test2/assets/js/jquery.min.js"></script>
    <script src="Test2/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="Test2/assets/js/bs-animation.js"></script>
</body>

</html>
