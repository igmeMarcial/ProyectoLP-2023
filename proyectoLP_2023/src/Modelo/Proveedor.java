package Modelo;

public class Proveedor {
	private int idProveedor;
	private String ruc;
	private String razonSocial;
	private String categoria;
	private String tipoSolitud;
	private String email;
	private String telefono;
	public Proveedor (){
		
	}
	public Proveedor(int idProveedor, String ruc, String razonSocial, String categoria, String tipoSolitud,
			String email, String telefono) {
		super();
		this.idProveedor = idProveedor;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.categoria = categoria;
		this.tipoSolitud = tipoSolitud;
		this.email = email;
		this.telefono = telefono;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTipoSolitud() {
		return tipoSolitud;
	}
	public void setTipoSolitud(String tipoSolitud) {
		this.tipoSolitud = tipoSolitud;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
