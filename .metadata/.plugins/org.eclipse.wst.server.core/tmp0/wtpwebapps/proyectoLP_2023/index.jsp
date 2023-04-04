
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/x-icon" href="favicon.ico">
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
	<!-- Font Awesome -->
	<link
	  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	  rel="stylesheet"
	/>
	<!-- Google Fonts -->
	<link
	  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	  rel="stylesheet"
	/>
	<link
	  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
	  rel="stylesheet"
	/>
	<title>SomosNGR</title>
	<link rel="stylesheet" type="text/css" href="./css/login.css" />
</head>
<body>
<section class="vh-100">
  	<div class="container-fluid p-0">
    <div class="row-login vh-100 ">
	   <div class="w-100 img-login  text-center">
	        <img src="./img/DSC_0005.webp"
	          alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: center;">
	   </div>
      <div class="text-black">

        <div class="px-5 text-center mb-5">
          <img alt="logo" class="logo-app mt-4 mb-4  ng-lazyloaded" src="./img/logo-somosngr.svg">
        </div>

        <div class="d-flex align-items-center justify-content-center h-custom-2 px-5  mt-5 pt-5 pt-xl-0  ">

          <form action="ControladorPerfil?accion=Ingresar" method="post" style="width: 20rem;">

            <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;"></h3>

            <div class="form-outline mb-4">
              <input type="text" id="input-custom" name="usuario" class="form-control form-control-lg " />
              <label class="form-label" for="form2Example18">N�mero de Documento</label>
            </div>

            <div class="form-outline mb-5">
              <input type="password" id="input-custom" name="password" class="form-control form-control-lg nput-custom"" />
              <label class="form-label" for="form2Example28">Contrase�a</label>
            </div>

            <div class="pt-1 mb-4">
              <button name="accion" value="Ingresar" class="btn  btn-lg btn-block btn-login" type="submit">Ingresar</button>
            </div>

            <p class="small mb-5 pb-lg-2"><a class="text-muted" href="#!">Olvid� mi contrase�a?</a></p>
            <p class="createNewLink">A�n no tienes una cuenta?<a href="#!" class="link-info"> Registrarse Aqui!</a></p>

          </form>

        </div>

      </div>
      
    </div>
  </div>
  
</section>

<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"
></script>
    
</body>
</html>






































