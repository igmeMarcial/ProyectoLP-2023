<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- para dar formato a las fechas -->
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE >
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		
		<link href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css" rel="stylesheet"/>
		
		
		
		<link rel="stylesheet" type="text/css" href="./css/dataTableGlobal.css" />
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
		
		<link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.3/dist/sweetalert2.min.css" rel="stylesheet">
		
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
		<script src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap5.min.js"></script>
		<script>
			
			$(document).ready(function () {
			    $('#data-table-basic').DataTable();
			});
		</script>
		<title>Listado</title>
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
							<a href="ControladorInventario?accion=registrarInventario"> <i class="bi bi-circle"></i><span>Agregar Inventario Nuevo</span> </a>
						</li>
						<li>
							<a href="ControladorInventario?accion=listarInventario"> <i class="bi bi-circle"></i><span>Listar Inventarios</span> </a>
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
							<a href="ControladorEquipo?accion=listarEquipos"> <i class="bi bi-circle"></i><span>Listar Equipos</span> </a>
						</li>
					</ul>
				</li>
				<!-- Final iconos Nav -->
				<li class="nav-item">
					<a class="nav-link collapsed" data-bs-target="#details-nav" data-bs-toggle="collapse" href="#"> <i class="ri-numbers-line"></i><span>Detalles</span><i class="ri-arrow-down-s-line ms-auto"></i> </a>
					<ul id="details-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav">
						<li>
							<a href="ControladorDetalles?accion=entradas"> <i class="bi bi-circle"></i><span>Entradas</span> </a>
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
		<main id="main" class="main main-listado">
	<div class="content-wrapper">
		<div class="container-xxl flex-grow-1 container-p-y">
			<h4 class="fw-bold py-3 mb-4"><span class="text-muted fw-light">Listado /</span> Equipos</h4>
			<div class="container-fluid py-4"">
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="data-table-list">
				<div class="basic-tb-hd">
					<h2>Todos los Equipos</h2>
					<p class="text-xs text-secondary textDate"><script>
									document.write("Actualizado : " + new Date());
								</script></p>
				</div>
				<div class="table-responsive">
				 
					<table id="data-table-basic" class="table table-striped dataTable" role="grid" aria-describedby="data-table-basic_info">
					<thead>
							<tr role="row">
								<th class="sorting_asc th-title text-uppercase text-xs  font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 190px;">Nombre</th>
								<th class="sorting th-title text-uppercase text-xs  font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 292px;">Marca</th>
								<th class="sorting th-title text-uppercase text-xs font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 145px;">Modelo</th>
								<th class="sorting th-title text-uppercase text-xs font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 52px;">Serie</th>
								<th class="sorting th-title text-uppercase text-xs font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 125px;">IP</th>
								<th class="sorting th-title text-uppercase text-xs font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 116px;">Tipo</th>
								<th class="sorting th-title text-uppercase text-xs font-weight-bold opacity-7 " tabindex="0" aria-controls="data-table-basic" rowspan="1" colspan="1" aria-label="action: activate to sort column ascending" style="width: 50px;">Acciones</th>
							</tr>
						</thead>
						 
						<tbody>
						<c:forEach var="equipo" items="${listadoEquipos}">
							<tr role="row" class="odd">
								<td class="sorting_1 text-secondary text-dark font-weight-bold "><c:out value="${equipo.Nombre}"></c:out></td>
								<td class="text-secondary text-dark  font-weight-bold"><c:out value="${equipo.Marca}"></c:out></td>
								<td class="text-secondary text-dark  font-weight-bold"><c:out value="${equipo.Modelo}"></c:out></td>
								<td class="text-secondary text-dark font-weight-bold"><c:out value="${equipo.Serie}"></c:out></td>
								<td class="text-secondary text-dark font-weight-bold"><c:out value="${equipo.IP}"></c:out></td>
								<td class="text-secondary text-dark font-weight-bold"><c:out value="${equipo.Tipo}"></c:out></td>
								<td class="text-secondary text-dark font-weight-bold align-middle text-center">
									<div class="dropdown">
										<button type="button" class="btn p-0 hide-arrow btn-editList" data-bs-toggle="dropdown" aria-expanded="false">
											<i class="ri-more-2-fill"></i>
										</button>
										<div class="dropdown-menu menu-dropdown-b" style="">
												<a class="dropdown-item" href="
																<c:url value="ControladorEquipo">
															      <c:param name="accion" value="leerEquipo" />
															 <c:param name="codPro" value="${equipo.IdEquipo}" />
															     </c:url>"><i class="ri-edit-line"></i> Editar
															                                                   
												</a>
											<input type="hidden" id="codigo"  value="${equipo.IdEquipo}">
															<a id="deleteData" class="dropdown-item" href="<c:url value="ControladorEquipo">
															<c:param name="accion" value="eliminarEquipo"/> 
															<c:param  name="cod" value="${equipo.IdEquipo}"/>
											</c:url>"><i class="ri-delete-bin-line"></i> Eliminar</a>
										</div>
									</div>
								</td>
							</tr>
							</c:forEach> 
							
							<tr role="row" class="even">
								<td class="sorting_1">Marcial</td>
								<td>Senior Javascript Developer</td>
								<td>Igme</td>
								<td>21</td>
								<td>2012/03/29</td>
								<td>$433,060</td>
								<td class="text-secondary text-xs font-weight-bold align-middle text-center">
									<div class="dropdown">
										<button type="button" class="btn p-0 hide-arrow btn-editList" data-bs-toggle="dropdown" aria-expanded="false">
											<i class="ri-more-2-fill"></i>
										</button>
										<div class="dropdown-menu menu-dropdown-b" style="">
											<a class="dropdown-item" href="#"><i class="ri-edit-line"></i> Edit</a>
											<a class="dropdown-item" href="#"><i class="ri-delete-bin-line"></i> Delete</a>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<th rowspan="1" colspan="1" class="th-footer">RUC</th>
								<th rowspan="1" colspan="1" class="th-footer">R.S</th>
								<th rowspan="1" colspan="1" class="th-footer">Categoria</th>
								<th rowspan="1" colspan="1" class="th-footer">Telefono</th>
								<th rowspan="1" colspan="1" class="th-footer">Email</th>
								<th rowspan="1" colspan="1" class="th-footer">T.S</th>
								<th rowspan="1" colspan="1" class="th-footer">Filtrar</th>
							</tr>
						</tfoot>
						
					</table>
					
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
		
		<script>

		$(document).ready(function(){
			
			
			$("tr #deleteData").click(function (e){
				e.preventDefault();
				var cod = $(this).parent().find("#codigo").val();	
				Swal.fire({
					  title: '�Est�s seguro?',
					  text: "�No podr�s deshacer esto!",
					  icon: 'warning',
					  showCancelButton: true,
					  confirmButtonColor: '#3085d6',
					  cancelButtonColor: '#d33',
					  confirmButtonText: 'Si, Eliminar!'
					}).then(function(result) {
					  if (result.isConfirmed) {
						  eliminar(cod);
					    Swal.fire(
					      '�Borrado!',
					      'El archivo ha sido borrado.',
					      'success'
					    )
					    setTimeout(function(){
					    	parent.location.href = "ControladorProveedor?accion=listarProveedores"
					    },1800);
					  }
					})									
			})
			function eliminar (cod){		
				var url = "ControladorProveedor?accion=eliminarProveedor&cod=" + cod;			
				$.ajax({
					type: 'POST',
					url: url,
					async: true,
					success: function(r){				
					}
				});
			}
			
		})
		</script>
	</body>
</html>
    