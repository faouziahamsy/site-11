package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <title>Inscription</title>\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      <link href=\"style/registration.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"text\">S'inscrire</div>\r\n");
      out.write("       <form action=\"");
      out.print(request.getContextPath());
      out.write("/register\" method=\"post\">\r\n");
      out.write("           <div class=\"form-row\">\r\n");
      out.write("              <div class=\"input-data\"> \r\n");
      out.write("                  <input type=\"text\"class=\"form-control\" id=\"uname\" name=\"nom\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Nom</label>\r\n");
      out.write("                  \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" name=\"email\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Email</label>\r\n");
      out.write("                 \r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"form-row\">\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"uname\" name=\"prenom\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Prenom </label>\r\n");
      out.write("                 \r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"input-data\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"uname\" name=\"telephone\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Telephone </label>\r\n");
      out.write("                 \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"password\"class=\"form-control\" id=\"password\" name=\"password\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>                 \r\n");
      out.write("                 <label for=\"\">Mot de passe</label>               \r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"form-row\">              \r\n");
      out.write("              <div class=\"input-data\">  \r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"uname\" name=\"adresse\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Adresse </label>                \r\n");
      out.write("              </div>            \r\n");
      out.write("           </div>\r\n");
      out.write("                 <br />\r\n");
      out.write("                 <div class=\"form-row submit-btn\">\r\n");
      out.write("                    <div class=\"input-data\">\r\n");
      out.write("                       <div class=\"inner\"></div>\r\n");
      out.write("                       <input type=\"submit\" value=\"s'inscrire\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("        </form>\r\n");
      out.write("     </div>\r\n");
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
