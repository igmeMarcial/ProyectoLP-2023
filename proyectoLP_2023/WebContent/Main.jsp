<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
<title>Principal</title>
</head>
<body>
	 <!-- ======= Header(Cabezera) ======= -->
<header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="index.html" class="logo d-flex align-items-center text-decoration-none">
        <img src="./img/user.png" alt="">
        <span class="d-none d-lg-block">GRUPO S.A.C</span>
      </a>
      <i class="ri-menu-fill toggle-sidebar-btn"></i>
    </div>
    <!-- Fin Logo -->
		<!-- Input para Buscar jeje-->
    <div class="search-bar">
      <form class="search-form d-flex align-items-center" method="POST" action="#">
        <input type="text" name="query" placeholder="Buscar" title="Enter search keyword">
        <button type="submit" title="Buscar"><i class="ri-search-line"></i></button>
      </form>
    </div><!-- Fin Buscar  -->
	
    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item d-block d-lg-none">
          <a class="nav-link nav-icon search-bar-toggle p-0" href="#">
            <i class="ri-search-line"></i>
          </a>
        </li><!-- Fin Buscar Icon-->

        <li class="nav-item dropdown">

		  <a class="nav-link nav-icon p-0" href="#" data-bs-toggle="dropdown" id="noti" aria-expanded="false">         
            <i class="ri-notification-3-line"></i>
            <span class="badge bg-primary badge-number">2</span>
          </a><!-- End Notification Icon -->
		   <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow notificaciones" aria-labelledby="noti">
           	  <li><a class="dropdown-item" href="#">Action</a></li>
    		<li><a class="dropdown-item" href="#">Another action</a></li>
    		<li><a class="dropdown-item" href="#">Something else here</a></li>
			   
          </ul><!-- Final notificación Dropdown Items -->
		  
		  

        </li><!-- Final Notification Nav -->

        <li class="nav-item dropdown">

          <a class="nav-link nav-icon p-0" href="#" data-bs-toggle="dropdown">
            <i class="ri-chat-1-line"></i>
            <span class="badge bg-success badge-number">5</span>
          </a><!-- Final mensajes Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow messages">
             <li><a class="dropdown-item" href="#">Action</a></li>
    		<li><a class="dropdown-item" href="#">Another action</a></li>
    		<li><a class="dropdown-item" href="#">Something else here</a></li>

          </ul><!-- Final Mensajes Dropdown Items -->

        </li><!--Final Mensajes Nav -->

        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="./img/user.png" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">M. Igme</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>Marcial Igme</h6>
              <span>Administrador</span>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="users-profile.html">
                <i class="ri-settings-2-line"></i>
                <span>My Perfil</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="users-profile.html">
                <i class="ri-settings-2-line"></i>
                <span>Configuración</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="pages-faq.html">
                <i class="ri-settings-2-line"></i>
                <span>Ayuda?</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="#">
                <i class="ri-settings-2-line"></i>
                <span>Salir</span>
              </a>
            </li>

          </ul><!-- Final Perfil Dropdown Items -->
        </li><!--Final Profile Nav -->

      </ul>
    </nav><!-- Final Icons Navigation -->

</header>
<!-- Final Header -->
<aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="index.html">
          <i class="bi bi-grid"></i>
          <span>Inicio</span>
        </a>
      </li><!-- final Dashboard Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
          <i class="ri-file-list-line"></i><span>Clientes</span><i class="ri-arrow-down-s-line ms-auto"></i>
          
          
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="components-alerts.html">
              <i class="ri-group-fill"></i><span>Listado Clientes</span>
            </a>
          </li>
          <li>
            <a href="components-accordion.html">
              <i class="ri-group-fill"></i><span>Agregar Nuevo Cliente</span>
            </a>
          </li>
          <li>
            <a href="components-badges.html">
             	<i class="ri-group-fill"></i><span>Buscar Cliente</span>
            </a>
          </li>
          <li>
            <a href="components-breadcrumbs.html">
              <i class="ri-group-fill"></i><span>ActualizarClientes</span>
            </a>
          </li>
        </ul>
      </li><!-- Final componentes Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#forms-nav" data-bs-toggle="collapse" href="#">
          <i class="ri-stack-line"></i><span>Categorias</span><i class="ri-arrow-down-s-line ms-auto"></i>
        </a>
        <ul id="forms-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="forms-elements.html">
              <i class="bi bi-circle"></i><span>Agregar Categoria</span>
            </a>
          </li>
          <li>
            <a href="forms-layouts.html">
              <i class="bi bi-circle"></i><span>Actualizar Categoria</span>
            </a>
          </li>
          <li>
            <a href="forms-editors.html">
              <i class="bi bi-circle"></i><span>Listar Categoria</span>
            </a>
          </li>
        </ul>
      </li><!-- Final Formulario Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#tables-nav" data-bs-toggle="collapse" href="#">
          <i class="ri-slideshow-line"></i><span>Marcas</span><i class="ri-arrow-down-s-line ms-auto"></i>
        </a>
        <ul id="tables-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Agregar Marca</span>
            </a>
          </li>
          <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Actualizar Marca</span>
            </a>
          </li>
           <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Listar Marca</span>
            </a>
          </li>
        </ul>
      </li><!-- End Tables Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#charts-nav" data-bs-toggle="collapse" href="#">
          <i class="ri-todo-line"></i><span>Proveedores</span><i class="ri-arrow-down-s-line ms-auto"></i>
        </a>
        <ul id="charts-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Agregar Proveedor</span>
            </a>
          </li>
          <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Actuzalir Porveedor</span>
            </a>
          </li>
          <li>
            <a href="#">
              <i class="bi bi-circle"></i><span>Listar Proveedor</span>
            </a>
          </li>
        </ul>
      </li><!-- End Charts Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#icons-nav" data-bs-toggle="collapse" href="#">
          <i class="ri-book-open-line"></i><span>Prodcutos</span><i class="ri-arrow-down-s-line ms-auto"></i>
        </a>
        <ul id="icons-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="icons-bootstrap.html">
              <i class="bi bi-circle"></i><span>Agreagr Producto</span>
            </a>
          </li>
          <li>
            <a href="icons-remix.html">
              <i class="bi bi-circle"></i><span>Actualizar Producto</span>
            </a>
          </li>
          <li>
            <a href="icons-boxicons.html">
              <i class="bi bi-circle"></i><span>Buscar Prodcuto</span>
            </a>
          </li>
        </ul>
      </li><!-- Final iconos Nav -->

      <li class="nav-heading">Configuraciones</li>

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
          <i class="ri-file-chart-line"></i>
          <span>Perfil</span>
        </a>
      </li><!-- Final Profile Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
          <i class="ri-file-chart-line"></i>
          <span>Empresa</span>
        </a>
      </li><!-- End F.A.Q Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
          <i class="ri-file-chart-line"></i>
          <span>Contacto</span>
        </a>
      </li><!-- Final Contact Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
          <i class="ri-file-chart-line"></i>
          <span>Registro</span>
        </a>
      </li><!-- Final Registro Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
          <i class="ri-file-chart-line"></i>
          <span>Login</span>
        </a>
      </li><!-- Final Login Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="#">
         <i class="ri-file-chart-line"></i>
          <span>Error 404</span>
        </a>
      </li>
    </ul>

</aside><!-- Final Sidebar-->
   <!-- ======= Contenido principal======= -->
<main id="main" class="main">
    
 
</main>
   <!-- ======= Footer ======= -->
  <!--  
<footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>Igme</span></strong>. Todos los derechos reservados
    </div>
    <div class="credits">
    
    </div>
</footer>-->
<!-- End Footer -->

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
   <!-- Sistema JS Files -->

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  
  
  <script src="./script/main.js" type="text/javascript"></script>
</body>
</html>