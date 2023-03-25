package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntEmpleado;
import Modelo.Empleado;

public class CrudEmpleado implements IntEmpleado{

	@Override
	public void RegistrarEmpleado(Empleado em) {
		String sql="insert into empleado values(null,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			
			ps.setString(1,em.getNombre());
			ps.setString(2,em.getApellidos());			
			ps.setString(3,em.getSexo());		
			ps.setDate(4,new java.sql.Date(em.getFechaNacimiento().getTime()));		
			ps.setString(5,em.getTelefono());
			ps.setString(6,em.getCelular());
			ps.setString(7,em.getEmail());
			ps.setInt(8,em.getCargo());
			
			
			
			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("Empleado REGISTRADO en la BD correctamente");	
			}else{
				System.out.println("Empleado NO REGISTRADO en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		}
	}

	@Override
	public void ActualizarEmpleado(Empleado em) {
				String sql="update empleado set nombre=?,apellidos=?,"
						+ "sexo=?,fechaNacimiento=?,telefono=?,celular=?,email=?,idCargo=? where idproducto=?";
				
				
				PreparedStatement ps=null;
				
				try {
					ps=ConectarBD.conexion().prepareStatement(sql);
				
					
					ps.setString(1,em.getNombre());
					ps.setString(2,em.getApellidos());			
					ps.setString(3,em.getSexo());		
					ps.setDate(4,new java.sql.Date(em.getFechaNacimiento().getTime()));		
					ps.setString(5,em.getTelefono());
					ps.setString(6,em.getCelular());
					ps.setString(7,em.getEmail());
					ps.setInt(8,em.getCargo());
					
					int y=ps.executeUpdate();
					
					if(y>0){
						
						
						System.out.println("Empleado actualizado correctamente");
						
					}else{
						
						System.out.println("No se puede actualizar Empleado");					
					}
																			
														
				} catch (SQLException e) {
					System.out.println("No se puede actualizar Empleado" + e.getMessage());	
					e.printStackTrace();
				}
		
	}

	@Override
	public void EliminarEmpleado(Empleado em) {
		
		
	}

	@Override
	public List<Empleado> ListarEmpleados() {
		
		String sql="select e.idEmpleado, e.nombre, e.apellidos,e.sexo,e.fechaNacimiento,e.telefono,e.celular,e.email,c.NombreCargo from empleado e inner join cargo c on c.idCargo = e.idCargo order by e.idEmpleado";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Empleado> listar=new ArrayList<Empleado>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Empleado emp=new Empleado();
				emp.setIdEmpleado(rs.getInt(1));
				emp.setNombre(rs.getString(2));
				emp.setApellidos(rs.getString(3));
				emp.setSexo(rs.getString(4));
				emp.setFechaNacimiento(rs.getDate(5));
				emp.setTelefono(rs.getString(6));
				emp.setCelular(rs.getString(7));
				emp.setEmail(rs.getString(8));	
				emp.setCargoNombre(rs.getString(9));		
				
				listar.add(emp);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();			
		} 		
		return listar;	
	}

	@Override
	public Empleado BuscarEmpleado(Empleado em) {
		
				String sql="select * from empleado where idEmpleado=?";		
				PreparedStatement ps=null;
				ResultSet rs=null;			
				Empleado emp=new Empleado();	
				try {
					ps=ConectarBD.conexion().prepareStatement(sql);  				
					ps.setInt(1,em.getIdEmpleado());			
					rs=ps.executeQuery();
					if(rs.next()){						
						emp.setIdEmpleado(rs.getInt(1));
						emp.setNombre(rs.getString(2));
						emp.setApellidos(rs.getString(3));
						emp.setSexo(rs.getString(4));
						emp.setFechaNacimiento(rs.getDate(5));
						emp.setTelefono(rs.getString(6));
						emp.setCelular(rs.getString(7));
						emp.setEmail(rs.getString(8));	
						emp.setCargoNombre(rs.getString(9));
					}   
						
				} catch (SQLException e) {
					System.out.println("No se ecuentra empleado" + e.getMessage());
					e.printStackTrace();		
				}  			
				return emp;
	}

}
