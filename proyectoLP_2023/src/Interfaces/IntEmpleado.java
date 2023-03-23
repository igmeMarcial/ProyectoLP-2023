package Interfaces;

import java.util.List;

import Modelo.Empleado;

public interface IntEmpleado {
	public void RegistrarEmpleado(Empleado em);
	public void ActualizarEmpleado(Empleado em);
	public void EliminarEmpleado(Empleado em);
	public List<Empleado> ListarEmpleados();
	public Empleado BuscarEmpleado(Empleado em);
	
}
