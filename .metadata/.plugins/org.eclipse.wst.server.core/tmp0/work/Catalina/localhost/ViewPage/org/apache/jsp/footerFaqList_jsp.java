/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-14 08:06:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footerFaqList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      out.write("<title>footerFaqList.jsp</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".layout{\r\n");
      out.write("    max-width: 600px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qna{\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write(".qna > li{\r\n");
      out.write("  padding: 10px 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write(".qna > li:nth-child(n+2){ /* ????????? ?????? ?????? */\r\n");
      out.write("  border-top: 1px dashed #aaa;\r\n");
      out.write("}\r\n");
      out.write(".qna input {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qna label { /* ?????? - ?????? ?????? */\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: #000;\r\n");
      out.write("  margin: 20px 0 0;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".qna label::before { /* ?????? ??? ????????? */\r\n");
      out.write("  content: \"???\";\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: #FFD34E;\r\n");
      out.write("  margin-right: 8px;\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write(".qna input:checked + label::before { /* ?????? ?????? ?????? ?????? ??? ????????? */\r\n");
      out.write("  content: \"???\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qna div { /* ?????? ?????? - ?????? ?????? ?????? */\r\n");
      out.write("  display: none;\r\n");
      out.write("  color: #666;\r\n");
      out.write("  font-size: 0.9375em;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  padding: 10px 0 10px 30px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  transition: max-height 0.4s;\r\n");
      out.write("}\r\n");
      out.write(".qna input:checked + label + div { /* ?????? ?????? ?????? */\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content_footer\r\n");
      out.write("{\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tjustify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#content\r\n");
      out.write("{\r\n");
      out.write("\tmargin: 10vh 0vh 10vh 10vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".merge{\r\n");
      out.write("display : flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  \r\n");
      out.write("\tfooterFaqList.jsp\r\n");
      out.write("\t- ?????? ???????????? - ????????? ?????????\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("\t<!-- ?????? ?????? -->\r\n");
      out.write("      <div>\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <div class=\"merge\">\r\n");
      out.write("      <!-- ???????????? ?????? -->\r\n");
      out.write("      <div>\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<ul class=\"qna\">\r\n");
      out.write("\t         <li>\r\n");
      out.write("\t             <input type=\"checkbox\" id=\"qna-1\">\r\n");
      out.write("\t             <label for=\"qna-1\">Q. ???????????? ??? ????????? ??????????????????????</label>\r\n");
      out.write("\t             <div>\r\n");
      out.write("\t                 <p>A. ???????????????. ?????? ??????????????????.<br> ???????????? ??????????????? 1 ???????????? ???????????? ??????????????????.</p>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </li>\r\n");
      out.write("\t         <li>\r\n");
      out.write("\t             <input type=\"checkbox\" id=\"qna-2\">\r\n");
      out.write("\t             <label for=\"qna-2\">Q. ????????? ???????????? ????????????.</label>\r\n");
      out.write("\t             <div>\r\n");
      out.write("\t                 <p>A. ???????????????. ?????? ??????????????????.<br> ????????? ??????????????? ????????? ????????? ?????????????????? ????????? ???????????????.</p>\r\n");
      out.write("\t                 <p>???, ???????????? ?????? ?????????????????? ???????????? ????????? ???????????????.</p>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </li>\r\n");
      out.write("\t         <li>\r\n");
      out.write("\t             <input type=\"checkbox\" id=\"qna-3\">\r\n");
      out.write("\t             <label for=\"qna-3\">Q. ?????????</label>\r\n");
      out.write("\t             <div>\r\n");
      out.write("\t                 <p>A. ?????????????????? ????????????</p>\r\n");
      out.write("\t                 <p>?????????????????? ?????????????????????????????? ?????????????????????????????? ?????????????????????????????? ?????????????????????????????? ?????????????????????????????? ????????????</p>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </li>\r\n");
      out.write("\t         <li>\r\n");
      out.write("\t             <input type=\"checkbox\" id=\"qna-4\">\r\n");
      out.write("\t             <label for=\"qna-4\">Q. ?????????</label>\r\n");
      out.write("\t             <div>\r\n");
      out.write("\t                 <p>A. ????????? ??????</p>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </li>\r\n");
      out.write("\t         <li>\r\n");
      out.write("\t             <input type=\"checkbox\" id=\"qna-5\">\r\n");
      out.write("\t             <label for=\"qna-5\">Q. ????????? ????????? ??????????????? ????????? ?????? ??????????</label>\r\n");
      out.write("\t             <div>\r\n");
      out.write("\t                 <p>A. ????????? ?????? ????????? ???????????? ????????? ????????? ???????????? ????????????. ??????????????? > ?????????????????? ????????? ????????? ???????????? ?????????????????? ???????????????.</p>\r\n");
      out.write("\t                 <p>?????? ?????? ????????? ???????????? ?????? ?????? ????????? ??????????????? ????????? ????????????.</p>\r\n");
      out.write("\t                 <p>> ??????????????? ??????</p>\r\n");
      out.write("\t                 <p>1. \"??????????????? > ?????????????????? ?????? ?????? > ??????/??????/?????? ??????\"??? ????????? ????????? ???????????? ??????</p>\r\n");
      out.write("\t                 <p>2. \"[\"??????????????? > 1:1???????????? > ?????????????????? ??????????????? ????????????\"??? ????????? ??? ?????? ?????? ??????</p>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </li>\r\n");
      out.write("\t     </ul>\r\n");
      out.write("\t     \r\n");
      out.write("     \t<div id=\"content_footer\">\r\n");
      out.write("         <p>1 Prev 21 22 23 24 25 26 27 28 29 30 Next 54</p>\r\n");
      out.write("         <input type=\"button\" value=\"?????????\" \r\n");
      out.write("         onclick=\"javaScript:location.href='");
      out.print(cp );
      out.write("/beefreeCreated.jsp'\"/>\r\n");
      out.write("      \t</div> \r\n");
      out.write("\t     \r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     \t <!-- ?????? ?????? -->\r\n");
      out.write("\t      <div>\r\n");
      out.write("\t      \t");
      if (_jspx_meth_c_005fimport_005f2(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t      </div>\r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /footerFaqList.jsp(92,9) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("nav.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /footerFaqList.jsp(100,10) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("sidebarBeeAdmin.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f2_reused = false;
    try {
      _jspx_th_c_005fimport_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f2.setParent(null);
      // /footerFaqList.jsp(158,8) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f2.setUrl("footer.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f2 = _jspx_th_c_005fimport_005f2.doStartTag();
        if (_jspx_th_c_005fimport_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f2);
      _jspx_th_c_005fimport_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f2_reused);
    }
    return false;
  }
}
