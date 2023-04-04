package Modelo;

public class Equipo {

	private int IdEquipo;
	private String Nombre;
	private String Marca;
	private String Modelo;
	private int Tipo;
	private String Serie;
	private String IP;
	
	public Equipo () {
		
	}

	public Equipo(int idEquipo, String nombre, String marca, String modelo, int tipo, String serie, String iP) {
		IdEquipo = idEquipo;
		Nombre = nombre;
		Marca = marca;
		Modelo = modelo;
		Tipo = tipo;
		Serie = serie;
		IP = iP;
	}

	public int getIdEquipo() {
		return IdEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		IdEquipo = idEquipo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	public String getSerie() {
		return Serie;
	}

	public void setSerie(String serie) {
		Serie = serie;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}
	
	
	

	
	
}
