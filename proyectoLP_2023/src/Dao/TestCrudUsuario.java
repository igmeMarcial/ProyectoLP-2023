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
			System.out.println("Iniciado sesi�n como:" + val.getUsuario());
		}  else {
			System.out.println("Datos incorrectos");
		}

	}

}
