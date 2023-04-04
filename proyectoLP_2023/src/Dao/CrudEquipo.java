package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntEquipo;
import Modelo.Equipo;
import Modelo.Proveedor;

public class CrudEquipo implements IntEquipo {

	@Override
	public void RegistrarEquipo(Equipo equ) {
		String sql="insert into equipo values(null,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
					
			ps.setString(1,equ.getNombre());
			ps.setString(2,equ.getMarca());			
			ps.setString(3,equ.getModelo());	
			ps.setInt(4,equ.getTipo());
			ps.setString(5,equ.getSerie());
			ps.setString(6,equ.getIP());				
			
			
			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("Equipo REGISTRADO en la BD correctamente");	
			}else{
				System.out.println("Equipo NO REGISTRADO en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		}
		
	}

	@Override
	public void ActualizarEquipo(Equipo equ) {
		String sql="update equipo set nombre=?,marca=?,"
				+ "modelo=?,tipo=?,serie=?,ip=? where idEquipo=?";
		
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
				
			ps.setString(1,equ.getNombre());
			ps.setString(2,equ.getMarca());			
			ps.setString(3,equ.getModelo());	
			ps.setInt(4,equ.getTipo());
			ps.setString(5,equ.getSerie());
			ps.setString(6,equ.getIP());
			ps.setInt(7,equ.getIdEquipo());
			
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
	public void EliminarEquipo(Equipo equ) {
		String sql="delete from equipo where idEquipo=?";
		PreparedStatement ps=null;
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);	
			ps.setInt(1,equ.getIdEquipo());		
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
	public List<Equipo> ListarEquipos() {
		String sql="select eq.idEquipo, eq.nombre, eq.marca,eq.modelo,eq.tipo,eq.serie,eq.ip from equipo eq";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Equipo> listar=new ArrayList<Equipo>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Equipo equ=new Equipo();
				equ.setIdEquipo(rs.getInt(1));
				equ.setNombre(rs.getString(2));
				equ.setMarca(rs.getString(3));
				equ.setModelo(rs.getString(4));
				equ.setTipo(rs.getInt(5));
				equ.setSerie(rs.getString(6));
				equ.setIP(rs.getString(7));	
				
				listar.add(equ);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();			
		} 		
		return listar;	

	}

	@Override
	public Equipo BuscarEquipo(Equipo equ) {
		String sql="select * from equipo where idEquipo=?";		
		PreparedStatement ps=null;
		ResultSet rs=null;			
		Equipo equi=new Equipo();	
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  				
			ps.setInt(1,equ.getIdEquipo());			
			rs=ps.executeQuery();
			if(rs.next()){						
				equi.setIdEquipo(rs.getInt(1));
				equi.setNombre(rs.getString(2));
				equi.setMarca(rs.getString(3));
				equi.setModelo(rs.getString(4));
				equi.setTipo(rs.getInt(5));
				equi.setSerie(rs.getString(6));
				equi.setIP(rs.getString(7));	

			}   
				
		} catch (SQLException e) {
			System.out.println("No se ecuentra empleado" + e.getMessage());
			e.printStackTrace();		
		}  			
		return equi;
	}

}
