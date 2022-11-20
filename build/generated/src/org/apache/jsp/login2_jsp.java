package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <title>Login</title>\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("      <link href=\"style/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <div class=\"center\">       \r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <label for=\"\" class=\"close-btn fas fa-times\" title=\"close\"></label>\r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("               Se connecter\r\n");
      out.write("            </div>\r\n");
      out.write("             <form method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/Login\">\r\n");
      out.write("           \r\n");
      out.write("               <div class=\"data\">\r\n");
      out.write("                  <label for =\"uname\">Email </label>\r\n");
      out.write("                  <input  type=\"text\" id=\"email\" name=\"email\" required  placeholder=\"nom@gmail.com\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"data\">\r\n");
      out.write("                  <label for =\"uname\">Mot de passe</label>\r\n");
      out.write("                  <input type=\"password\" id=\"password\" name=\"password\" required placeholder=\"mot de passe\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"forgot-pass\">\r\n");
      out.write("                  <a href=\"emailverification.jsp\">Mot de passe oublié</a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"btn\">\r\n");
      out.write("                  <div class=\"inner\"></div>\r\n");
      out.write("                  <button type=\"submit\">Se connecter</button>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"signup-link\">\r\n");
      out.write("                  nouveau membre? <a href=\"registration.jsp\">S'inscrire</a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </body>\r\n");
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
