package ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
//Método apra conectar con BASE de Datos;
public class ConectarBD {
	private static String url="jdbc:mysql://localhost:3306/proyectoLP";
	private static String usuario="root";
	private static String password="";
	private static Connection con;
	public static Connection conexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,usuario,password);	
	if(con!=null) System.out.println("Conectado con base de datos correctamente :)");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
