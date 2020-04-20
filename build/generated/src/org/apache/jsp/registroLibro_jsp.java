package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.EditorialDAO;
import model.Editorial;
import dao.CategoriaDAO;
import model.Categoria;

public final class registroLibro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("</br></br>\n");
      out.write("<div class=\"table-header\"><h1> Biblioteca Virtual</h1></div>\n");
      out.write("<br>\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"listarLibro.jsp\">\n");
      out.write("            Lista de Libros\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"registroLibro.jsp\">\n");
      out.write("            Registrar Libro\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href =\"registroEditorial.jsp\">\n");
      out.write("            Registrar Editorial\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("        <li>\n");
      out.write("        <a href =\"registroCategoria.jsp\">\n");
      out.write("            Registrar Categoria\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("</br>");
      out.write("\n");
      out.write("        <div class =\"form-control\">\n");
      out.write("            <div class=\"table-header\">\n");
      out.write("                Desde aquí puede añadir o eliminar un Libro\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"LibroController\" method=\"post\" class=\"form-horizontal\"\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                              ISBN:\n");
      out.write("                          </label>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                              <input type=\"text\" name=\"isbn\" value=\"\" placeholder=\"\"/>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                              Título de Libro:\n");
      out.write("                          </label>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                              <input type=\"text\" name=\"titulo\" value=\"\" placeholder=\"\"/>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                              Autor:\n");
      out.write("                          </label>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                              <input type=\"text\" name=\"autor\" value=\"\" placeholder=\"\"/>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                              Fecha de Publicación:\n");
      out.write("                          </label>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                              <input type=\"text\" name=\"publicacion\" value=\"\" placeholder=\"AAAA-MM-DD\"/>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label class=\"col-sm-3 control-label no-paddding-right\">\n");
      out.write("                                                                Categoría Temática:\n");
      out.write("                                                            </label>\n");
      out.write("                                                            <div class=\"col-sm-\">\n");
      out.write("                                                                <select name=\"categoria\">\n");
      out.write("                                                                    <option value=\"0\">Seleccione Categoria</option>\n");
      out.write("                                                                    ");
 for(Categoria c:CategoriaDAO.listar()){ 
      out.write("\n");
      out.write("                                                                    <option value=\"");
      out.print( c.getCodigo());
      out.write('"');
      out.write('>');
      out.print( c.getNombre());
      out.write("</option>\n");
      out.write("                                                                    ");
}
      out.write("\n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div> \n");
      out.write("                                                        </div>\n");
      out.write("                                                        \n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label class=\"col-sm-3 control-label no-paddding-right\">\n");
      out.write("                                                                Editorial:\n");
      out.write("                                                            </label>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <select name=\"editorial\">\n");
      out.write("                                                                    <option value=\"0\">Seleccione la Editorial</option>\n");
      out.write("                                                                    ");
 for(Editorial e:EditorialDAO.listar()){ 
      out.write("\n");
      out.write("                                                                    <option value=\"");
      out.print( e.getNit());
      out.write('"');
      out.write('>');
      out.print( e.getNombre() );
      out.write("</option>\n");
      out.write("                                                                    ");
}
      out.write("\n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div> \n");
      out.write("                                                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-sm-3 control-label no-padding-right\">\n");
      out.write("                              Descripcion:\n");
      out.write("                          </label>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                              <textarea \n");
      out.write("                                  name=\"descripcion\" rows=\"4\" cols=\"25\">\n");
      out.write("                              </textarea>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <br>\n");
      out.write("                      <div class=\"col-sm3\">\n");
      out.write("                          <button name=\"Registrar\" class=\"btn btn-success\" type=\"submit\" value=\"Registrar\"\n");
      out.write("                                      <i class=\"fa fa-save\"></i>\n");
      out.write("                                      Registrar\n");
      out.write("                          </button>  \n");
      out.write("                          <button name=\"Actualizar\" class=\"btn btn-warning\" type=\"submit\" value=\"Actualizar\"\n");
      out.write("                                      <i class=\"fa fa-edit\"></i>\n");
      out.write("                                      Actualizar\n");
      out.write("                          </button>  \n");
      out.write("                          <button name=\"Eliminar\" class=\"btn btn-danger\" type=\"submit\" value=\"Eliminar\"\n");
      out.write("                                  <i class=\"fa fa-remove\"></i>\n");
      out.write("                                      Eliminar\n");
      out.write("                          </button>    \n");
      out.write("                      </div>\n");
      out.write("                </form>\n");
      out.write("                <br>\n");
      out.write("                ");
      out.print((request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):""));
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}
