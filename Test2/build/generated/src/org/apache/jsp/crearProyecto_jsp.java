package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProyecto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      out.write("\n");
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
      out.write("            <div class=\"navbar-header\"><a class=\"navbar-brand navbar-link\" href=\"index.html\">Proyecto LEGACY - Landing</a>\n");
      out.write("                <button class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"index.jsp\">Inicio </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"noticias.jsp\">Noticias </a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"navbar-text navbar-right actions\"><a class=\"navbar-link login\" href=\"login.jsp\">Entrar </a> <a class=\"btn btn-default action-button\" role=\"button\" href=\"registrar.jsp\">Registro </a></p>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"boletin.jsp\">Boletín de Proyectos</a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"#\">Talleres</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"https://tree.taiga.io/discover\">LEGACY-Taiga </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"https://try.gogs.io/explore/repos\">LEGACY-GOGS </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"register-photo\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <div class=\"image-holder\"></div>\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <center>\n");
      out.write("                <h2 class=\"text-center\">Creacion de Proyecto</h2>\n");
      out.write("                <div class=\"form-group\" style=\"max-width:50%; \">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" style=\"max-width:50%; \">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"descripcion\" placeholder=\"Descripcion \">\n");
      out.write("                </div>   \n");
      out.write("               \n");
      out.write("                <div class=\"form-group\" style=\"max-width:50%; \">\n");
      out.write("                    <input class=\"form-control\" type=\"date\" name=\"fecha\" step=\"1\" min=\"2017-01-01\" >\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"form-group\"  >\n");
      out.write("                     <text> Lider :   </text>\n");
      out.write("                     <select >\n");
      out.write("                         <option value=\"simon\">Simon Morales</option>\n");
      out.write("                         <option value=\"jonas\">Jonathan Gonzalez</option>\n");
      out.write("                         <option value=\"sergio\">Sergio Matamala</option>\n");
      out.write("                         <option value=\"camilo\">Camilo liJobs</option>\n");
      out.write("                         \n");
      out.write("                    </select>\n");
      out.write("                </div>    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\" style=\"max-width:50%; \">\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"background-color:rgb(43,133,0);max-width:50%;\">Crear Proyecto</button>\n");
      out.write("                </div></center></form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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