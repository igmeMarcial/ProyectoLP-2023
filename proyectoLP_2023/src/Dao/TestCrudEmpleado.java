package Dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Modelo.Empleado;

public class TestCrudEmpleado {

	public static void main(String[] args) {
		
		Empleado em = new Empleado();
		CrudEmpleado crud= new CrudEmpleado();
		
		/*
		em.setNombre("Alonzo");
		em.setApellidos("Vato");
		em.setSexo("M");
		
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		 em.setFechaNacimiento(fechasql);
		 
		em.setTelefono("123");
		em.setCelular("34444444");
		em.setEmail("elvato@gmail.com");
		em.setCargo(1);
		
		crud.RegistrarEmpleado(em);
		*/
		em.setIdEmpleado(13);
		em.setNombre("Nuevo");
		em.setApellidos("Vato");
		em.setSexo("M");
		
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		 em.setFechaNacimiento(fechasql);		 
		em.setTelefono("123");
		em.setCelular("000000");
		em.setEmail("actualizado@gmail.com");
		em.setCargo(1);
		
		crud.ActualizarEmpleado(em);
		
	}

}
