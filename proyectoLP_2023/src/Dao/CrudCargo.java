package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Modelo.Cargo;


public class CrudCargo {
public List<Cargo> ListarCargos() {
		
		String sql="select c.idCargo, c.NombreCargo, c.estado from cargo c order by c.idCargo";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Cargo> listar=new ArrayList<Cargo>();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);  
			rs=ps.executeQuery();		
			while(rs.next()){				
				Cargo emp=new Cargo();
				emp.setIdCargo(rs.getInt(1));
				emp.setNombreCargo(rs.getString(2));
				emp.setEstado(rs.getBoolean(3));
					
				
				listar.add(emp);	
			} 
		} catch (SQLException e) {		
			e.printStackTrace();			
		} 		
		return listar;	
	}
}
