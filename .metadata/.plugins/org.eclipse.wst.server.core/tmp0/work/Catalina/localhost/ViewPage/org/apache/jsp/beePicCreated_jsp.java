/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-11 10:14:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beePicCreated_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>beePicCreated.jsp</title>\r\n");
      out.write("<style>\r\n");
      out.write("#bbs \r\n");
      out.write("{\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\tmargin:30px auto;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
      out.write("#att_zone {\r\n");
      out.write("  width: 660px;\r\n");
      out.write("  min-height: 150px;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border: 1px dotted #00f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#att_zone:empty:before {\r\n");
      out.write("  content: attr(data-placeholder);\r\n");
      out.write("  color: #999;\r\n");
      out.write("  font-size: .9em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  \r\n");
      out.write("\tbeePicCreated.jsp\r\n");
      out.write("\t- ????????? ??? ????????? > ????????? > ?????? ?????????\r\n");
      out.write("\t- ?????? : https://jobtc.tistory.com/43\r\n");
      out.write("-->\r\n");
      out.write("<div id=\"bbs\">\r\n");
      out.write("\t<form action=\"\">\t\r\n");
      out.write("\t<div id='image_preview'>\r\n");
      out.write("\t  <h3>?????? ?????????</h3>\r\n");
      out.write("\t  <input type='file' id='btnAtt' multiple='multiple' />\r\n");
      out.write("\t  <div id='att_zone'\r\n");
      out.write("\t    data-placeholder='????????? ?????? ????????? ?????? ?????? ????????? ??????????????? ????????? ?????????????????? ?????????.'></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ?????? ?????????????????? ????????? ???????????? \r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t????????? <input name=\"name\">\r\n");
      out.write("\t\t????????? <input name=\"date\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t -->\r\n");
      out.write("\t<div id=\"bbsCreated_footer\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"????????????\" class=\"btn2\"\r\n");
      out.write("\t\tonclick=\"\"/>\r\n");
      out.write("\t\t<input type=\"button\" value=\"????????????\" class=\"btn2\" \r\n");
      out.write("\t\tonclick=\"javascript:location.href='");
      out.print(cp);
      out.write("/beePicList.jsp'\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("( /* att_zone : ??????????????? ????????? ?????? id, btn : file tag id */\r\n");
      out.write("  imageView = function imageView(att_zone, btn){\r\n");
      out.write("\r\n");
      out.write("    var attZone = document.getElementById(att_zone);\r\n");
      out.write("    var btnAtt = document.getElementById(btn)\r\n");
      out.write("    var sel_files = [];\r\n");
      out.write("    \r\n");
      out.write("    // ???????????? ?????? ????????? ????????? ?????? div ??????\r\n");
      out.write("    var div_style = 'display:inline-block;position:relative;'\r\n");
      out.write("                  + 'width:150px;height:120px;margin:5px;border:1px solid #00f;z-index:1';\r\n");
      out.write("    // ???????????? ????????? ??????\r\n");
      out.write("    var img_style = 'width:100%;height:100%;z-index:none';\r\n");
      out.write("    // ??????????????? ???????????? ??????????????? ??????\r\n");
      out.write("    var chk_style = 'width:30px;height:30px;position:absolute;font-size:24px;'\r\n");
      out.write("                  + 'right:0px;bottom:0px;z-index:999;background-color:rgba(255,255,255,0.1);color:#f00';\r\n");
      out.write("  \r\n");
      out.write("    btnAtt.onchange = function(e){\r\n");
      out.write("      var files = e.target.files;\r\n");
      out.write("      var fileArr = Array.prototype.slice.call(files)\r\n");
      out.write("      for(f of fileArr){\r\n");
      out.write("        imageLoader(f);\r\n");
      out.write("      }\r\n");
      out.write("    }  \r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("    // ??????????????? ???????????? ?????? ??????\r\n");
      out.write("    attZone.addEventListener('dragenter', function(e){\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      e.stopPropagation();\r\n");
      out.write("    }, false)\r\n");
      out.write("    \r\n");
      out.write("    attZone.addEventListener('dragover', function(e){\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      e.stopPropagation();\r\n");
      out.write("      \r\n");
      out.write("    }, false)\r\n");
      out.write("  \r\n");
      out.write("    attZone.addEventListener('drop', function(e){\r\n");
      out.write("      var files = {};\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      e.stopPropagation();\r\n");
      out.write("      var dt = e.dataTransfer;\r\n");
      out.write("      files = dt.files;\r\n");
      out.write("      for(f of files){\r\n");
      out.write("        imageLoader(f);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("    }, false)\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    /*????????? ??????????????? ????????? ?????? ???????????? */\r\n");
      out.write("    imageLoader = function(file){\r\n");
      out.write("      sel_files.push(file);\r\n");
      out.write("      var reader = new FileReader();\r\n");
      out.write("      reader.onload = function(ee){\r\n");
      out.write("        let img = document.createElement('img')\r\n");
      out.write("        img.setAttribute('style', img_style)\r\n");
      out.write("        img.src = ee.target.result;\r\n");
      out.write("        attZone.appendChild(makeDiv(img, file));\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      reader.readAsDataURL(file);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    /*????????? ????????? ?????? ?????? checkbox??? ?????? attZone??? ????????? div??? ????????? ?????? */\r\n");
      out.write("    makeDiv = function(img, file){\r\n");
      out.write("      var div = document.createElement('div')\r\n");
      out.write("      div.setAttribute('style', div_style)\r\n");
      out.write("      \r\n");
      out.write("      var btn = document.createElement('input')\r\n");
      out.write("      btn.setAttribute('type', 'button')\r\n");
      out.write("      btn.setAttribute('value', 'x')\r\n");
      out.write("      btn.setAttribute('delFile', file.name);\r\n");
      out.write("      btn.setAttribute('style', chk_style);\r\n");
      out.write("      btn.onclick = function(ev){\r\n");
      out.write("        var ele = ev.srcElement;\r\n");
      out.write("        var delFile = ele.getAttribute('delFile');\r\n");
      out.write("        for(var i=0 ;i<sel_files.length; i++){\r\n");
      out.write("          if(delFile== sel_files[i].name){\r\n");
      out.write("            sel_files.splice(i, 1);      \r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        dt = new DataTransfer();\r\n");
      out.write("        for(f in sel_files) {\r\n");
      out.write("          var file = sel_files[f];\r\n");
      out.write("          dt.items.add(file);\r\n");
      out.write("        }\r\n");
      out.write("        btnAtt.files = dt.files;\r\n");
      out.write("        var p = ele.parentNode;\r\n");
      out.write("        attZone.removeChild(p)\r\n");
      out.write("      }\r\n");
      out.write("      div.appendChild(img)\r\n");
      out.write("      div.appendChild(btn)\r\n");
      out.write("      return div\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write(")('att_zone', 'btnAtt')\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
