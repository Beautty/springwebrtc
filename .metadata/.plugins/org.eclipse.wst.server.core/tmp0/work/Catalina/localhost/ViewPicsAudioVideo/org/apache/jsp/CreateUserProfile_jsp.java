package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tcs.css.ThemeSelector;

public final class CreateUserProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<!-- themes selecetor code  -->\n");
session.setAttribute("themename", "blue");
ThemeSelector ts=new ThemeSelector();
String theme=ts.getTheme(session.getAttribute("themename").toString());
      out.write("\n");
      out.write("<!--  end themes selecetor code  -->\n");
      out.write("\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"/>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>WebRTC client </title>\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/");
      out.print(theme );
      out.write("\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<!--     <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\" /> -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.fancybox-1.3.4.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("\t    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.6.1.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.smoothscroll.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nivo.slider.pack.js\"></script>\n");
      out.write("    <script src=\"js/jquery.easing-1.3.pack.js\"></script>\n");
      out.write("    <script src=\"js/jquery.fancybox-1.3.4.pack.js\"></script>\n");
      out.write("    <script src=\"js/init.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header-wrap -->\n");
      out.write("<div id=\"header-wrap\">\n");
      out.write("    <header>\n");
      out.write("     \n");
      out.write("\t\t \n");
      out.write("\t\t   \n");
      out.write("<div><img src=\"images/tcs_logo.png\"</div>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            ");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- content-wrap -->\n");
      out.write("<div class=\"content-wrap\">\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!----------------------------------------------------- main ---------------------------->\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("<h2 align=\"center\"> Create User</h2>\r\n");
      out.write("<form enctype=\"multipart/form-data\" method=\"POST\" name=\"createUserform\" action=\"");
      out.print(request.getContextPath());
      out.write("/CreateUserServlet\">\r\n");
      out.write("<table id=\"AddCustTable\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>UserId:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"Name\" type=\"text\" name=\"userid\" title=\"Id should contain only digits only.\" maxlength=\"40\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"NameError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Name:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"Name\" type=\"text\" name=\"name\" title=\"Name should contain only alphabets and whitespaces.\" maxlength=\"40\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"NameError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"vertical-align: top;\">Address:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea id=\"Address\" name=\"address\" cols=\"30\" rows=\"5\" title=\"Address should be of maximum 200 characters.\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"AddressError\" style=\"color: red;vertical-align: top;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Contact Number:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"Contact\" type=\"text\" name=\"contact\" title=\"Contact number should contain only digits.\" maxlength=\"15\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"ContactError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Profile-Pic:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input style=\"padding: 2px 0px 2px 0px;\" id=\"File\" type=\"file\" name=\"picture\" title=\"The document should be a .jpg file.\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"FileError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Fav. Audio-track:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input style=\"padding: 2px 0px 2px 0px;\" id=\"File\" type=\"file\" name=\"audio\" title=\"The document should be a .mp3 file.\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"FileError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Fav. Video:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input style=\"padding: 2px 0px 2px 0px;\" id=\"File\" type=\"file\" name=\"video\" title=\"The document should be a .mp4 file.\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"FileError\" style=\"color: red;\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input style=\"padding: 3px;\" type=\"submit\" name=\"submit\" value=\"Submit Details\"/>\r\n");
      out.write("\t\t\t\t\t\t<input style=\"padding: 3px;\" type=\"reset\" value=\"Reset\" id=\"resetButton\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write(" <!------------------------------------------ services -------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-content\">\n");
      out.write("        <ul class=\"footer-menu\">\n");
      out.write("            <li><a href=\"#main\">Home</a></li>\n");
      out.write("            <li><a href=\"#services\">Services</a></li>\n");
      out.write("            <li><a href=\"#portfolio\">Phone book</a></li>\n");
      out.write("            <li><a href=\"mbook.jsp\">Message Book</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <p class=\"footer-text\">Tata Consultancy Services &nbsp;&nbsp;&nbsp; Designed by CNS Lab</a></p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}