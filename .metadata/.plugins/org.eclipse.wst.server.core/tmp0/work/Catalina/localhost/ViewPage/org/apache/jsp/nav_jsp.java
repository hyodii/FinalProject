/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-03 10:18:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>B:CLE</title>\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"css/main.css\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Exo+2|Noto+Sans+KR&display=swap');\r\n");
      out.write("\r\n");
      out.write("/*reset*/\r\n");
      out.write("* {margin: 0;padding: 0;}\r\n");
      out.write("body {margin: 0;}\r\n");
      out.write("h1, h2, h3, h4, h5, h6, p, ul, ol, li, dl, dt, dd {margin: 0; padding: 0;}\r\n");
      out.write("h1, h2, h3, h4, h5, h6 {font-weight: 700; font-size: inherit;}\r\n");
      out.write("a {color: inherit; text-decoration: inherit;}\r\n");
      out.write("img {vertical-align: middle;}\r\n");
      out.write("a img {border: none;}\r\n");
      out.write("li {list-style: none;}\r\n");
      out.write("address, em, i, ul {font-style: normal;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".mo {display: none;}\r\n");
      out.write("body {font-family: 'Noto Sans KR', sans-serif; font-size: 14px;}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\tletter-spacing: -0.5px;\r\n");
      out.write("\tbackground: rgb(255, 192, 0);\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\theight: 10vh;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mainHeader{width: 100%; margin-top: 20px; box-sizing: border-box; vertical-align: center;}\r\n");
      out.write(".mainHeader .gnbMo {display: none; }\r\n");
      out.write(".mainHeader .gnb {float: left; margin-left: 80px; }\r\n");
      out.write(".mainHeader .gnb li {float: left; margin-right: 80px;}\r\n");
      out.write(".mainHeader .gnb li a{display: block; width: 100%; height: 100%; text-align: center; color: #fff; font-size: 16px; text-decoration-line : none;}\r\n");
      out.write(".mainHeader .gnb li a:hover,.mainHeader .gnb li a:focus {color:#ff8342;}\r\n");
      out.write(".mainHeader .tnb {float: right; }\r\n");
      out.write(".mainHeader .tnb li {float: left; margin-right: 25px;}\r\n");
      out.write(".mainHeader .tnb li a{display:block; width: 100%; height: 100%; text-align: center; font-size: 16px; color: #fff; text-decoration-line : none;}\r\n");
      out.write(".mainHeader .tnb li:nth-child(1) a i,.mainHeader .tnb li:nth-child(2) a i {font-size: 20px; margin-right: 8px;}\r\n");
      out.write(".mainHeader .tnb li:last-child a {display: block; width: 105px; line-height: 2; border: 1px solid #fff; border-radius: 30px; margin-top: 35px; }\r\n");
      out.write(".mainHeader .tnb li:last-child a i {margin-left: 5px;}\r\n");
      out.write(".mainHeader .tnb li:last-child a:hover {background: #fff; color:#ff8342; transition: all 0.3s; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<!--header-->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"mainHeader\">\r\n");
      out.write("\t\t\t\t<nav class=\"gnb\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">B:CLE</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">대표게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">결산</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<nav class=\"tnb\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">동아리개설</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">검색 <i class=\"fa fa-search\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-handshake-o\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\"></i>로그인/회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary position-relative\">\r\n");
      out.write("\t\t\t\t\t\t\t\t알림 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"position-absolute top-0 start-100 translate-middle p-2 bg-danger border border-light rounded-circle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"visually-hidden\">New alerts</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</button></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- 검색아이콘 -->\r\n");
      out.write("\t\t\t\t<nav class=\"gnbMo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
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