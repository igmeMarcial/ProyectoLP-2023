/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2023-04-13 23:48:59 UTC
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
      out.write("<!DOCTYPE >\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/mainPrincipal.css\" />\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css2?family=Playball&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,600;0,700;0,800;1,700&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("\t\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\" />\r\n");
      out.write("\t\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\" />\r\n");
      out.write("\t\t<link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t\t<title>Principal</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- ======= Header(Cabezera) ======= -->\r\n");
      out.write("\t\t<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\t\t\t<div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("\t\t\t\t<a href=\"Main.jsp\" class=\"logo d-flex align-items-center text-decoration-none\">\r\n");
      out.write("\t\t\t\t\t<img class=\"logoImg1 d-none d-lg-block\" src=\"./img/logo-somosngr.svg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t<img class=\"logoImg2 d-block d-lg-none\" src=\"./img/logo-ngr.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t<span class=\"d-none d-lg-block\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<i class=\"ri-menu-line toggle-sidebar-btn\"></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Fin Logo -->\r\n");
      out.write("\t\t\t<!-- Input para Buscar jeje-->\r\n");
      out.write("\t\t\t<div class=\"search-bar\">\r\n");
      out.write("\t\t\t\t<form class=\"search-form d-flex align-items-center my-auto\" method=\"POST\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"query\" placeholder=\"Buscar\" title=\"Enter search keyword\" />\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" title=\"Buscar\"><i class=\"ri-search-line\"></i></button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Fin Buscar  -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<nav class=\"header-nav ms-auto\">\r\n");
      out.write("\t\t\t\t<ul class=\"d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item d-block d-lg-none\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-icon search-bar-toggle p-0\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ri-search-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!-- Fin Buscar Icon-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-icon p-0\" href=\"#\" data-bs-toggle=\"dropdown\" id=\"noti\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ri-notification-3-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"badge bg-primary badge-number\">2</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<!-- End Notification Icon -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notificaciones\" aria-labelledby=\"noti\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<!-- Final notificación Dropdown Items -->\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!-- Final Notification Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-icon p-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ri-chat-1-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"badge bg-success badge-number\">5</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<!-- Final mensajes Icon -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<!-- Final Mensajes Dropdown Items -->\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!--Final Mensajes Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown pe-3\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"./img/userImg.png\" alt=\"Profile\" class=\"rounded-circle\" />\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"d-none d-md-block dropdown-toggle ps-2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<!-- End Profile Iamge Icon -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr class=\"dropdown-divider\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item d-flex align-items-center\" href=\"ControladorPerfil?accion=perfil\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Mi Perfil</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr class=\"dropdown-divider\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item d-flex align-items-center\" href=\"ControladorPerfil?accion=perfil\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Configuración</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr class=\"dropdown-divider\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item d-flex align-items-center\" href=\"ControladorPerfil?accion=perfil\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Ayuda?</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr class=\"dropdown-divider\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item d-flex align-items-center\" href=\"ControladorUsuario?accion=Salir\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ri-settings-2-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Salir</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<!-- Final Perfil Dropdown Items -->\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!--Final Profile Nav -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- Final Icons Navigation -->\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Final Header -->\r\n");
      out.write("\t\t<aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\t\t\t<ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"Main.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"bi bi-grid\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Inicio</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- final Dashboard Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#employes-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-contacts-fill\"></i><span>Empleado</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"employes-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorCrud?accion=registrarEmpleado\"> <i class=\"ri-group-fill\"></i><span>Agregar Nuevo Empleado</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorCrud?accion=listarEmpleados\"> <i class=\"ri-group-fill\"></i><span>Listar Empleados</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final componentes Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#category-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-stack-line\"></i><span>Categoria</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"category-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorCategoria?accion=registrarCategoria\"> <i class=\"bi bi-circle\"></i><span>Agregar nuevo Categoria</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorCategoria?accion=listarCategorias\"> <i class=\"bi bi-circle\"></i><span>Listar Categorias</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final Formulario Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#provaider-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-slideshow-line\"></i><span>Proveedor</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"provaider-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorProveedor?accion=registrarProveedor\"> <i class=\"bi bi-circle\"></i><span>Agregar nuevo Proveedor</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorProveedor?accion=listarProveedores\"> <i class=\"bi bi-circle\"></i><span>Listar Proveedores</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- End Tables Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#inventory-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-todo-line\"></i><span>Inventario</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"inventory-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorInventario?accion=registrarInventario\"> <i class=\"bi bi-circle\"></i><span>Agregar Inventario Nuevo</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorInventario?accion=listarInventarios\"> <i class=\"bi bi-circle\"></i><span>Listar Inventarios</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- End Charts Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#team-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-book-open-line\"></i><span>Equipo</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"team-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorEquipo?accion=registrarEquipo\"> <i class=\"bi bi-circle\"></i><span>Agregar nuevo Equipo</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorEquipo?accion=listarEquipos\"> <i class=\"bi bi-circle\"></i><span>Listar Equipos</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final iconos Nav -->\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" data-bs-target=\"#details-nav\" data-bs-toggle=\"collapse\" href=\"#\"> <i class=\"ri-numbers-line\"></i><span>Detalles</span><i class=\"ri-arrow-down-s-line ms-auto\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"details-nav\" class=\"nav-content collapse\" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorDatalles?accion=entradas\"> <i class=\"bi bi-circle\"></i><span>Entradas</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ControladorDetalles?accion=salidas\"> <i class=\"bi bi-circle\"></i><span>Salidas</span> </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final iconos Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-heading\">Configuraciones</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorPerfil?accion=perfil\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Perfil</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final Profile Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorCrud?accion=empresa\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Empresa</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- End F.A.Q Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorCrud?accion=contacto\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Contacto</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final Contact Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorCrud?accion=registro\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Registro</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final Registro Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorCrud?accion=login\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Login</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- Final Login Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"ControladorCrud?accion=error\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"ri-file-chart-line\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span>Error 404</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Final Sidebar-->\r\n");
      out.write("\t\t<!-- ======= Contenido principal======= -->\r\n");
      out.write("\r\n");
      out.write("\t\t<main id=\"main\" class=\"main main-principal\">\r\n");
      out.write("\t\t\t<section class=\"hero\" id=\"section_1\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5 col-12 m-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hero-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"text-white\"><span class=\"text-light\">¡Bienvenidos</span> a somos <span>NGR!</span></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"phrase-text\">Conoce todo lo que tenemos para ti</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#section_2\" class=\"custom-link bi-arrow-down arrow-icon\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"video-wrap\">\r\n");
      out.write("\t\t\t\t\t<video autoplay=\"\" loop=\"\" muted=\"\" class=\"custom-video\" poster=\"\">\r\n");
      out.write("\t\t\t\t\t\t<source src=\"./img/videongr.mp4\" type=\"video/mp4\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tSu navegador no soporta la etiqueta de vídeo.\r\n");
      out.write("\t\t\t\t\t</video>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"highlight\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"highlight-thumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./img/DSC_6826.webp\" class=\"highlight-image img-fluid\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"highlight-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"highlight-title\">PASIÓN POR SERVIR</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"bi-youtube highlight-icon\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"highlight-thumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./img/DSC_0267.webp\" class=\"highlight-image img-fluid\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"highlight-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"highlight-title\">OBSESIÓN POR LA CALIDAD</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"bi-youtube highlight-icon\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"highlight-thumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./img/DSC_9554.webp\" class=\"highlight-image img-fluid\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"highlight-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"highlight-title\">MENTALIDAD DE APRENÍZ</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"bi-youtube highlight-icon\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section id=\"marcas\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"marcas-title\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Conoce más de nuestras marcas <img src=\"http://admin.trabajaenngr.com.pe/photos/shares/NGR/ngr-title-decorator.png\" /></h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"marcas-slider\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"marcas-list-content d-flex justify-content-center align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"slick-track marcas-list d-flex justify-content-center align-items-center\" style=\"opacity: 1; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide slick-current slick-center\" data-slick-index=\"0\" aria-hidden=\"true\" style=\"width: 119px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/bembos-001\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/bembos/bembos-logo-carousel.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide\" data-slick-index=\"1\" aria-hidden=\"true\" style=\"width: 149px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/don-belisario-006\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/don-belisario/don-belisario-logo-carousel.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide\" data-slick-index=\"2\" aria-hidden=\"true\" style=\"width: 149px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/popeyes-007\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/popeyes/popeyes-logo-carousel20.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide\" data-slick-index=\"3\" aria-hidden=\"true\" style=\"width: 149px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/papa-johns-009\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/papa-johns/papa-johns-logo-carousel.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide\" data-slick-index=\"4\" aria-hidden=\"true\" style=\"width: 149px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/chinawok-008\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/china-wok/chinawok-logo-carousel.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick-slide\" data-slick-index=\"5\" aria-hidden=\"true\" style=\"width: 149px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/empresa/dunkin-donuts-010\" tabindex=\"-1\" style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://admin.trabajaenngr.com.pe/photos/shares/dunkin-donuts/dunkin-donuts-carrusel20.png\" class=\"img-fluid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</main>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- ======= Footer ======= -->\r\n");
      out.write("\r\n");
      out.write("\t\t<footer id=\"footer\" class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"site-footer\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row justify-content-around\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./img/logo-ngr-white.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /.widget -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget socialContent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Siguenos en:</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social d-flex justify-content-start align-items-center px-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a><i class=\"ri-linkedin-fill\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a><i class=\"ri-facebook-fill\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /.widget -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 ml-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget text-start link-container-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"footer-subTitle\">Por categoría</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled float-left links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">Política de datos personales</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\"> Encargados del tratamiento</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">Empresas y socios estratégicos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">Derechos ARCO</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /.widget -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget text-start\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"footer-subTitle\">Contacto</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<address class=\"links\">Direccion no lo sé</address>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled links mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">99999999</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">2333333</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"links\" href=\"#\">ntg.gmail.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /.widget -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.col-lg-3 -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row mt-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-12 text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"mb-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t. Todos los Derechos Reservados. &mdash; Creado y desarrollado por <a href=\"#\">Igme</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- License information: igmreGroup -->\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.container -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.site-footer -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\t\t<!-- Sistema JS Files -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script src=\"./script/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
