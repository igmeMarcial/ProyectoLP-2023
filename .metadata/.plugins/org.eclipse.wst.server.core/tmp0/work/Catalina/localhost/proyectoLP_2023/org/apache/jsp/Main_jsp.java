/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2023-03-16 03:31:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\" />\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Principal</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t <!-- ======= Header(Cabezera) ======= -->\r\n");
      out.write("<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("      <a href=\"index.html\" class=\"logo d-flex align-items-center text-decoration-none\">\r\n");
      out.write("        <img src=\"./img/user.png\" alt=\"\">\r\n");
      out.write("        <span class=\"d-none d-lg-block\">GRUPO S.A.C</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <i class=\"ri-menu-fill toggle-sidebar-btn\"></i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin Logo -->\r\n");
      out.write("\t\t<!-- Input para Buscar jeje-->\r\n");
      out.write("    <div class=\"search-bar\">\r\n");
      out.write("      <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"#\">\r\n");
      out.write("        <input type=\"text\" name=\"query\" placeholder=\"Buscar\" title=\"Enter search keyword\">\r\n");
      out.write("        <button type=\"submit\" title=\"Buscar\"><i class=\"ri-search-line\"></i></button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div><!-- Fin Buscar  -->\r\n");
      out.write("\t\r\n");
      out.write("    <nav class=\"header-nav ms-auto\">\r\n");
      out.write("      <ul class=\"d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item d-block d-lg-none\">\r\n");
      out.write("          <a class=\"nav-link nav-icon search-bar-toggle p-0\" href=\"#\">\r\n");
      out.write("            <i class=\"ri-search-line\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li><!-- Fin Buscar Icon-->\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t  <a class=\"nav-link nav-icon p-0\" href=\"#\" data-bs-toggle=\"dropdown\" id=\"noti\" aria-expanded=\"false\">         \r\n");
      out.write("            <i class=\"ri-notification-3-line\"></i>\r\n");
      out.write("            <span class=\"badge bg-primary badge-number\">2</span>\r\n");
      out.write("          </a><!-- End Notification Icon -->\r\n");
      out.write("\t\t   <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notificaciones\" aria-labelledby=\"noti\">\r\n");
      out.write("           \t  <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("    \t\t<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("    \t\t<li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("\t\t\t   \r\n");
      out.write("          </ul><!-- Final notificación Dropdown Items -->\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\r\n");
      out.write("        </li><!-- Final Notification Nav -->\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("          <a class=\"nav-link nav-icon p-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("            <i class=\"ri-chat-1-line\"></i>\r\n");
      out.write("            <span class=\"badge bg-success badge-number\">5</span>\r\n");
      out.write("          </a><!-- Final mensajes Icon -->\r\n");
      out.write("\r\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\r\n");
      out.write("             <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("    \t\t<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("    \t\t<li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("\r\n");
      out.write("          </ul><!-- Final Mensajes Dropdown Items -->\r\n");
      out.write("\r\n");
      out.write("        </li><!--Final Mensajes Nav -->\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item dropdown pe-3\">\r\n");
      out.write("\r\n");
      out.write("          <a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("            <img src=\"./img/user.png\" alt=\"Profile\" class=\"rounded-circle\">\r\n");
      out.write("            <span class=\"d-none d-md-block dropdown-toggle ps-2\">M. Igme</span>\r\n");
      out.write("          </a><!-- End Profile Iamge Icon -->\r\n");
      out.write("\r\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\r\n");
      out.write("            <li class=\"dropdown-header\">\r\n");
      out.write("              <h6>Marcial Igme</h6>\r\n");
      out.write("              <span>Administrador</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"users-profile.html\">\r\n");
      out.write("                <i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("                <span>My Perfil</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"users-profile.html\">\r\n");
      out.write("                <i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("                <span>Configuración</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"pages-faq.html\">\r\n");
      out.write("                <i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("                <span>Ayuda?</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                <i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("                <span>Salir</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("          </ul><!-- Final Perfil Dropdown Items -->\r\n");
      out.write("        </li><!--Final Profile Nav -->\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav><!-- Final Icons Navigation -->\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<!-- Final Header -->\r\n");
      out.write("<aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link \" href=\"index.html\">\r\n");
      out.write("          <i class=\"bi bi-grid\"></i>\r\n");
      out.write("          <span>Inicio</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- final Dashboard Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-list-line\"></i><span>Clientes</span><i class=\"ri-arrow-down-s-line ms-auto\"></i>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"components-alerts.html\">\r\n");
      out.write("              <i class=\"ri-group-fill\"></i><span>Listado Clientes</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"components-accordion.html\">\r\n");
      out.write("              <i class=\"ri-group-fill\"></i><span>Agregar Nuevo Cliente</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"components-badges.html\">\r\n");
      out.write("             \t<i class=\"ri-group-fill\"></i><span>Buscar Cliente</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"components-breadcrumbs.html\">\r\n");
      out.write("              <i class=\"ri-group-fill\"></i><span>ActualizarClientes</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- Final componentes Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#forms-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-stack-line\"></i><span>Categorias</span><i class=\"ri-arrow-down-s-line ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"forms-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"forms-elements.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Agregar Categoria</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"forms-layouts.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Actualizar Categoria</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"forms-editors.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Listar Categoria</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- Final Formulario Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#tables-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-slideshow-line\"></i><span>Marcas</span><i class=\"ri-arrow-down-s-line ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"tables-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Agregar Marca</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Actualizar Marca</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Listar Marca</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- End Tables Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#charts-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-todo-line\"></i><span>Proveedores</span><i class=\"ri-arrow-down-s-line ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"charts-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Agregar Proveedor</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Actuzalir Porveedor</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Listar Proveedor</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- End Charts Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#icons-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-book-open-line\"></i><span>Prodcutos</span><i class=\"ri-arrow-down-s-line ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"icons-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"icons-bootstrap.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Agreagr Producto</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"icons-remix.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Actualizar Producto</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"icons-boxicons.html\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Buscar Prodcuto</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- Final iconos Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-heading\">Configuraciones</li>\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Perfil</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- Final Profile Page Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Empresa</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End F.A.Q Page Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Contacto</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- Final Contact Page Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Registro</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- Final Registro Page Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("          <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Login</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- Final Login Page Nav -->\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\">\r\n");
      out.write("         <i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("          <span>Error 404</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("</aside><!-- Final Sidebar-->\r\n");
      out.write("   <!-- ======= Contenido principal======= -->\r\n");
      out.write("<main id=\"main\" class=\"main\">\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("</main>\r\n");
      out.write("   <!-- ======= Footer ======= -->\r\n");
      out.write("  <!--  \r\n");
      out.write("<footer id=\"footer\" class=\"footer\">\r\n");
      out.write("    <div class=\"copyright\">\r\n");
      out.write("      &copy; Copyright <strong><span>Igme</span></strong>. Todos los derechos reservados\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"credits\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</footer>-->\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("   <!-- Sistema JS Files -->\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <script src=\"./script/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
