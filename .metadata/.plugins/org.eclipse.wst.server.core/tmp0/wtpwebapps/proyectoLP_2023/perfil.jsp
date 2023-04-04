<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE >
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" type="text/css" href="./css/mainPrincipal.css" />
		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Playball&display=swap" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="./css/nuevoEmpleado.css" />

		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,600;0,700;0,800;1,700&display=swap" rel="stylesheet" />

		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="./css/main.css" />
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
		<link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet" />
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		
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
									<span>Mi Perfil</span>
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
							<a href="ControladorCategoria?accion=registrarCategoria"> <i class="bi bi-circle"></i><span>Listar Categorias</span> </a>
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
							<a href="ControladorInventario?accion=registrarIventario"> <i class="bi bi-circle"></i><span>Agregar Inventario Nuevo</span> </a>
						</li>
						<li>
							<a href="ControladorInventario?accion=registrarInventario"> <i class="bi bi-circle"></i><span>Listar Inventarios</span> </a>
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
							<a href="ControladorEquipo?accion=registrarEquipo"> <i class="bi bi-circle"></i><span>Listar Equipos</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final iconos Nav -->
				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#details-nav" data-bs-toggle="collapse" href="#"> <i class="ri-numbers-line"></i><span>Detalles</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="details-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorDatalles?accion=entradas"> <i class="bi bi-circle"></i><span>Entradas</span> </a>
						</li>
						<li>
							<a href="ControladorDetalles?accion=salidas"> <i class="bi bi-circle"></i><span>Salidas</span> </a>
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

		<main id="main" class="main main-principal">
			<div class="container-xxl flex-grow-1 container-p-y">
			
			<div class="container-fluid py-4">
				<div class="row">
					<div class="col">
						<nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">
							<ol class="breadcrumb mb-0">
								<li class="breadcrumb-item"><a href="#">Inicio</a></li>
								<li class="breadcrumb-item"><a href="#">Perfil</a></li>
								<li class="breadcrumb-item active" aria-current="page">Usuario:</li>
							</ol>
						</nav>
					</div>
				</div>
				
				<div class="row js-fullheight">
					<div class="col-lg-4">
						<div class="card mb-4">
							<div class="card-body text-center">
								<img src="./img/userImg.png" alt="avatar" class="rounded-circle img-fluid" style="width: 150px;" />
								<h5 class="my-3">${getUsuario.usuario}</h5>
								<p class="text-muted mb-1">Administrador</p>
								<p class="text-muted mb-4">Arequipa Cusco-Per�</p>
								<div class="d-flex justify-content-center mb-2">
									<button id="btnUpdateProfile" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#perfilModal" >Editar</button>
									<!--   <button type="button" class="btn btn-outline-primary ms-1"></button>-->
								</div>
							</div>
						</div>
						<div class="card mb-4 mb-lg-0">
							<div class="card-body p-0">
								<ul class="list-group list-group-flush rounded-3">
									<li class="list-group-item d-flex justify-content-between align-items-center p-3">
										<i class="fas fa-globe fa-lg text-warning"></i>
										<p class="mb-0">https://www.ngr.com.pe</p>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center p-3">
										<i class="fab fa-github fa-lg" style="color: #333333;"></i>
										<p class="mb-0">Adminitrador(a)</p>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center p-3">
										<i class="fab fa-twitter fa-lg" style="color: #55acee;"></i>
										<p class="mb-0">Perfil verificado</p>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center p-3">
										<i class="fab fa-instagram fa-lg" style="color: #ac2bac;"></i>
										<p class="mb-0">modoAdmin</p>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center p-3">
										<i class="fab fa-facebook-f fa-lg" style="color: #3b5998;"></i>
										<p class="mb-0">---${idUsuario}---</p>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-lg-8">
						<div class="card mb-4">
							<div class="card-body">
								<div class="row">
									<div class="col-sm-3">
										<p class="mb-0">Nombre Social</p>
									</div>
									<div class="col-sm-9">
										<p class="text-muted mb-0">${getUsuario.usuario}</p>
									</div>
								</div>
								<hr />
								<div class="row">
									<div class="col-sm-3">
										<p class="mb-0">Email</p>
									</div>
									<div class="col-sm-9">
										<p class="text-muted mb-0">${getUsuario.email}</p>
									</div>
								</div>
								<hr />
								<div class="row">
									<div class="col-sm-3">
										<p class="mb-0">Celular</p>
									</div>
									<div class="col-sm-9">
										<p class="text-muted mb-0">(097) 234-5678</p>
									</div>
								</div>
								<hr />
								<div class="row">
									<div class="col-sm-3">
										<p class="mb-0">Dni</p>
									</div>
									<div class="col-sm-9">
										<p class="text-muted mb-0">(098) 765-4321</p>
									</div>
								</div>
								<hr />
								<div class="row">
									<div class="col-sm-3">
										<p class="mb-0">Direcci�n</p>
									</div>
									<div class="col-sm-9">
										<p class="text-muted mb-0">Miraflores- 404</p>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="card mb-4 mb-md-0">
									<div class="card-body">
										<p class="mb-4"><span class="text-primary font-italic me-1">Resumen</span>/Ubicaciones (1)</p>
										<p class="mb-1" style="font-size: .77rem;">Sector</p>
										<div class="progress rounded" style="height: 5px;">
											<div class="progress-bar" role="progressbar" style="width: 80%" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
										<p class="mt-4 mb-1" style="font-size: .77rem;">Sitio web</p>
										<div class="progress rounded" style="height: 5px;">
											<div class="progress-bar" role="progressbar" style="width: 72%" aria-valuenow="72" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
										<p class="mt-4 mb-1" style="font-size: .77rem;">Tama�o de la empresae</p>
										<div class="progress rounded" style="height: 5px;">
											<div class="progress-bar" role="progressbar" style="width: 89%" aria-valuenow="89" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
										<p class="mt-4 mb-1" style="font-size: .77rem;">Sede</p>
										<div class="progress rounded" style="height: 5px;">
											<div class="progress-bar" role="progressbar" style="width: 55%" aria-valuenow="55" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
										<p class="mt-4 mb-1" style="font-size: .77rem;">Principal</p>
										<div class="progress rounded mb-2" style="height: 5px;">
											<div class="progress-bar" role="progressbar" style="width: 66%" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="card mb-4 mb-md-0">
									<div class="card-body">
									<blockquote class="blockquote mb-0">
									      <p>�Somos parte de una familia que promueve la equidad, la igualdad y el respeto!</p>
									      <footer class="blockquote-footer">NG . <cite title="Source Title">Restaurants S.A</cite></footer>
									    </blockquote>
									</div>
								</div>							
							</div>
						</div>
					</div>
				</div>				
			</div>
		</div>
	</div>
	
	<div class="modal fade " id="perfilModal" tabindex="-1" aria-hidden="true" aria-labelledby="exampleModalCenteredScrollableTitle">
	  <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalCenteredScrollableTitle">Actualizar Usuario</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <form action="ControladorPerfil?accion=actualizarPerfil" method="post">
	        <input name="idUsuario" type="hidden"value="${getUsuario.idUsuario}" />
											<div class="mb-3">
												<label class="form-label" for="nombreNuevo">Usuario</label>
												<div class="input-group input-group-merge">
													<span id="basic-icon-default-fullname2" class="input-group-text labelCustom borderColorInput"><i class="ri-folder-add-line"></i></span>
													<input
														name="usuarioNuevo"
														type="text"
														class="form-control inputCustom borderColorInput"
														id="nombreNuevo"
														placeholder="Usuario"
														aria-label="Marcial"
														aria-describedby="basic-icon-default-fullname"
														value="${getUsuario.usuario}"
														required
													/>
												</div>
											</div>
											<div class="mb-3">
												<label class="form-label" for="apellidosNuevo">contrase�a</label>
												<div class="input-group input-group-merge">
													<span id="basic-icon-default-fullname22" class="input-group-text labelCustom borderColorInput"><i class="ri-folder-add-line"></i></span>
													<input
														name="passwordNuevo"
														type="text"
														class="form-control inputCustom borderColorInput"
														id="apellidosNuevo"
														placeholder="password"
														aria-label="apellido"
														aria-describedby="basic-icon-default-fullname2"
														value="${getUsuario.password}"
														required
													/>
												</div>
											</div>
											
											
											<div class="mb-3">
												<label class="form-label" for="emailNuevo">Email</label>
												<div class="input-group input-group-merge">
													<span class="input-group-text labelCustom borderColorInput"><i class="ri-folder-add-line"></i></span>
													<input
														name="emailNuevo"
														type="text"
														id="emailNuevo"
														class="form-control inputCustom borderColorInput"
														placeholder="ejemplo.@gmail.com"
														aria-label="example.gmail.com"
														aria-describedby="basic-icon-default-email2"
														value="${getUsuario.email}"
														required
													/>
													<span id="basic-icon-default-email2" class="input-group-text labelCustomEmail borderColorInput">@example.com</span>
												</div>
												<div class="form-text">Puedes usar letras, n�meros puntos</div>
											</div>
											<div class="mb-5">
											</div>
											 <div class="modal-footer ">
										        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
										        <button type="submit" class="btn btn-primary">Actualizar</button>
										      </div>
											
																															
											  
										</form>
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
		<script>
			
		var myModal = document.getElementById('#perfilModal')
		var myInput = document.getElementById('myInput')

		myModal.addEventListener('shown.bs.modal', function () {
		  myInput.focus()
		})
		
		
			
		</script>
		
	</body>
</html>
    