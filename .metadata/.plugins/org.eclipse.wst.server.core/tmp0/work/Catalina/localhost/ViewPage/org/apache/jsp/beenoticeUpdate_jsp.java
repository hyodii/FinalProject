/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-09 08:10:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beenoticeUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/FinalProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ViewPage/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1638860509064L));
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
      out.write("<title>beenoticeUpdate.jsp</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/*reset*/\r\n");
      out.write("* {margin: 0;padding: 0;}\r\n");
      out.write("body {margin: 0;}\r\n");
      out.write("h1, h2, h3, h4, h5, h6, p, ul, ol, li, dl, dt, dd {margin: 0; padding: 0;}\r\n");
      out.write("h1, h2, h3, h4, h5, h6 {font-weight: 700; }\r\n");
      out.write("a {color: inherit; text-decoration: inherit;}\r\n");
      out.write("img {vertical-align: middle;}\r\n");
      out.write("a img {border: none;}\r\n");
      out.write("li {list-style: none;}\r\n");
      out.write("address, em, i, ul {font-style: normal;}\r\n");
      out.write("\r\n");
      out.write("/*layout*/\r\n");
      out.write(".mo {display: none;}\r\n");
      out.write(".en {font-family: 'Exo 2', sans-serif;}\r\n");
      out.write("body {font-family: 'Noto Sans KR', sans-serif; font-size: 14px;}\r\n");
      out.write(".wrap {margin: 0 auto; }\r\n");
      out.write("\r\n");
      out.write("#bbs \r\n");
      out.write("{\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\tmargin:30px auto;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbs_title \r\n");
      out.write("{\r\n");
      out.write("\twidth:574px;\r\n");
      out.write("\tpadding-left:20px;\r\n");
      out.write("\theight:40px;\r\n");
      out.write("\tborder:3px solid #D6D4A6;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tline-height:40px;\r\n");
      out.write("\tfont-size:10pt;\r\n");
      out.write("\tmargin-bottom:30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated \r\n");
      out.write("{\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\toverflow: visible;\r\n");
      out.write("\tborder-top:3px solid #DBDBDB;\r\n");
      out.write("\tborder-bottom:3px solid #DBDBDB;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bbsCreated_bottomLine \r\n");
      out.write("{\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\tline-height:35px;\r\n");
      out.write("\tborder-bottom:1px solid #DBDBDB;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bbsCreated_noLine \r\n");
      out.write("{\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\tline-height:35px;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated_content \r\n");
      out.write("{\r\n");
      out.write("\theight:170px;\r\n");
      out.write("\tline-height:170px;\r\n");
      out.write("\tborder-bottom:1px solid #DBDBDB;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated dt \r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\twidth:80px;\r\n");
      out.write("\tline-height:35px;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tpadding-left:20px;\r\n");
      out.write("\tbackground-color:#EEEEEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated dd \r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\twidth:440px;\r\n");
      out.write("\tline-height:35px;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tpadding-left:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated_content dt \r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\theight:170px;\r\n");
      out.write("\twidth:80px;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tpadding-left:20px;\r\n");
      out.write("\tbackground-color:#EEEEEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated_content dd \r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\theight:170px;\r\n");
      out.write("\twidth:440px;\r\n");
      out.write("\tline-height:170px;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tpadding-left:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bbsCreated_footer \r\n");
      out.write("{\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\toverflow: visible;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\tmargin-bottom:20px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(cp);
      out.write("/js/util.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   function sendIt()\r\n");
      out.write("   {\r\n");
      out.write("      f = document.myForm;\r\n");
      out.write("      \r\n");
      out.write("      // 제목 입력 확인 --------------------------------------\r\n");
      out.write("      str = f.subject.value;\r\n");
      out.write("      str = str.trim();\r\n");
      out.write("      \r\n");
      out.write("      // ※ javascript 에는 trim() 이 존재하지 않음.\r\n");
      out.write("      //    외부에서 참조한 util.js 에 만들어두었음.\r\n");
      out.write("      \r\n");
      out.write("      // 테스트\r\n");
      out.write("      //alert(\"|\" + str + \"|\"); \r\n");
      out.write("      \r\n");
      out.write("      if(!str)\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"\\n제목을 입력하세요~!!!\");\r\n");
      out.write("         f.subject.focus();\r\n");
      out.write("         return;\r\n");
      out.write("      }\r\n");
      out.write("      // -------------------------------------- 제목 입력 확인\r\n");
      out.write("      \r\n");
      out.write("      // 이름 입력 확인 --------------------------------------\r\n");
      out.write("      str = f.name.value;\r\n");
      out.write("      str = str.trim();\r\n");
      out.write("      \r\n");
      out.write("      if(!str)\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"\\n작성자 이름을 입력하세요~!!!\");\r\n");
      out.write("         f.name.focus();\r\n");
      out.write("         return;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //  --------------------------------------이름 입력 확인\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("      f.action = \"");
      out.print(cp);
      out.write("/beenoticeCreate_ok.jsp\";\r\n");
      out.write("      f.submit();\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\tbeenoticeUpdate.jsp\r\n");
      out.write("\t동아리 내 게시판 > 공지사항 > 수정하기\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<div id=\"bbs\">\r\n");
      out.write("\r\n");
      out.write("   <div id=\"bbs_title\">\r\n");
      out.write("      공지사항\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <form action=\"\" method=\"post\" name=\"myForm\">\r\n");
      out.write("      <div id=\"bbsCreated\">\r\n");
      out.write("         <div class=\"bbsCreated_bottomLine\">\r\n");
      out.write("            <dl>\r\n");
      out.write("               <dt>제&nbsp;&nbsp;&nbsp;&nbsp;목</dt>\r\n");
      out.write("               <dd>\r\n");
      out.write("                  <input type=\"text\" name=\"subject\" size=\"60\"\r\n");
      out.write("                  maxlength=\"100\" class=\"boxTF\"/>\r\n");
      out.write("               </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("         </div><!-- close .bbsCreated_bottomLine -->\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"bbsCreated_bottomLine\">\r\n");
      out.write("            <dl>\r\n");
      out.write("               <dt>작 성 자</dt>\r\n");
      out.write("               <dd>\r\n");
      out.write("                  <input type=\"text\" name=\"name\" size=\"35\"\r\n");
      out.write("                  maxlength=\"20\" class=\"boxTF\"/>\r\n");
      out.write("               </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("         </div><!-- close .bbsCreated_bottomLine -->\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div id=\"bbsCreated_content\">\r\n");
      out.write("            <dl>\r\n");
      out.write("               <dt>내&nbsp;&nbsp;&nbsp;&nbsp;용</dt>\r\n");
      out.write("               <dd>\r\n");
      out.write("                  <textarea rows=\"10\" cols=\"63\" name=\"content\"\r\n");
      out.write("                        class=\"boxTA\"></textarea>\r\n");
      out.write("               </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("         </div><!-- close .bbsCreated_content -->\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div id=\"bbsCreated_footer\">\r\n");
      out.write("         \r\n");
      out.write("         \t<!-- Updated_ok.jsp페이지 요청 과정에서 반드시 필요한 데이터  -->\r\n");
      out.write("         \t<input type=\"hidden\" name=\"num\" value=\"num\" />\r\n");
      out.write("         \t<input type=\"hidden\" name=\"pageNum\" value=\"pageNum\" />\r\n");
      out.write("         \t\r\n");
      out.write("         \t<input type=\"button\" value=\"수정하기\" class=\"btn2\"\r\n");
      out.write("            onclick=\"sendIt()\"/>\r\n");
      out.write("            <input type=\"reset\" value=\"다시입력\" class=\"btn2\"\r\n");
      out.write("            onclick=\"document.myForm.subject.focus();\"/>\r\n");
      out.write("            <input type=\"button\" value=\"수정취소\" class=\"btn2\" \r\n");
      out.write("            onclick=\"javascript:location.href='");
      out.print(cp);
      out.write("/beenoticeList.jsp?pageNum=&num='\"/>\r\n");
      out.write("            \r\n");
      out.write("         </div><!-- close .bbsCreated_footer -->\r\n");
      out.write("         \r\n");
      out.write("      </div><!-- close .bbsCreated -->\r\n");
      out.write("      \r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("</div><!-- close #bbs -->\r\n");
      out.write("\r\n");
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
