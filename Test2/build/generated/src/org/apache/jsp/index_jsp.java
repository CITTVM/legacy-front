package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>legacy-landing</title>\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lora\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Article-Clean.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Article-List.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Carousel-Hero.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Footer-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Navigation-with-Button1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Projects-Horizontal.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Registration-Form-with-Photo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Team-Boxed.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <nav class=\"navbar navbar-default navigation-clean-button\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\"><a class=\"navbar-brand navbar-link\" href=\"#\">Proyecto LEGACY - Landing</a>\n");
      out.write("                    <button class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\" role=\"presentation\"><a href=\"index.jsp\">Inicio </a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"noticias.jsp\">Noticias </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p class=\"navbar-text navbar-right actions\"><a class=\"navbar-link login\" href=\"login.jsp\">Entrar </a> <a class=\"btn btn-default action-button\" role=\"button\" href=\"crearCuenta.jsp\">Registro </a></p>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li role=\"presentation\"><a href=\"boletin.jsp\">Boletín de Proyectos</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#\">Talleres</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li role=\"presentation\"><a href=\"https://tree.taiga.io/discover\">LEGACY-Taiga </a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"https://try.gogs.io/explore/repos\">LEGACY-GOGS </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <div data-bs-parallax-bg=\"true\" style=\"height:500px;background-image:url(https://unsplash.it/1800/900?image=1051);background-position:center;background-size:cover;\">\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"jumbotron\" style=\"margin-top:100px;background-color:rgba(238,238,238,0.7);\">\n");
      out.write("                    <h1>Noticias </h1>\n");
      out.write("                    <p>Noticias y Actualidad del Centro de Innovación y Transferencia Tecnológica de la sede Viña del Mar.</p>\n");
      out.write("                    <p><a class=\"btn btn-default\" role=\"button\" href=\"#\">Saber Más</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"team-boxed\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"intro\">\n");
      out.write("                <h2 class=\"text-center\">Capitanes del CITT</h2>\n");
      out.write("                <p class=\"text-center\">Integrantes especializados en variadas disciplinas que trabajan con la tecnología y la innovación.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row people\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6 item\">\n");
      out.write("                    <div class=\"box\"><img class=\"img-circle\" src=\"img/1.jpg\">\n");
      out.write("                        <h3 class=\"name\">Ben Johnson</h3>\n");
      out.write("                        <p class=\"title\">Musician</p>\n");
      out.write("                        <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>\n");
      out.write("                        <div class=\"social\"><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 item\">\n");
      out.write("                    <div class=\"box\"><img class=\"img-circle\" src=\"img/2.jpg\">\n");
      out.write("                        <h3 class=\"name\">Emily Clark</h3>\n");
      out.write("                        <p class=\"title\">Artist</p>\n");
      out.write("                        <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>\n");
      out.write("                        <div class=\"social\"><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 item\">\n");
      out.write("                    <div class=\"box\"><img class=\"img-circle\" src=\"img/3.jpg\">\n");
      out.write("                        <h3 class=\"name\">Carl Kent</h3>\n");
      out.write("                        <p class=\"title\">Stylist</p>\n");
      out.write("                        <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>\n");
      out.write("                        <div class=\"social\"><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div data-bs-parallax-bg=\"true\" style=\"height:500px;background-image:url(https://unsplash.it/1800/900?image=1051);background-position:center;background-size:cover;\">\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"jumbotron\" style=\"margin-top:100px;background-color:rgba(238,238,238,0.7);\">\n");
      out.write("                    <h1>Boletín de Proyectos</h1>\n");
      out.write("                    <p>Estracto ejecutivo de los proyectos registrados por el Centro de Innovación y Transferencia Tecnológica.</p>\n");
      out.write("                    <p><a class=\"btn btn-default\" role=\"button\" href=\"#\">Saber Más</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-dark\">\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-md-push-6 item text\">\n");
      out.write("                        <h3>CITT Viña del Mar</h3>\n");
      out.write("                        <p>Estamento extracurricular para el desarrollo de soluciones para necesidades internas o externas para la vinculación con el medio, tambien para la realización de investigación de nuevas tecnologias para la formación excepcional\n");
      out.write("                            de los integrantes del CITT.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-md-pull-6 col-sm-4 item\">\n");
      out.write("                        <h3>Especialidades </h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Desarrollo Web</a></li>\n");
      out.write("                            <li><a href=\"#\">Desarrollo de Videojuegos</a></li>\n");
      out.write("                            <li><a href=\"#\">Desarrollo Móvil</a></li>\n");
      out.write("                            <li><a href=\"#\">Domótica</a></li>\n");
      out.write("                            <li><a href=\"#\">Robótica </a></li>\n");
      out.write("                            <li><a href=\"#\">Desarrollo de Aplicaciones</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-md-pull-6 col-sm-4 item\">\n");
      out.write("                        <h3>Acerca</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>CITT </li>\n");
      out.write("                            <li><a href=\"#\">Capitanes </a></li>\n");
      out.write("                            <li><a href=\"#\">Tracks de Desarrollo</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 col-sm-4 item social\"><a href=\"#\"><i class=\"icon ion-social-facebook\"></i></a><a href=\"#\"><i class=\"icon ion-social-twitter\"></i></a><a href=\"#\"><i class=\"icon ion-social-snapchat\"></i></a><a href=\"#\"><i class=\"icon ion-social-instagram\"></i></a></div>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"copyright\">Centro de Innovación y Transferencia Tecnológica Sede Viña del Mar © 2017</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
