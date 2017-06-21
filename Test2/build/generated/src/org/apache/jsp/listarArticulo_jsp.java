package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listarArticulo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("            <form action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"post\">\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("  <h2>Striped Rows</h2>\n");
      out.write("  <p>The .table-striped class adds zebra-stripes to a table:</p>            \n");
      out.write("  <table class=\"table table-striped\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("          <th>Numero de Serie</th>\n");
      out.write("        <th>Nombre</th>\n");
      out.write("        <th>Descripcion</th>\n");
      out.write("        <th>Observacion</th>\n");
      out.write("        <th>Marca</th>\n");
      out.write("        <th>Modelo</th>\n");
      out.write("        <th>Disponibilidad</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>John</td>\n");
      out.write("        <td>Doe</td>\n");
      out.write("        <td>john@example.com</td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("                </center></form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/controllerCrearArticulo");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
