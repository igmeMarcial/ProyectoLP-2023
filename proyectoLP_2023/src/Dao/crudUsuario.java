package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConectarBD.ConectarBD;
import Modelo.Usuario;

public class crudUsuario {

	public Usuario ValidarUsuario(Usuario usu){
		
		
		String sql="select * from usuario where userName=? and password=?";
		PreparedStatement ps=null;	
		ResultSet rs=null;		
		Usuario usualm= new Usuario();
		
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);	
			ps.setString(1,usu.getUsuario());
			ps.setString(2,usu.getPassword());	
			rs=ps.executeQuery();	
			if(rs.next()){
				usualm.setIdUsuario(rs.getInt(1));
				usualm.setUsuario(rs.getString(2));
				usualm.setPassword(rs.getString(3));	
				usualm.setEmail(rs.getString(4));
			}  
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return usualm;
		
	}
}
