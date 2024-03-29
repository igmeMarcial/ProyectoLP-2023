package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntInventario;
import Modelo.Empleado;
import Modelo.Equipo;
import Modelo.Inventario;

public class CrudInventario implements IntInventario {

	@Override
	public void RegistrarInventario(Inventario in) {
		String sql="insert into inventario values(null,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			ps.setInt(1,in.getIdTicket());
			ps.setInt(2,in.getIdEquipo());			
			ps.setInt(3,in.getIdProveedor());
			ps.setInt(4,in.getStockInicial());
			ps.setInt(5,in.getSalidas());
			ps.setInt(6,in.getTotal());
			ps.setInt(7,in.getIdCategoria());
			
			
					
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
		String sql="update inventario set idTicket=?,idEquipo=?,"
				+ "idProveedor=?,stockInicial=?,salidas=?,total=?,idCategoria=? where idInventario=?";
		PreparedStatement ps=null;
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
				
			ps.setInt(1,in.getIdTicket());
			ps.setInt(2,in.getIdEquipo());			
			ps.setInt(3,in.getIdProveedor());
			ps.setInt(4,in.getStockInicial());
			ps.setInt(5,in.getSalidas());
			ps.setInt(6,in.getTotal());
			ps.setInt(7,in.getIdCategoria());
			
			ps.setInt(8,in.getIdInventario());
			
			int y=ps.executeUpdate();
			
			if(y>0){									
				System.out.println("Equipo actualizado correctamente");						
			}else{						
				System.out.println("No se puede actualizar Equipo");					
			}
																															
		} catch (SQLException e) {
			System.out.println("No se puede actualizar Equipo " + e.getMessage());	
			e.printStackTrace();
		}
	}

	@Override
	public void EliminarInventario(Inventario in) {
		String sql="delete from inventario where idInventario=?";
		PreparedStatement ps=null;
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);	
			ps.setInt(1,in.getIdInventario());		
			int y=ps.executeUpdate();	
			if(y>0){
				System.out.println("Registro ELIMINADO de la BD");			
			}else {		
				System.out.println("Registro NO ELMINADO de la BD");			
			} 					
		} catch (SQLException e) {			
			e.printStackTrace();
		}			
		
	}

	@Override
	public List<Inventario> ListarInventarios() {
		String sql="SELECT inv.idInventario, inv.stockInicial, inv.salidas, inv.total, t.idTicket, t.nombre AS nombreTicket, eq.idEquipo, eq.nombre AS nombreEquipo, p.idProveedor, p.razonSocial AS rucProveedor, c.idCategoria, c.nombreCategoria AS nombreCategoria "
				+ "FROM inventario inv "
				+ "JOIN ticket t ON t.idTicket = inv.idTicket "
				+ "JOIN equipo eq ON eq.idEquipo = inv.idEquipo "
				+ "JOIN proveedor p ON p.idProveedor = inv.idProveedor "
				+ "JOIN categoria c ON c.idCategoria = inv.idCategoria";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Inventario> listar=new ArrayList<Inventario>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Inventario inven=new Inventario();
				
				inven.setIdInventario(rs.getInt(1));
				inven.setStockInicial(rs.getInt(2));
				inven.setSalidas(rs.getInt(3));
				inven.setTotal(rs.getInt(4));
				
				inven.setIdTicket(rs.getInt(5));
				inven.setNombreTicket(rs.getString(6));
				inven.setIdEquipo(rs.getInt(7));
				inven.setNombreEquipo(rs.getString(8));
				inven.setIdProveedor(rs.getInt(9));
				inven.setRucProveedor(rs.getString(10));
				inven.setIdCategoria(rs.getInt(11));
				inven.setNombreCategoria(rs.getString(12));
				
				listar.add(inven);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();	
			 System.out.println("Error: " + e.getMessage());
		} 		
		return listar;	
	}

	@Override
	public Inventario BuscarInventario(Inventario in) {
		String sql="select * from inventario where idInventario=?";		
		PreparedStatement ps=null;
		ResultSet rs=null;			
		Inventario inv = new Inventario();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  				
			ps.setInt(1,in.getIdInventario());			
			rs=ps.executeQuery();
			if(rs.next()){		
				inv.setIdInventario(rs.getInt(1));
				inv.setIdTicket(rs.getInt(2));
				inv.setIdEquipo(rs.getInt(3));
				inv.setIdProveedor(rs.getInt(4));
				
				inv.setStockInicial(rs.getInt(5));
				inv.setSalidas(rs.getInt(6));
				inv.setTotal(rs.getInt(7));
				
				inv.setIdCategoria(rs.getInt(8));

			}   
				
		} catch (SQLException e) {
			System.out.println("No se ecuentra empleado" + e.getMessage());
			e.printStackTrace();		
		}  			
		return inv;
		
	}
	
	
}
