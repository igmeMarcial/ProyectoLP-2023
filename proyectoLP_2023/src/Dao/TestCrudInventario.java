package Dao;

import Modelo.Inventario;

public class TestCrudInventario {
	public static void main(String[] args) {
	Inventario in = new Inventario();
	CrudInventario crud = new CrudInventario();
	
	in.setIdTicket(1);
	in.setIdCategoria(1);
	in.setIdEquipo(1);
	in.setIdProveedor(1);
	
	//crud.RegistrarInventario(in);
	}
}