package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Produit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link href=\"css/forms.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write(" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write(" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write(" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div class=\"container\">\n");
      out.write(" <hr>\n");
      out.write("  <div class=\"row col-md-10 col-md-offset-3\"> \n");
      out.write("   \n");
      out.write("   <div class=\"card card-body\">\n");
      out.write("   \n");
      out.write("    <h2>Produit Form</h2>\n");
      out.write("    <div class=\"col-md-8 col-md-offset-3\">\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("       <label for=\"uname\">Nom du produit:</label> <input type=\"text\"\n");
      out.write("        class=\"form-control\" id=\"uname\" placeholder=\"nom\"\n");
      out.write("        name=\"nom\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("       <label for=\"uname\">Description:</label> <input type=\"text\"\n");
      out.write("        class=\"form-control\" id=\"uname\" placeholder=\"description\"\n");
      out.write("        name=\"description\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("       <label for=\"uname\">Designation:</label> <input type=\"text\"\n");
      out.write("        class=\"form-control\" id=\"uname\" placeholder=\"designation\"\n");
      out.write("        name=\"designation\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("       <label for=\"uname\">unite:</label> <input type=\"text\"\n");
      out.write("        class=\"form-control\" id=\"username\" placeholder=\"unite\"\n");
      out.write("        name=\"unite\" required>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("       <label for=\"uname\">image:</label> <input type=\"text\"\n");
      out.write("        class=\"form-control\" id=\"username\" placeholder=\"image\"\n");
      out.write("        name=\"unite\" required>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                <div class=\"input-data\">\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("                <label for=\"marque\">Marque:</label>  \n");
      out.write("                 \n");
      out.write("                    <div >\n");
      out.write("                        <select id=\"marques\" name=\"marques\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"input-data\">\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("                <label for=\"categorie\">categoriee:</label>                    \n");
      out.write("                    <div >\n");
      out.write("                        <select id=\"categorie\" name=\"categorie\">\n");
      out.write("                         \n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("     </form>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("marque");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${marques}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                   <option>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${marque.getDesignation()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
