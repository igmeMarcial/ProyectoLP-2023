package Dao;

import Modelo.Equipo;
import Modelo.Proveedor;

import java.util.List;

public class TestCrudEquipo {

	public static void main(String[] args) {
		
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();	
		
		/*
		equ.setNombre("Prueba");
		equ.setMarca("PruebaM");
		equ.setModelo("Prueba");
		equ.setTipo(1);	
		equ.setSerie("Prueba@gmail.com");
		equ.setIP("Prueba");
		
		crud.RegistrarEquipo(equ);
		*/
		
		/*
		equ.setIdEquipo(1);
		equ.setNombre("Actu");
		equ.setMarca("PruebaM");
		equ.setModelo("Prueba");
		equ.setTipo(1);	
		equ.setSerie("Prueba@gmail.com");
		equ.setIP("Prueba");
		
		crud.ActualizarEquipo(equ);
		*/
		
		
		/*
		equ.setIdEquipo(2);
		crud.EliminarEquipo(equ);
		*/
		
		/*
		List<Equipo> listado=crud.ListarEquipos();	
				for(Equipo list:listado){	
					System.out.println("ID "+list.getIdEquipo()+" Nombre "+list.getNombre()+
							" Marca "+list.getMarca()+" Modelo "+list.getModelo()+" tipo "
							+list.getTipo()+" serie "+list.getSerie()+" IP "+list.getIP());
				}  	
		*/
		
		
		/*
		System.out.println("Buscar equipo por ID");
		equ.setIdEquipo(3);
		Equipo codequi=crud.BuscarEquipo(equ);
		
		System.out.println("ID "+codequi.getIdEquipo()+" Nombre "+codequi.getNombre()+
				" Marca "+codequi.getMarca()+" Modelo "+codequi.getModelo()+" tipo "
				+codequi.getTipo()+" serie "+codequi.getSerie()+" IP "+codequi.getIP());
		
		*/
		
	}

}
