package Modelo;

public class Categoria {
	private int idCategoria;
	private String nombreCategoria;
	private String descripcion;
	
	//CONSTRUCTOR USANDO CAMPOS
	public Categoria(int idCategoria, String nombreCategoria, String descripcion) {
	
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcion = descripcion;
	}

	//CONSTRUCTOR VACIO
	public Categoria() {
	}
	
	
	//GETTER Y SETTER
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
}