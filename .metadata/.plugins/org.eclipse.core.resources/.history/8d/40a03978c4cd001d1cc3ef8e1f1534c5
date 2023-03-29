
$(document).ready(function(){
	$("tr #deleteData").click(function (e){
		e.preventDefault();
		var cod = $(this).parent().find()("#codigo").val();
		swal({
			  title: "Are you sure?",
			  text: "You will not be able to recover this imaginary file!",
			  type: "warning",
			  showCancelButton: true,
			  confirmButtonClass: "btn-danger",
			  confirmButtonText: "Yes, delete it!",
			  cancelButtonText: "No, cancel plx!",
			  closeOnConfirm: false,
			  closeOnCancel: false
			},
			function(isConfirm) {
			  if (isConfirm) {
				  eliminar(cod);
			    swal("Deleted!", "Your imaginary file has been deleted.", "success");
			    setTimeout(function(){
			    	parent.location.href = "ControladorCrud?accion=listarEmpleados"
			    },1800);
			  } else {
			    swal("Cancelled", "Your imaginary file is safe :)", "error");
			  }
			});				
	})
	function eliminar (cod){
		var url = "ControladorCrud?accion=eliminarEmpleado&idDelete" + cod;
		$.ajax({
			type: 'POST',
			url: url,
			async: true,
			success: function(r){
				
			}
		});
	}
})