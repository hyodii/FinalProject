/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-14 05:59:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebarMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/FinalProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ViewPage/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1639051896379L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

   request.setCharacterEncoding("UTF-8");
   String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>sidebarMain.jsp</title>\r\n");
      out.write("<!-- <link href=\"assets/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.14.0/css/all.css\" integrity=\"sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc\" crossorigin=\"anonymous\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*\r\n");
      out.write("{\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ????????? ?????? */\r\n");
      out.write(".left_menu \r\n");
      out.write("{\r\n");
      out.write("    /* position: fixed; */\r\n");
      out.write("    width: 30vh;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("    z-index: 10;\r\n");
      out.write("  \tbackground: #FFFAD5;\r\n");
      out.write("    border-right: 1px solid rgba(0, 0, 0, 0.07);\r\n");
      out.write("    bottom: 50px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    margin-top: 0px;\r\n");
      out.write("    padding-bottom: 0px;\r\n");
      out.write("    /* box-shadow: 0 0px 24px 0 rgb(0 0 0 / 6%), 0 1px 0px 0 rgb(0 0 0 / 2%); */\r\n");
      out.write("    color: white;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub_menu \r\n");
      out.write("{\r\n");
      out.write("    margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left_menu>.sub_menu li:hover \r\n");
      out.write("{\r\n");
      out.write("    color: ff5858;\r\n");
      out.write("    background-color: #e1e1e1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left_menu>.sub_menu li \r\n");
      out.write("{\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    padding: 20px 0px 8px 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub_menu>h2 \r\n");
      out.write("{\r\n");
      out.write("    padding-bottom: 4px;\r\n");
      out.write("    margin-top: 30px;\r\n");
      out.write("    font-size: 21px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin-left: 10px;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("    font-family: 'NotoKrB';\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub_menu .fas \r\n");
      out.write("{\r\n");
      out.write("    color: #ff5858;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub_menu>.big_menu>.small_menu li \r\n");
      out.write("{\r\n");
      out.write("    color: #797979;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    margin-left: 14px;\r\n");
      out.write("    padding-top: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".big_menu \r\n");
      out.write("{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul \r\n");
      out.write("{\r\n");
      out.write("    padding-inline-start: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a \r\n");
      out.write("{\r\n");
      out.write("    color: #797979;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul \r\n");
      out.write("{\r\n");
      out.write("    list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ol,\r\n");
      out.write("ul \r\n");
      out.write("{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".has_sub \r\n");
      out.write("{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hide_sidemenu \r\n");
      out.write("{\r\n");
      out.write("    display: none;\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write(".background\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color: #ff5858;\r\n");
      out.write("\twidth: 30vh;\r\n");
      out.write("\theight:100vh;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        /* $(\".left_sub_menu\").hide(); */\r\n");
      out.write("        $(\".has_sub\").click(function () {\r\n");
      out.write("            $(\".left_sub_menu\").fadeToggle(300);\r\n");
      out.write("        });\r\n");
      out.write("        // ???????????? ????????????\r\n");
      out.write("        $(\".sub_menu ul.small_menu\").hide();\r\n");
      out.write("        $(\".sub_menu ul.big_menu\").click(function () {\r\n");
      out.write("            $(\"ul\", this).slideToggle(300);\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        /* \r\n");
      out.write("        // ?????? ?????? ??? ?????? ????????? ?????? ?????????\r\n");
      out.write("        $('.overlay').on('click', function () {\r\n");
      out.write("            $('.left_sub_menu').fadeOut();\r\n");
      out.write("            $('.hide_sidemenu').fadeIn();\r\n");
      out.write("        });\r\n");
      out.write("         */\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t    <!-- ?????? ?????? ?????? -->\r\n");
      out.write("\t    <div class=\"background\">\r\n");
      out.write("\t    <div class=\"left_menu\">\r\n");
      out.write("\t        <div class=\"sub_menu\">\r\n");
      out.write("\t            <h2>?????? ?????????</h2>\r\n");
      out.write("\t            <ul class=\"big_menu\">\r\n");
      out.write("\t                <li>?????????</li>\r\n");
      out.write("\t            </ul>\r\n");
      out.write("\t            <ul class=\"big_menu\">\r\n");
      out.write("\t                <li>????????????</li>\r\n");
      out.write("\t            </ul>\r\n");
      out.write("\t            <!-- <ul class=\"big_menu\">\r\n");
      out.write("\t                <li>????????????<i class=\"arrow fas fa-angle-right\"></i></li>\r\n");
      out.write("\t                <ul class=\"small_menu\">\r\n");
      out.write("\t                    <li><a href=\"#\">??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">??????/??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">????????????</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t            </ul> -->\r\n");
      out.write("\t            \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
