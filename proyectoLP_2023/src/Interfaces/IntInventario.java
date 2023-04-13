package Interfaces;

import java.util.List;

import Modelo.Inventario;



public interface IntInventario {
	public void RegistrarInventario(Inventario in);
	public void ActualizarInventario(Inventario in);
	public void EliminarInventario(Inventario in);
	public List<Inventario> ListarInventarios();
	public Inventario BuscarInventario(Inventario in);
}