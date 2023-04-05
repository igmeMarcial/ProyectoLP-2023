package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntCategoria;
import Modelo.Categoria;
import Modelo.Usuario;

public class CrudCategoria implements IntCategoria{

	@Override
	public void RegistrarCategoria(Categoria cat) {
		// TODO Auto-generated method stub
		String sql ="insert into categoria values(null,?,?)";
		PreparedStatement ps=null;
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			ps.setString(1, cat.getNombreCategoria());
			ps.setString(2, cat.getDescripcion());

			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("CATEGORIA REGISTRADA en la BD correctamente");	
			}else{
				System.out.println("CATEGORIA NO REGISTRADA en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		
		}//FIN DEL CATCH
	}//FIN REGISTRAR CATEGORIA
		

	@Override
	public void ActualizarCategoria(Categoria cat) {
		// TODO Auto-generated method stub
		
		String sql ="update categoria set nombreCategoria=?, descripcion=? where idCategoria=?";
		
		PreparedStatement ps=null;
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			ps.setString(1, cat.getNombreCategoria());
			ps.setString(2, cat.getDescripcion());
			ps.setInt(3, cat.getIdCategoria());
			
			int y=ps.executeUpdate();
			
			if(y>0){									
				System.out.println("Categoria actualizada correctamente");						
			}else{						
				System.out.println("No se puede actualizar la categoría");					
			}
																															
		} catch (SQLException e) {
			System.out.println("No se puede actualizar la categoria " + e.getMessage());	
			e.printStackTrace();
		}	//FIN CATCH	
}//FIN ACTUALIZAR CATEGORIA
	@Override
	public void EliminarCategoria(Categoria cat) {
		// TODO Auto-generated method stub
		
		String sql="delete from categoria where idCategoria=?";
		PreparedStatement ps=null;
		//asignamos la conexion,la cadena...
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			//asignamos los parametros...
			ps.setInt(1,cat.getIdCategoria());
			//realizamos la ejecucion...
			int y=ps.executeUpdate();
			//aplicamos una condicion...
			if(y>0){
				//emitimos un mensaje por consola
				System.out.println("CATEGORIA ELIMINADA de la BD");
				
			}else {
				//emitimos un mensaje por consola
				System.out.println("CATEGORIA NO ELMINADA de la BD");
				
			}   // fin de la condicion...
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}  //fin del metodo eliminar categoria
	
	

	@Override
	public List<Categoria> ListarCategorias() {
		// TODO Auto-generated method stub
		String sql="select * from categoria";
		PreparedStatement ps=null;
		ResultSet rs=null;
		//creamos un objeto tipo Array
		List<Categoria> listar = new ArrayList<Categoria>();
		//realizamos las respectivas asignaciones
				try {
					ps=ConectarBD.conexion().prepareStatement(sql);
					rs=ps.executeQuery();
					//aplicamos un bucle..
					while(rs.next()){	
						//instanciamos la clase usuario
						Categoria cat= new Categoria();
						//recuperamos los registros de la bd
						cat.setIdCategoria(rs.getInt(1));
						cat.setNombreCategoria(rs.getString(2));
						cat.setDescripcion(rs.getString(3));
						
						//agregamos los registros al Array
						listar.add(cat);
						
					}//fin del bucle
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}   //fin del trycatch....	
		
		return listar;
	}//FIN LISTAR CATEGORIAS

	@Override
	public Categoria BuscarCategoria(Categoria cod) {
		String sql="select * from categoria where idCategoria=?";
		//aplicamos interfaces para la base de datos
				PreparedStatement ps=null;
				ResultSet rs=null;
				//instanciamos la clase usuario
				Categoria cat= new Categoria();
				try{
					ps=ConectarBD.conexion().prepareStatement(sql);
					ps.setInt(1,cod.getIdCategoria());
					//ejecutamos
					rs=ps.executeQuery();
					//aplicamos una condicion
					if(rs.next()){		
						cat.setIdCategoria(rs.getInt(1));
						cat.setNombreCategoria(rs.getString(2));
						cat.setDescripcion(rs.getString(3));
					}}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();	
			}//fin del trycatch
			//retornamos los valores buscados por codigo
			return cat;
		}//fin del metodo buscar CATEHORIA

}