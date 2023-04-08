<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- para dar formato a las fechas -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE >
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" type="text/css" href="./css/nuevoEmpleado.css" />
		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Playball&display=swap" rel="stylesheet" />

		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,600;0,700;0,800;1,700&display=swap" rel="stylesheet" />

		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="./css/main.css" />
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
		<link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet" />
	
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
		
		<link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.3/dist/sweetalert2.min.css" rel="stylesheet">
			
		<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css" />
		<link rel="stylesheet" href="/resources/demos/style.css" />
		<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
		<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
		
		<script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>


		<script>
			$( function() {
				
				$("#getFechaCompleted").flatpickr();

			} );
		</script>
		<title>Principal</title>
	</head>
	<body>
		<!-- ======= Header(Cabezera) ======= -->
		<header id="header" class="header fixed-top d-flex align-items-center">
			<div class="d-flex align-items-center justify-content-between">
				<a href="Main.jsp" class="logo d-flex align-items-center text-decoration-none">
					<img class="logoImg1 d-none d-lg-block" src="./img/logo-somosngr.svg" alt="" />
					<img class="logoImg2 d-block d-lg-none" src="./img/logo-ngr.png" alt="" />
					<span class="d-none d-lg-block"></span>
				</a>
				<i class="ri-menu-line toggle-sidebar-btn"></i>
			</div>
			<!-- Fin Logo -->
			<!-- Input para Buscar jeje-->
			<div class="search-bar">
				<form class="search-form d-flex align-items-center my-auto" method="POST" action="#">
					<input type="text" name="query" placeholder="Buscar" title="Enter search keyword" />
					<button type="submit" title="Buscar"><i class="ri-search-line"></i></button>
				</form>
			</div>
			<!-- Fin Buscar  -->

			<nav class="header-nav ms-auto">
				<ul class="d-flex align-items-center">
					<li class="nav-item d-block d-lg-none">
						<a class="nav-link nav-icon search-bar-toggle p-0" href="#">
							<i class="ri-search-line"></i>
						</a>
					</li>
					<!-- Fin Buscar Icon-->

					<li class="nav-item dropdown">
						<a class="nav-link nav-icon p-0" href="#" data-bs-toggle="dropdown" id="noti" aria-expanded="false">
							<i class="ri-notification-3-line"></i>
							<span class="badge bg-primary badge-number">2</span>
						</a>
						<!-- End Notification Icon -->
						<ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow notificaciones" aria-labelledby="noti">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><a class="dropdown-item" href="#">Something else here</a></li>
						</ul>
						<!-- Final notificaci�n Dropdown Items -->
					</li>
					<!-- Final Notification Nav -->

					<li class="nav-item dropdown">
						<a class="nav-link nav-icon p-0" href="#" data-bs-toggle="dropdown">
							<i class="ri-chat-1-line"></i>
							<span class="badge bg-success badge-number">5</span>
						</a>
						<!-- Final mensajes Icon -->

						<ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow messages">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><a class="dropdown-item" href="#">Something else here</a></li>
						</ul>
						<!-- Final Mensajes Dropdown Items -->
					</li>
					<!--Final Mensajes Nav -->

					<li class="nav-item dropdown pe-3">
						<a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
							<img src="./img/userImg.png" alt="Profile" class="rounded-circle" />
							<span class="d-none d-md-block dropdown-toggle ps-2">${user}</span>
						</a>
						<!-- End Profile Iamge Icon -->

						<ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
							<li class="dropdown-header">
								<h6>${user}</h6>
								<span>${email}</span>
							</li>
							<li>
								<hr class="dropdown-divider" />
							</li>

							<li>
								<a class="dropdown-item d-flex align-items-center" href="ControladorPerfil?accion=perfil">
									<i class="ri-settings-2-line"></i>
									<span>My Perfil</span>
								</a>
							</li>
							<li>
								<hr class="dropdown-divider" />
							</li>

							<li>
								<a class="dropdown-item d-flex align-items-center" href="ControladorPerfil?accion=perfil">
									<i class="ri-settings-2-line"></i>
									<span>Configuraci�n</span>
								</a>
							</li>
							<li>
								<hr class="dropdown-divider" />
							</li>

							<li>
								<a class="dropdown-item d-flex align-items-center" href="ControladorPerfil?accion=perfil">
									<i class="ri-settings-2-line"></i>
									<span>Ayuda?</span>
								</a>
							</li>
							<li>
								<hr class="dropdown-divider" />
							</li>

							<li>
								<a class="dropdown-item d-flex align-items-center" href="ControladorUsuario?accion=Salir">
									<i class="ri-settings-2-line"></i>
									<span>Salir</span>
								</a>
							</li>
						</ul>
						<!-- Final Perfil Dropdown Items -->
					</li>
					<!--Final Profile Nav -->
				</ul>
			</nav>
			<!-- Final Icons Navigation -->
		</header>

		<!-- Final Header -->
		<aside id="sidebar" class="sidebar">
			<ul class="sidebar-nav" id="sidebar-nav">
				<li class="nav-item">
					<a class="nav-link" href="Main.jsp">
						<i class="bi bi-grid"></i>
						<span>Inicio</span>
					</a>
				</li>
				<!-- final Dashboard Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#employes-nav" data-bs-toggle="collapse" href="#"> <i class="ri-contacts-fill"></i><span>Empleado</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="employes-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorCrud?accion=registrarEmpleado"> <i class="ri-group-fill"></i><span>Agregar Nuevo Empleado</span> </a>
						</li>
						<li>
							<a href="ControladorCrud?accion=listarEmpleados"> <i class="ri-group-fill"></i><span>Listar Empleados</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final componentes Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#category-nav" data-bs-toggle="collapse" href="#"> <i class="ri-stack-line"></i><span>Categoria</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="category-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorCategoria?accion=registrarCategoria"> <i class="bi bi-circle"></i><span>Agregar nuevo Categoria</span> </a>
						</li>
						<li>
							<a href="ControladorCategoria?accion=listarCategorias"> <i class="bi bi-circle"></i><span>Listar Categorias</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final Formulario Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#provaider-nav" data-bs-toggle="collapse" href="#"> <i class="ri-slideshow-line"></i><span>Proveedor</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="provaider-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorProveedor?accion=registrarProveedor"> <i class="bi bi-circle"></i><span>Agregar nuevo Proveedor</span> </a>
						</li>
						<li>
							<a href="ControladorProveedor?accion=listarProveedores"> <i class="bi bi-circle"></i><span>Listar Proveedores</span> </a>
						</li>
					</ul>
				</li>
				<!-- End Tables Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#inventory-nav" data-bs-toggle="collapse" href="#"> <i class="ri-todo-line"></i><span>Inventario</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="inventory-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorInvetario?accion=registrarInventario"> <i class="bi bi-circle"></i><span>Agregar Inventario Nuevo</span> </a>
						</li>
						<li>
							<a href="ControladorInventario?accion=listarInventarios"> <i class="bi bi-circle"></i><span>Listar Inventarios</span> </a>
						</li>
					</ul>
				</li>
				<!-- End Charts Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#team-nav" data-bs-toggle="collapse" href="#"> <i class="ri-book-open-line"></i><span>Equipo</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="team-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorEquipo?accion=registrarEquipo"> <i class="bi bi-circle"></i><span>Agregar nuevo Equipo</span> </a>
						</li>
						<li>
							<a href="ControladorEquipo?accion=registrarEquipos"> <i class="bi bi-circle"></i><span>Listar Equipos</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final iconos Nav -->
				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#details-nav" data-bs-toggle="collapse" href="#"> <i class="ri-numbers-line"></i><span>Detalles</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="details-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorDetalle?accion=entradas"> <i class="bi bi-circle"></i><span>Entradas</span> </a>
						</li>
						<li>
							<a href="ControladorDetalle?accion=salidas"> <i class="bi bi-circle"></i><span>Salidas</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final iconos Nav -->

				<li class="nav-heading">Configuraciones</li>

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorPerfil?accion=perfil">
						<i class="ri-file-chart-line"></i>
						<span>Perfil</span>
					</a>
				</li>
				<!-- Final Profile Page Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorCrud?accion=empresa">
						<i class="ri-file-chart-line"></i>
						<span>Empresa</span>
					</a>
				</li>
				<!-- End F.A.Q Page Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorCrud?accion=contacto">
						<i class="ri-file-chart-line"></i>
						<span>Contacto</span>
					</a>
				</li>
				<!-- Final Contact Page Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorCrud?accion=registro">
						<i class="ri-file-chart-line"></i>
						<span>Registro</span>
					</a>
				</li>
				<!-- Final Registro Page Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorCrud?accion=login">
						<i class="ri-file-chart-line"></i>
						<span>Login</span>
					</a>
				</li>
				<!-- Final Login Page Nav -->

				<li class="nav-item">
					<a class="nav-link collapsed" href="ControladorCrud?accion=error">
						<i class="ri-file-chart-line"></i>
						<span>Error 404</span>
					</a>
				</li>
			</ul>
		</aside>

		<!-- Final Sidebar-->
		<!-- ======= Contenido principal======= -->
		<main id="main" class="main main-nuevoEmpleado">
			<div class="content-wrapper">
				<div class="container-xxl flex-grow-1 container-p-y">
					<h4 class="fw-bold py-3 mb-4"><span class="text-muted fw-light">Actualizar/</span> Categoria</h4>
					<div class="container-fluid py-4 responsive-container">
						<div class="row">
							<div class="col-xl">
								<div class="card mb-4">
									<div class="card-header d-flex justify-content-between align-items-center formHeader">
										<h5 class="mb-0">Ingrese los datos:</h5>
										<small class="text-muted float-end">Default</small>
									</div>
									<div class="card-body">
										<form action="ControladorCategoria?accion=actualizarCategoria" method="post">
										<input name="idCategoria" type="hidden"value="${getCategoria.idCategoria}" />
											<div class="mb-3">
												<label class="form-label" for="nombreNuevo">Nombre</label>
												<div class="input-group input-group-merge">
													<span id="basic-icon-default-fullname2" class="input-group-text labelCustom borderColorInput"><i class="ri-folder-add-line"></i></span>
													<input
														name="nombreC"
														type="text"
														class="form-control inputCustom borderColorInput"
														id="nombreNuevo"
														placeholder="ruc"
														aria-label="Marcial"
														aria-describedby="basic-icon-default-fullname"
														value="${getCategoria.nombreCategoria}"
														required
													/>
												</div>
											</div>
											<div class="mb-3">
												<label class="form-label" for="TEXTnEW">Descripcion</label>
												<div class="input-group input-group-merge">
													<span id="basic-icon-default-fullname22" class="input-group-text labelCustom borderColorInput"><i class="ri-folder-add-line"></i></span>
													<input
														name="desC"
														type="text"
														class="form-control inputCustom borderColorInput"
														id="TEXTnEW"
														placeholder="Raz�n Social"
														aria-label="default"
														aria-describedby="basic-icon-default-fullname2"
															value="${getCategoria.descripcion}"
														required
													/>
												</div>
											</div>
											
																															
											<button type="submitUpdated" class="btn btn-primary">Actualizar</button>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>

		<!-- ======= Footer ======= -->

		<footer id="footer" class="footer">
			<div class="site-footer">
				<div class="container">
					<div class="row justify-content-around">
						<div class="col-lg-4">
							<div class="widget">
								<img src="./img/logo-ngr-white.png" />
							</div>
							<!-- /.widget -->
							<div class="widget socialContent">
								<h3>Siguenos en:</h3>
								<div class="social d-flex justify-content-start align-items-center px-3">
									<div>
										<a><i class="ri-linkedin-fill"></i></a>
									</div>
									<div>
										<a><i class="ri-facebook-fill"></i></a>
									</div>
								</div>
							</div>
							<!-- /.widget -->
						</div>
						<!-- /.col-lg-3 -->

						<div class="col-lg-3 ml-auto">
							<div class="widget text-start link-container-footer">
								<h3 class="footer-subTitle">Por categor�a</h3>
								<ul class="list-unstyled float-left links">
									<li><a class="links" href="#">Pol�tica de datos personales</a></li>
									<li><a class="links" href="#"> Encargados del tratamiento</a></li>
									<li><a class="links" href="#">Empresas y socios estrat�gicos</a></li>
									<li><a class="links" href="#">Derechos ARCO</a></li>
								</ul>
							</div>
							<!-- /.widget -->
						</div>
						<!-- /.col-lg-3 -->

						<div class="col-lg-3">
							<div class="widget text-start">
								<h3 class="footer-subTitle">Contacto</h3>
								<address class="links">Direccion no lo s�</address>
								<ul class="list-unstyled links mb-4">
									<li><a class="links" href="#">99999999</a></li>
									<li><a class="links" href="#">2333333</a></li>
									<li><a class="links" href="#">ntg.gmail.com</a></li>
								</ul>
							</div>
							<!-- /.widget -->
						</div>
						<!-- /.col-lg-3 -->
					</div>
					<!-- /.row -->

					<div class="row mt-5">
						<div class="col-12 text-center">
							<p class="mb-0">
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear());
								</script>
								. Todos los Derechos Reservados. &mdash; Creado y desarrollado por <a href="#">Igme</a>
								<!-- License information: igmreGroup -->
							</p>
						</div>
					</div>
					<!-- /.container -->
				</div>
				<!-- /.site-footer -->
			</div>
		</footer>
		<!-- End Footer -->

		<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
		<!-- Sistema JS Files -->

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
		<script src="./script/main.js" type="text/javascript"></script>
		<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.3/dist/sweetalert2.all.min.js"></script>
	</body>
</html>
