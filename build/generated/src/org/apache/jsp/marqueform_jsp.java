package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marqueform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <title>Admin- Gestion des marques</title>\n");
      out.write("      <link href=\"style/forms.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"text\">Ajouter une marque</div>\n");
      out.write("        <form action=\"addMarque\" method=\"GET\">\n");
      out.write("\n");
      out.write("           <div class=\"form-row\">\n");
      out.write("              <div class=\"input-data\">\n");
      out.write("                 <input type=\"text\" required>\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Nom de la marque:</label>\n");
      out.write("              </div>   \n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("            <div class=\"form-row submit-btn\">\n");
      out.write("                <div class=\"input-data\">\n");
      out.write("                    <div class=\"inner\"></div>\n");
      out.write("                    <input type=\"submit\" value=\"Ajouter la marque\">\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("     </div>\n");
      out.write("   </body>\n");
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
