package Modelo;

public class Inventario {
	private int idInventario;
	private int idTicket;
	private int IdEquipo;
	private int idProveedor;
	private int idCategoria;
	
	private int stockInicial;
	private int salidas;
	private int total;
	
	private String nombreTicket;
	private String nombreEquipo;
	private String rucProveedor;
	private String nombreCategoria;
	
	public Inventario() {
		
	}

	public Inventario(int idInventario, int idTicket, int idEquipo, int idProveedor, int idCategoria, int stockInicial,
			int salidas, int total, String nombreTicket, String nombreEquipo, String rucProveedor,
			String nombreCategoria) {
		super();
		this.idInventario = idInventario;
		this.idTicket = idTicket;
		IdEquipo = idEquipo;
		this.idProveedor = idProveedor;
		this.idCategoria = idCategoria;
		this.stockInicial = stockInicial;
		this.salidas = salidas;
		this.total = total;
		this.nombreTicket = nombreTicket;
		this.nombreEquipo = nombreEquipo;
		this.rucProveedor = rucProveedor;
		this.nombreCategoria = nombreCategoria;
	}

	public int getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public int getIdEquipo() {
		return IdEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		IdEquipo = idEquipo;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getStockInicial() {
		return stockInicial;
	}

	public void setStockInicial(int stockInicial) {
		this.stockInicial = stockInicial;
	}

	public int getSalidas() {
		return salidas;
	}

	public void setSalidas(int salidas) {
		this.salidas = salidas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getNombreTicket() {
		return nombreTicket;
	}

	public void setNombreTicket(String nombreTicket) {
		this.nombreTicket = nombreTicket;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getRucProveedor() {
		return rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	
	



	
	
	
}
