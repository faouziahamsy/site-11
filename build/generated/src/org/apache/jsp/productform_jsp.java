package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <title>Admin- Gestion des produits</title>\n");
      out.write("      <link href=\"css/forms.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <link href=\"css/uploadimage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"text\">Ajouter un produit </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("      <div class=\"containerc\">\n");
      out.write("         <div class=\"wrapper\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("               <img src=\"\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("               <div class=\"icon\">\n");
      out.write("                  <i class=\"fas fa-cloud-upload-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"text\">\n");
      out.write("                  Veuillez choisir un fichier!\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"cancel-btn\">\n");
      out.write("               <i class=\"fas fa-times\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"file-name\">\n");
      out.write("               Nom du fichier!\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <button onclick=\"defaultBtnActive()\" id=\"custom-btn\">Choisir un fichier</button>\n");
      out.write("         <input id=\"default-btn\" type=\"file\" hidden>\n");
      out.write("      </div>\n");
      out.write("      <script>\n");
      out.write("         const wrapper = document.querySelector(\".wrapper\");\n");
      out.write("         const fileName = document.querySelector(\".file-name\");\n");
      out.write("         const defaultBtn = document.querySelector(\"#default-btn\");\n");
      out.write("         const customBtn = document.querySelector(\"#custom-btn\");\n");
      out.write("         const cancelBtn = document.querySelector(\"#cancel-btn i\");\n");
      out.write("         const img = document.querySelector(\"img\");\n");
      out.write("         let regExp = /[0-9a-zA-Z\\^\\&\\'\\@\\{\\}\\[\\]\\,$\\=\\!\\-#\\(\\)\\.%\\+\\~\\_ ]+$/;\n");
      out.write("         function defaultBtnActive(){\n");
      out.write("           defaultBtn.click();\n");
      out.write("         }\n");
      out.write("         defaultBtn.addEventListener(\"change\", function(){\n");
      out.write("           const file = this.files[0];\n");
      out.write("           if(file){\n");
      out.write("             const reader = new FileReader();\n");
      out.write("             reader.onload = function(){\n");
      out.write("               const result = reader.result;\n");
      out.write("               img.src = result;\n");
      out.write("               wrapper.classList.add(\"active\");\n");
      out.write("             }\n");
      out.write("             cancelBtn.addEventListener(\"click\", function(){\n");
      out.write("               img.src = \"\";\n");
      out.write("               wrapper.classList.remove(\"active\");\n");
      out.write("             })\n");
      out.write("             reader.readAsDataURL(file);\n");
      out.write("           }\n");
      out.write("           if(this.value){\n");
      out.write("             let valueStore = this.value.match(regExp);\n");
      out.write("             fileName.textContent = valueStore;\n");
      out.write("           }\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <div class=\"form-row\">\n");
      out.write("              <div class=\"input-data\">\n");
      out.write("                 <input type=\"text\" required>\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Nom du produit:</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-data\">\n");
      out.write("                 <input type=\"text\" required>\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Désignation:</label>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-row\">\n");
      out.write("              <div class=\"input-data\">\n");
      out.write("                 <input type=\"text\" required>\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Prix:</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-data\">\n");
      out.write("                 <input type=\"text\" required>\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Unité:</label>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                <div class=\"input-data\">\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("                <label for=\"\">Marque:</label>                    \n");
      out.write("                    <div style=\"width:200px; \">\n");
      out.write("                        <select id=\"marques\" name=\"marques\"></select> \n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-data\">\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("                <label for=\"\">Catégorie:</label>                    \n");
      out.write("                    <div class=\"custom-select\" style=\"width:200px;\">\n");
      out.write("                        <select id=\"categories\" name=\"categories\"></select> \n");
      out.write("                    </div>\n");
      out.write("                </div>                \n");
      out.write("                \n");
      out.write("           </div>                  \n");
      out.write("           <div class=\"form-row\">\n");
      out.write("              <div class=\"input-data textarea\">\n");
      out.write("                 <textarea rows=\"8\" cols=\"80\" required></textarea>\n");
      out.write("                 <br />\n");
      out.write("                 <div class=\"underline\"></div>\n");
      out.write("                 <label for=\"\">Description:</label>\n");
      out.write("                 <br />\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("     \n");
      out.write("            <div class=\"form-row submit-btn\">\n");
      out.write("                <div class=\"input-data\">\n");
      out.write("                    <div class=\"inner\"></div>\n");
      out.write("                    <input type=\"submit\" value=\"Ajouter le produit\">\n");
      out.write("                </div>\n");
      out.write("                </div>      \n");
      out.write("          \n");
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
