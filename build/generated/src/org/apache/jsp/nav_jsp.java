package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>site</title>\r\n");
      out.write("  <link href=\"style/nav.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("    <nav>\r\n");
      out.write("      <input type=\"checkbox\" id=\"show-search\">\r\n");
      out.write("      <input type=\"checkbox\" id=\"show-menu\">\r\n");
      out.write("      <label for=\"show-menu\" class=\"menu-icon\"><i class=\"fas fa-bars\"></i></label>\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("      <div class=\"logo\"><a href=\"#\">HABSHOP</a></div>\r\n");
      out.write("        <ul class=\"links\">\r\n");
      out.write("          <li><a href=\"#\">Accueil</a></li>\r\n");
      out.write("           <li>\r\n");
      out.write("            <a href=\"#\" class=\"desktop-link\">Catégories</a>\r\n");
      out.write("            <input type=\"checkbox\" id=\"categorie\">\r\n");
      out.write("            <label for=\"categorie\">Catégories</label>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\">font de teint</a></li>\r\n");
      out.write("              <li><a href=\"#\">Rouges a levres</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\" class=\"desktop-link\">Marques</a>\r\n");
      out.write("            <input type=\"checkbox\" id=\"marques\">\r\n");
      out.write("            <label for=\"marques\">Marques</label>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\">Maybelline</a></li>\r\n");
      out.write("              <li><a href=\"#\">Essence</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"\">Panier </a></li>\r\n");
      out.write("          <li><a href=\"Login.jsp\">Se connecter </a></li>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
