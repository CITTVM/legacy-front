package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearUsuarioBasico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lora\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/fonts/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Article-Clean.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Article-List.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Carousel-Hero.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Footer-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Login-Form-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Navigation-with-Button1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Projects-Horizontal.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Registration-Form-with-Photo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Test2/assets/css/Team-Boxed.css\">\n");
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
      out.write("                    <li role=\"presentation\"><a href=\"index.html\">Inicio </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"noticias.html\">Noticias </a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"navbar-text navbar-right actions\"><a class=\"navbar-link login\" href=\"login.html\">Entrar </a> <a class=\"btn btn-default action-button\" role=\"button\" href=\"registrar.html\">Registro </a></p>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"boletin.html\">Boletín de Proyectos</a></li>\n");
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
      out.write("                <h2 class=\"text-center\"><strong>Creación</strong> de cuenta de usuario</h2>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" type=\"email\" name=\"user-name\" placeholder=\"Nombre de Usuario\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" type=\"password\" name=\"password-repeat\" placeholder=\"Contraseña (Repetir)\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"checkbox\">\n");
      out.write("                        <label class=\"control-label\">\n");
      out.write("                            <input type=\"checkbox\">Estoy de acuerdo con las condiciones de uso.</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"background-color:rgb(43,133,0);\">Registrar Cuenta</button>\n");
      out.write("                </div><a href=\"login.html\" class=\"already\">¿Ya tienes una cuenta? Entra aquí..</a></form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
