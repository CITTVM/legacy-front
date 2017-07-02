package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearCuenta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("            <div class=\"navbar-header\"><a class=\"navbar-brand navbar-link\" href=\"index.jsp\">Proyecto LEGACY - Landing</a>\n");
      out.write("                <button class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li role=\"presentation\"><a href=\"index.jsp\">Inicio </a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"noticias.jsp\">Noticias </a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"navbar-text navbar-right actions\"><a class=\"navbar-link login\" href=\"login.jsp\">Entrar </a> <a class=\"btn btn-default action-button\" role=\"button\" href=\"crearCuenta.jsp\">Registro </a></p>\n");
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
      out.write("                <h2 class=\"text-center\"><strong>Creación de cuenta de usuario</strong></h2>\n");
      out.write("                <h3 class=\"text-center\">Datos de la cuenta</h3>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"email\" name=\"user-name\" placeholder=\"Nombre de Usuario\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" > \n");
      out.write("                    <input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"password\" name=\"password-repeat\" placeholder=\"Contraseña (Repetir)\">\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"text-center\">Datos Personales</h3>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"rut\" placeholder=\"RUT\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"nombre\" placeholder=\"Nombre Completo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"apelpat\" placeholder=\"Apellido Paterno\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"apelmat\" placeholder=\"Apellido Materno\">\n");
      out.write("                </div>\n");
      out.write("                 <div  class=\"form-group\" >\n");
      out.write("                     <text> Carrera :  </text>\n");
      out.write("                     <select required name=\"carrera\">\n");
      out.write("                         <option value=\"seleccione\">Seleccione..</option>\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"form-group\" >\n");
      out.write("                     <text> Track :  </text>\n");
      out.write("                     <select required name=\"track\">\n");
      out.write("                         <option value=\"seleccione\">Seleccione..</option>\n");
      out.write("                         <option value=\"microControladores\">Microcontroladores y Domotica</option>\n");
      out.write("                         <option value=\"desarrolloWeb\">Desarrollo Web</option>\n");
      out.write("                         <option value=\"Legos\">Legos</option>\n");
      out.write("                         <option value=\"videojuegos\">Videojuegos</option>\n");
      out.write("                         <option value=\"appMoviles\">Aplicaciones Moviles</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"checkbox\">\n");
      out.write("                        <label class=\"control-label\">\n");
      out.write("                            <input type=\"checkbox\">Estoy de acuerdo con las condiciones de uso.</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"background-color:rgb(43,133,0);max-width:50%;\">Registrar Cuenta</button>\n");
      out.write("                </div><a href=\"login.jsp\" class=\"already\">¿Ya tienes una cuenta? Entra aquí..</a></center></form>\n");
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
    _jspx_th_c_url_0.setValue("/controllerCrearCuenta");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("v");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carreras}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>                            \n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.cod_estadistica}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.cod_estadistica}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
