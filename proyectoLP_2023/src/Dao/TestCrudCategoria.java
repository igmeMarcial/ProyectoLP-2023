package Dao;
import java.util.List;

import Modelo.Categoria;
import Modelo.Usuario;
public class TestCrudCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		
		//cat.setNombreCategoria("CATEGORIA D");
		//cat.setDescripcion("SUELDO DE S/3200");
		
		//crud.RegistrarCategoria(cat);
	
	///////////ACTUALIZANDO LA CATEGORIA
		cat.setIdCategoria(15);
		cat.setNombreCategoria("Nuevas categoriaAC");
		cat.setDescripcion("sin sueldo xd");
	
		crud.ActualizarCategoria(cat);

	////////////// LISTANDO
/*	
		List<Categoria> listado = crud.ListarCategorias();
		for(Categoria list:listado){
			System.out.println("*****LISTANDO******" + " ID: "+ list.getIdCategoria()+"| NOMBRE: " + list.getNombreCategoria()+ " | DESCRIPCCI�N: " +
		list.getDescripcion());
		}
*/
		
	///////////////////////////// TESTEO PARA BUSCAR POR CODIGO
/*		
		System.out.println("Buscando categorias por codigo");
		//codigo de buscar usuario
		cat.setIdCategoria(15);
		Categoria codcate=crud.BuscarCategoria(cat);
		//imprimir en pantalla
	System.out.println("*****BUSQUEDA******" + " ID: "+ codcate.getIdCategoria()+"| NOMBRE: " + codcate.getNombreCategoria()+ " | DESCRIPCCI�N: " +
				codcate.getDescripcion());
*/
		///////////TEST ELIMINAR CATEGORIA
		cat.setIdCategoria(5);
		//ejecutar el metodo eliminar
		//crud.EliminarCategoria(cat);
		
	}

}