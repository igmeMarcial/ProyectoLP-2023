package Dao;

import java.util.List;

import Modelo.Proveedor;

public class TestCrudProveedor {

	public static void main(String[] args) {
		
		Proveedor pro = new Proveedor();
		CrudProveedor crud= new CrudProveedor();	
		
		/*
		pro.setRuc("20258598987");
		pro.setRazonSocial("Maza SAC");
		pro.setCategoria("Categoría X");
		pro.setTipoSolitud(" Solicitud Tipo 1");	
		pro.setEmail("elvato@gmail.com");
		pro.setTelefono("123");
		
		crud.RegistrarProveedor(pro);
		*/
		
		/*
		pro.setIdProveedor(11);
		pro.setRuc("20258598987");
		pro.setRazonSocial("Maza SA");
		pro.setCategoria("Categoría X");
		pro.setTipoSolitud(" Solicitud Tipo 1");	
		pro.setEmail("elvato@gmail.com");
		pro.setTelefono("123");
		
		crud.ActualizarProveedor(pro);
		*/
		
		/*
		pro.setIdProveedor(11);
		crud.EliminarProveedor(pro);
		*/
		
		
		
		List<Proveedor> listado=crud.ListarProveedores();	
		
		for(Proveedor list:listado){	
			System.out.println("ID "+list.getIdProveedor()+" RUC "+list.getRuc()+
					" RS "+list.getRazonSocial()+" categoria "+list.getCategoria()+" tipo de solicitud "
					+list.getTipoSolitud()+" email "+list.getEmail()+" telefono "+list.getTelefono());
		}  	
		
		
		
		/*
		System.out.println("Buscar proveedor por ID");
		pro.setIdProveedor(5);
		Proveedor codprov=crud.BuscarProveedor(pro);
		
		System.out.println("ID "+codprov.getIdProveedor()+" RUC "+codprov.getRuc()+
				" RS "+codprov.getRazonSocial()+" categoria "+codprov.getCategoria()+" tipo de solicitud "
				+codprov.getTipoSolitud()+" email "+codprov.getEmail()+" telefono "+codprov.getTelefono());
		*/
		
	}

}
