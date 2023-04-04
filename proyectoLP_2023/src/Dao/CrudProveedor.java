package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntProveedor;
import Modelo.Empleado;
import Modelo.Proveedor;

public class CrudProveedor implements IntProveedor {

	@Override
	public void RegistrarProveedor(Proveedor prov) {
		String sql="insert into proveedor values(null,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			
			ps.setString(1,prov.getRuc());
			ps.setString(2,prov.getRazonSocial());			
			ps.setString(3,prov.getCategoria());			
			ps.setString(4,prov.getTipoSolitud());
			ps.setString(5,prov.getEmail());
			ps.setString(6,prov.getTelefono());

		
			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("Proveedor REGISTRADO en la BD correctamente");	
			}else{
				System.out.println("Proveedor NO REGISTRADO en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		}		
		
	}

	@Override
	public void ActualizarProveedor(Proveedor prov) {
		
		String sql="update proveedor set ruc=?,razonSocial=?,"
				+ "categoria=?,tipoSolicitud=?,email=?,telefono=? where idProveedor=?";
		
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
					
			ps.setString(1,prov.getRuc());
			ps.setString(2,prov.getRazonSocial());			
			ps.setString(3,prov.getCategoria());			
			ps.setString(4,prov.getTipoSolitud());
			ps.setString(5,prov.getEmail());
			ps.setString(6,prov.getTelefono());
			ps.setInt(7,prov.getIdProveedor());
			
			int y=ps.executeUpdate();
			
			if(y>0){									
				System.out.println("Proveedor actualizado correctamente");						
			}else{						
				System.out.println("No se puede actualizar Proveedor");					
			}
																															
		} catch (SQLException e) {
			System.out.println("No se puede actualizar Proveedor " + e.getMessage());	
			e.printStackTrace();
		}		
		
	}

	@Override
	public void EliminarProveedor(Proveedor prov) {

		String sql="delete from proveedor where idProveedor=?";
		PreparedStatement ps=null;
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);	
			ps.setInt(1,prov.getIdProveedor());		
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
	public List<Proveedor> ListarProveedores() {
		String sql="select p.idProveedor, p.ruc, p.razonSocial, p.categoria, p.tipoSolicitud, p.email, p.telefono from proveedor p";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Proveedor> listar=new ArrayList<Proveedor>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Proveedor prov=new Proveedor();
				prov.setIdProveedor(rs.getInt(1));
				prov.setRuc(rs.getString(2));
				prov.setRazonSocial(rs.getString(3));
				prov.setCategoria(rs.getString(4));
				prov.setTipoSolitud(rs.getString(5));
				prov.setEmail(rs.getString(6));	
				prov.setTelefono(rs.getString(7));
						
				
				listar.add(prov);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();			
		} 		
		return listar;	
	}

	@Override
	public Proveedor BuscarProveedor(Proveedor prov) {
		
		String sql="select * from proveedor where idProveedor=?";		
		PreparedStatement ps=null;
		ResultSet rs=null;			
		Proveedor prove=new Proveedor();	
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  				
			ps.setInt(1,prov.getIdProveedor());			
			rs=ps.executeQuery();
			if(rs.next()){						
				prove.setIdProveedor(rs.getInt(1));
				prove.setRuc(rs.getString(2));
				prove.setRazonSocial(rs.getString(3));
				prove.setCategoria(rs.getString(4));
				prove.setTipoSolitud(rs.getString(5));
				prove.setEmail(rs.getString(6));
				prove.setTelefono(rs.getString(7));

			}   
				
		} catch (SQLException e) {
			System.out.println("No se ecuentra empleado" + e.getMessage());
			e.printStackTrace();		
		}  			
		return prove;
	}

}
