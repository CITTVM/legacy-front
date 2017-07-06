package org.apache.jsp.integrante;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class integranteLobby_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Dashboard - Integrante</title>\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/dashboard/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/dashboard/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/dashboard/css/local.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/dashboard/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/dashboard/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- you need to include the shieldui css and js assets in order for the charts to work -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css\" />\n");
      out.write("    <link id=\"gridcss\" rel=\"stylesheet\" type=\"text/css\" href=\"http://www.shieldui.com/shared/components/latest/css/dark-bootstrap/all.min.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.prepbootstrap.com/Content/js/gridData.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("          <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"integranteLobby.jsp\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul id=\"active\" class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li class=\"selected\"><a href=\"integrandeLobby.jsp\"><i class=\"fa fa-home\"></i> Lobby</a></li>\n");
      out.write("                    <li><a href=\"https://taiga.io/\"><i class=\"fa fa-bullseye\"></i> Taiga</a></li>\n");
      out.write("                    <li><a href=\"https://gogs.io/\"><i class=\"fa fa-tasks\"></i> Gogs</a></li>\n");
      out.write("                    <li><a href=\"misProductos.jsp\"><i class=\"fa fa-area-chart\"></i> Mis Productos</a></li>\n");
      out.write("                     <li><a href=\"misWorkshops.jsp\"><i class=\"fa fa-globe\"></i> Mis Workshops</a></li>\n");
      out.write("                     <li><a href=\"../noticias.jsp\"><i class=\"fa fa-globe\"></i> Noticias</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("                    <li class=\"dropdown user-dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> Perfil</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1>Lobby <small>Tu punto de inicio</small></h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\"><i class=\"fa fa-calendar\"></i> Calendario</h3>\n");
      out.write("                        </div>\n");
      out.write("                             <div id=\"calendar\" class=\"calendar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\"><i class=\"fa fa-rss\"></i> Twitter</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body feed\">\n");
      out.write("                            <a class=\"twitter-timeline\" data-width=\"400\" data-height=\"400\" data-theme=\"dark\" href=\"https://twitter.com/CITTDuocUC\">Tweets by CITTDuocUC</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        jQuery(function ($) {\n");
      out.write("            var performance = [12, 43, 34, 22, 12, 33, 4, 17, 22, 34, 54, 67],\n");
      out.write("                visits = [123, 323, 443, 32],\n");
      out.write("                traffic = [\n");
      out.write("                {\n");
      out.write("                    Source: \"Direct\", Amount: 323, Change: 53, Percent: 23, Target: 600\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    Source: \"Refer\", Amount: 345, Change: 34, Percent: 45, Target: 567\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    Source: \"Social\", Amount: 567, Change: 67, Percent: 23, Target: 456\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    Source: \"Search\", Amount: 234, Change: 23, Percent: 56, Target: 890\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    Source: \"Internal\", Amount: 111, Change: 78, Percent: 12, Target: 345\n");
      out.write("                }];\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\"#shieldui-chart1\").shieldChart({\n");
      out.write("                theme: \"dark\",\n");
      out.write("\n");
      out.write("                primaryHeader: {\n");
      out.write("                    text: \"Visitors\"\n");
      out.write("                },\n");
      out.write("                exportOptions: {\n");
      out.write("                    image: false,\n");
      out.write("                    print: false\n");
      out.write("                },\n");
      out.write("                dataSeries: [{\n");
      out.write("                    seriesType: \"area\",\n");
      out.write("                    collectionAlias: \"Q Data\",\n");
      out.write("                    data: performance\n");
      out.write("                }]\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"#shieldui-chart2\").shieldChart({\n");
      out.write("                theme: \"dark\",\n");
      out.write("                primaryHeader: {\n");
      out.write("                    text: \"Traffic Per week\"\n");
      out.write("                },\n");
      out.write("                exportOptions: {\n");
      out.write("                    image: false,\n");
      out.write("                    print: false\n");
      out.write("                },\n");
      out.write("                dataSeries: [{\n");
      out.write("                    seriesType: \"pie\",\n");
      out.write("                    collectionAlias: \"traffic\",\n");
      out.write("                    data: visits\n");
      out.write("                }]\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"#shieldui-grid1\").shieldGrid({\n");
      out.write("                dataSource: {\n");
      out.write("                    data: traffic\n");
      out.write("                },\n");
      out.write("                sorting: {\n");
      out.write("                    multiple: true\n");
      out.write("                },\n");
      out.write("                rowHover: false,\n");
      out.write("                paging: false,\n");
      out.write("                columns: [\n");
      out.write("                { field: \"Source\", width: \"170px\", title: \"Source\" },\n");
      out.write("                { field: \"Amount\", title: \"Amount\" },                \n");
      out.write("                { field: \"Percent\", title: \"Percent\", format: \"{0} %\" },\n");
      out.write("                { field: \"Target\", title: \"Target\" },\n");
      out.write("                ]\n");
      out.write("            });            \n");
      out.write("        });        \n");
      out.write("    </script>\n");
      out.write("    <script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    jQuery(function ($) {\n");
      out.write("        $(\"#calendar\").shieldCalendar({\n");
      out.write("            footer: {\n");
      out.write("                enabled: true,\n");
      out.write("                footerTemlpate: \"{0:dd.MM.yy}\"\n");
      out.write("            },\n");
      out.write("            min: new Date(\"2009/2/23\"),\n");
      out.write("            max: new Date(\"2039/3/1\"),\n");
      out.write("            value: new Date()\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    .calendar\n");
      out.write("    {\n");
      out.write("        width: 700px;\n");
      out.write("        margin-top: 3px;\n");
      out.write("        margin-left: 3px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    twttr.widgets.createTimeline(\n");
      out.write("  {\n");
      out.write("    sourceType: \"list\",\n");
      out.write("    ownerScreenName: \"TwitterDev\"\n");
      out.write("  },\n");
      out.write("  document.getElementById(\"container\")\n");
      out.write(");\n");
      out.write("</script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
