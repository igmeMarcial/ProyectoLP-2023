package Interfaces;

import java.util.List;

import Modelo.Categoria;

public interface IntCategoria {
	public void RegistrarCategoria (Categoria cat);
	public void ActualizarCategoria (Categoria cat);
	public void EliminarCategoria (Categoria cat);
	public List <Categoria> ListarCategorias();
	public Categoria BuscarCategoria(Categoria cat);
}
