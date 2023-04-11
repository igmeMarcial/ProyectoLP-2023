package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntInventario;
import Modelo.Empleado;
import Modelo.Inventario;

public class CrudInventario implements IntInventario {

	@Override
	public void RegistrarInventario(Inventario in) {
		String sql="insert into inventario values(null,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			ps.setInt(1,in.getIdTicket());
			ps.setInt(2,in.getIdCategoria());			
			ps.setInt(3,in.getIdProveedor());
			ps.setInt(4,in.getIdCategoria());
					
			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("Inventario REGISTRADO en la BD correctamente");	
			}else{
				System.out.println("Inventario NO REGISTRADO en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		}
		
	}

	@Override
	public void ActualizarInventario(Inventario in) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarInventario(Inventario in) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inventario> ListarInventarios() {
		String sql="select e.idEmpleado, e.nombre, e.apellidos,e.sexo,e.fechaNacimiento,e.telefono,e.celular,e.email,c.NombreCargo from empleado e inner join cargo c on c.idCargo = e.idCargo order by e.idEmpleado";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Inventario> listar=new ArrayList<Inventario>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Inventario inven=new Inventario();
				inven.setIdTicket(rs.getInt(1));
				inven.setIdEquipo(rs.getInt(2));
				inven.setIdProveedor(rs.getInt(3));
				inven.setIdCategoria(rs.getInt(4));
				
				inven.setNombreTicket(rs.getString(5));
				inven.setNombreEquipo(rs.getString(6));
				inven.setRucProveedor(rs.getString(7));
				inven.setNombreCategoria(rs.getString(8));
				
				listar.add(inven);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();			
		} 		
		return listar;	
	}

	@Override
	public Inventario BuscarInventario(Inventario in) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
