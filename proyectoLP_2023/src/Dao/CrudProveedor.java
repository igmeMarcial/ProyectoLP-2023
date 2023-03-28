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
		
		
	}

	@Override
	public void ActualizarProveedor(Proveedor prov) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProveedor(Proveedor prov) {
		// TODO Auto-generated method stub
		
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
	public Proveedor BuscarProveedor(Proveedor em) {
		// TODO Auto-generated method stub
		return null;
	}

}
