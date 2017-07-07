package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boletin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <nav class=\"navbar navbar-default navigation-clean-button\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\"><a class=\"navbar-brand navbar-link\" href=\"index.jsp\"><img src=\"assets/img/citt.png\" alt=\"\" height=\"480\" width=\"960\"/></a>\n");
      out.write("                <button class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\" role=\"presentation\"><a href=\"index.jsp\">Inicio </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"noticias.jsp\">Noticias </a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"navbar-text navbar-right actions\"><a class=\"navbar-link login\" href=\"login.jsp\">Entrar </a> <a class=\"btn btn-default action-button\" role=\"button\" href=\"crearCuenta.jsp\">Registro </a></p>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"boletin.jsp\">Boletín de Proyectos</a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"controllerListarWorkshop\">Talleres</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"https://tree.taiga.io/discover\">LEGACY-Taiga </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"https://try.gogs.io/explore/repos\">LEGACY-GOGS </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"projects-horizontal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"intro\">\n");
      out.write("                <h2 class=\"text-center\">Boletín General de Proyectos</h2>\n");
      out.write("                <p class=\"text-center\">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet vitae. </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row projects\">\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/desk.jpg\"></a>                       \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/building.jpg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/loft.jpg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/minibus.jpeg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"projects-horizontal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row projects\">\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/desk.jpg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/building.jpg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/loft.jpg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 item\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <a href=\"#\"><img class=\"img-responsive\" src=\"img/minibus.jpeg\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <h3 class=\"name\">Project Name</h3>\n");
      out.write("                            <p class=\"description\">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
