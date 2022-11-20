package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productform_0020_00282_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <title>Admin- Gestion des produits</title>\r\n");
      out.write("      <link href=\"style/forms.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      <link href=\"style/uploadimage.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      <script src=\"script/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("      <script src=\"script/categorie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"text\">Ajouter un produit </div>\r\n");
      out.write("        <form action=\"addProduct\" method=\"GET\">\r\n");
      out.write("      \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("      <div class=\"containerc\">\r\n");
      out.write("         <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"image\">\r\n");
      out.write("               <img src=\"\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("               <div class=\"icon\">\r\n");
      out.write("                  <i class=\"fas fa-cloud-upload-alt\"></i>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"text\">\r\n");
      out.write("                  Veuillez choisir un fichier!\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"cancel-btn\">\r\n");
      out.write("               <i class=\"fas fa-times\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"file-name\">\r\n");
      out.write("               Nom du fichier!\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <button onclick=\"defaultBtnActive()\" id=\"custom-btn\">Choisir un fichier</button>\r\n");
      out.write("         <input id=\"default-btn\" type=\"file\" hidden>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script>\r\n");
      out.write("         const wrapper = document.querySelector(\".wrapper\");\r\n");
      out.write("         const fileName = document.querySelector(\".file-name\");\r\n");
      out.write("         const defaultBtn = document.querySelector(\"#default-btn\");\r\n");
      out.write("         const customBtn = document.querySelector(\"#custom-btn\");\r\n");
      out.write("         const cancelBtn = document.querySelector(\"#cancel-btn i\");\r\n");
      out.write("         const img = document.querySelector(\"img\");\r\n");
      out.write("         let regExp = /[0-9a-zA-Z\\^\\&\\'\\@\\{\\}\\[\\]\\,$\\=\\!\\-#\\(\\)\\.%\\+\\~\\_ ]+$/;\r\n");
      out.write("         function defaultBtnActive(){\r\n");
      out.write("           defaultBtn.click();\r\n");
      out.write("         }\r\n");
      out.write("         defaultBtn.addEventListener(\"change\", function(){\r\n");
      out.write("           const file = this.files[0];\r\n");
      out.write("           if(file){\r\n");
      out.write("             const reader = new FileReader();\r\n");
      out.write("             reader.onload = function(){\r\n");
      out.write("               const result = reader.result;\r\n");
      out.write("               img.src = result;\r\n");
      out.write("               wrapper.classList.add(\"active\");\r\n");
      out.write("             }\r\n");
      out.write("             cancelBtn.addEventListener(\"click\", function(){\r\n");
      out.write("               img.src = \"\";\r\n");
      out.write("               wrapper.classList.remove(\"active\");\r\n");
      out.write("             })\r\n");
      out.write("             reader.readAsDataURL(file);\r\n");
      out.write("           }\r\n");
      out.write("           if(this.value){\r\n");
      out.write("             let valueStore = this.value.match(regExp);\r\n");
      out.write("             fileName.textContent = valueStore;\r\n");
      out.write("           }\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("           <div class=\"form-row\">\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"text\" name=\"nom\"  required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Nom du produit:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"text\" name=\"designation\"  required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Désignation:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"form-row\">\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"text\" name=\"prix\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Prix:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"input-data\">\r\n");
      out.write("                  <input type=\"text\" name=\"unite\" required>\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Unité:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-data\">\r\n");
      out.write("                <div class=\"underline\"></div>\r\n");
      out.write("                <label for=\"\">Marque:</label>                    \r\n");
      out.write("                    <div style=\"width:200px; \">\r\n");
      out.write("                        <select id=\"marques\" name=\"marques\" ></select> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"input-data\">\r\n");
      out.write("                <div class=\"underline\"></div>\r\n");
      out.write("                <label for=\"\">Catégorie:</label>                    \r\n");
      out.write("                    <div class=\"custom-select\" style=\"width:200px;\">\r\n");
      out.write("                        <select id=\"categories\" name=\"categories\" ></select> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>                \r\n");
      out.write("                \r\n");
      out.write("           </div>                  \r\n");
      out.write("           <div class=\"form-row\">\r\n");
      out.write("              <div class=\"input-data textarea\">\r\n");
      out.write("                 <textarea rows=\"8\" cols=\"80\" required></textarea>\r\n");
      out.write("                 <br />\r\n");
      out.write("                 <div class=\"underline\"></div>\r\n");
      out.write("                 <label for=\"\">Description:</label>\r\n");
      out.write("                 <br />\r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("            <div class=\"form-row submit-btn\">\r\n");
      out.write("                <div class=\"input-data\">\r\n");
      out.write("                    <div class=\"inner\"></div>\r\n");
      out.write("                    <input type=\"submit\" name=\"envoi\" value=\"Ajouter le produit\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>      \r\n");
      out.write("          \r\n");
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
