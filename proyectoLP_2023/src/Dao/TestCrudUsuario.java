package Dao;

import Modelo.Usuario;

public class TestCrudUsuario {

	public static void main(String[] args) {

		Usuario usu=new Usuario();
		crudUsuario validar=new crudUsuario();
		usu.setUsuario("igme");
		usu.setPassword("123");
		Usuario val=validar.ValidarUsuario(usu);								
		if(val.getUsuario()!=null && val.getPassword()!=null){			
			System.out.println("Iniciado sesión como:" + val.getUsuario());
		}  else {
			System.out.println("Datos incorrectos");
		}
		//realizamos el testeo de actualizar usuario
		/*	
			usu.setIdUsuario(1);
			usu.setUsuario("jose");
			usu.setPassword("cibertec2022");
			usu.setEmail("barreda@gmail.com");
			
			//aplicamos el metodo actualizar en la base de datos
			validar.ActualizarUsuario(usu);
	*/
		//realizando el testeo de buscar por codigo
			System.out.println("Buscando al usuario por codigo");
			//codigo de buscar usuario
			usu.setIdUsuario(1);
			Usuario codusuario=validar.BuscarUsuario(usu);
			//imprimir en pantalla
			System.out.println("codigo: "+ codusuario.getIdUsuario()+"| usuario: "+ codusuario.getUsuario()+
					"| password: "+codusuario.getPassword()+"| email: "+ codusuario.getEmail());

	//REALIZANDO EL TEST DE LISTAR
			/*
			List<Usuario> listado=validar.ListarUsuarios();
			for(Usuario list:listado){
				System.out.println("LISTANDO"+"codigo: "+ list.getIdUsuario()+"| usuario: "+ list.getUsuario()+
						"| password: "+list.getPassword()+"| email: "+ list.getEmail()); */
		//	}
		
		

	}

}
