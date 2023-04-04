package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntUsuario;
import Modelo.Usuario;

public class crudUsuario implements IntUsuario {

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

	@Override
	public void ActualizarUsuario(Usuario usu) {
		//realizamos la respectiva cadena SQL...
				String sql ="update usuario set userName=?, password=?, email=? where idUsuario=?";
				//aplicamos la interfaz preparedstament para trabajar con BD...
						PreparedStatement ps=null;
						//asignamos la conexion,la cadena a la variable ps....
						try {
							ps=ConectarBD.conexion().prepareStatement(sql);
						//Asignamos los parámetros
						ps.setString(1,usu.getUsuario());
						ps.setString(2, usu.getPassword());
						ps.setString(3, usu.getEmail());
						ps.setInt(4,usu.getIdUsuario());
						//ejecutamos...
						int y=ps.executeUpdate();
						//aplicamos una condicion
						if(y>0){
							
							//emitimos un mensaje por consola...
							System.out.println("Usuario ACTUALIZADO correctamente en la BD");
							
						}else{
							//emitimos un mensaje por consola..
							System.out.println("Usuario NO ACTUALIZADO correctamente en la BD");
							
						}}catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}//fin catch
		
	}

	@Override
	public Usuario BuscarUsuario(Usuario usus) {
	

		//Cadena String sql
		String  sql = "select * from usuario where idUsuario=?";
		//aplicamos interfaces para la base de datos
		PreparedStatement ps=null;
		ResultSet rs=null;
		//instanciamos la clase usuario
		Usuario usu = new Usuario();
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			ps.setInt(1,usus.getIdUsuario());
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos una condicion
			if(rs.next()){
				usu.setIdUsuario(rs.getInt(1));
				usu.setUsuario(rs.getString(2));
				usu.setPassword(rs.getString(3));
				usu.setEmail(rs.getString(4));
			}//fin de la condicion
		}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();	
		}//fin del trycatch
		//retornamos los valores buscados por codigo
		return usu;
	}

	

	@Override
	public List<Usuario> ListarUsuarios() {
		//REALIZAMOS LA CADENA STRING
				String sql="select * from usuario";
				PreparedStatement ps=null;
				ResultSet rs=null;
				//creamos un objeto tipo Array
				List<Usuario> listar = new ArrayList<Usuario>();
				//realizamos las respectivas asignaciones
				try {
					ps=ConectarBD.conexion().prepareStatement(sql);
					rs=ps.executeQuery();
					//aplicamos un bucle..
					while(rs.next()){	
						//instanciamos la clase usuario
						Usuario usu = new Usuario();
						//recuperamos los registros de la bd
						usu.setIdUsuario(rs.getInt(1));
						usu.setUsuario(rs.getString(2));
						usu.setPassword(rs.getString(3));
						usu.setEmail(rs.getString(4));
						//agregamos los registros al Array
						listar.add(usu);
						
					}//fin del bucle
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}   //fin del trycatch....	
				
				return listar;
	}//fin del metodo listar
			
}
