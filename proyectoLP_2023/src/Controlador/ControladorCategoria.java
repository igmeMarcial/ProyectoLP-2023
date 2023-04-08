package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudCategoria;
import Modelo.Categoria;
import Modelo.Equipo;

/**
 * Servlet implementation class ControladorCategoria
 */
@WebServlet("/ControladorCategoria")
public class ControladorCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		try {
			if(accion != null){
				switch (accion) {
				case "listarCategorias":
					listarCategorias(request,response);
					break;
				case "registrarCategoria":
					registrarCategoria(request,response);
					break;
				case "nuevoCategoria":
					registrarNuevoCategoria(request,response);
					break;
				case "leerCategoria":
					leerCategoria(request,response);
					break;
				case "actualizarCategoria":
					actualizarCategoria(request,response);
					break;
				case "eliminarCategoria":
					eliminarCategoria(request,response);
					break;
				default:
					response.sendRedirect("Main.jsp");
				}
			}else{
				response.sendRedirect("Main.jsp");
			}
		} catch (Exception e) {
			 try {
	                this.getServletConfig().getServletContext().getRequestDispatcher("error.jsp").forward(request, response);

	            } catch (Exception ex) {
	                System.out.println("Error" + e.getMessage());
	            }
		}
	}

	private void eliminarCategoria(HttpServletRequest request, HttpServletResponse response) {
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		String id = request.getParameter("cod");
		if(id != null){
			cat.setIdCategoria(Integer.parseInt(id));
			try {
				crud.EliminarCategoria(cat);
				System.out.println("seucces xxddd");
				response.sendRedirect("ControladorCategoria?accion=listarCategorias");										
				request.setAttribute("success","Eliminado correctamente");
				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo eliminar  Alert" + e.getMessage());
			}
		}else{
			 request.setAttribute("mensaje","El id no se puede eliminar");
		}
		
	}

	private void actualizarCategoria(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarCategoria.jsp";
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		
		String id = request.getParameter("idCategoria");
		String nombre = request.getParameter("nombreC");
		String descripcion = request.getParameter("desC");
		if(id != null){
			cat.setIdCategoria(Integer.parseInt(id));
			cat.setNombreCategoria(nombre);
			cat.setDescripcion(descripcion);
			try {
				crud.ActualizarCategoria(cat);
				response.sendRedirect("ControladorCategoria?accion=listarCategorias");	
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo Actualizar " + e.getMessage());
				System.out.println("No se realiz� la actualizaci�n: " + e.getMessage());
				 request.setAttribute("empleado",cat);
			}
			try {			
				this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
				System.out.println("No se realiz� peticion: " + e.getMessage());
			}
		}else{
			System.out.println("No tiene  ID ");
		}
		
		
	}

	private void leerCategoria(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarCategoria.jsp";
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		String id = request.getParameter("cod");
		if(id !=null){
			cat.setIdCategoria(Integer.parseInt(id));
			try {
				cat = crud.BuscarCategoria(cat);
				if(cat != null){
					request.setAttribute("getCategoria",cat);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar de servelt");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar  Alert" + e.getMessage());
				System.out.println("No se realiz� leer: " + e.getMessage());
			}
		}else{
			request.setAttribute("mensaje","Se necesita  IdEmpleado");
		}
		try {
			
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void registrarNuevoCategoria(HttpServletRequest request, HttpServletResponse response) {
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		
		String nombre = request.getParameter("nombreC");
		String descripcion = request.getParameter("desC");
		if(nombre !=null ){
			cat.setNombreCategoria(nombre);
			cat.setDescripcion(descripcion);
			try {
				crud.RegistrarCategoria(cat);
				response.sendRedirect("ControladorCategoria?accion=listarCategorias");				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo registrar Empleado " + e.getMessage());
				System.out.println("No se realiz� el registro: " + e.getMessage());
				 request.setAttribute("empleado",cat);
				 this.registrarCategoria(request, response);
			}
		}
		
		
	}

	private void registrarCategoria(HttpServletRequest request, HttpServletResponse response) {
	
		String url="/RegistrarCategoria.jsp";
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void listarCategorias(HttpServletRequest request, HttpServletResponse response) {
		String url="/ListadoCategorias.jsp";
		Categoria cat = new Categoria();
		CrudCategoria crud = new CrudCategoria();
		List<Categoria> listado=crud.ListarCategorias();
		try {
			 request.setAttribute("listadoCategorias",listado);
		} catch (Exception e) {
			 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
			 System.out.println("No se puede listar: " + e.getMessage());
		}
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception ex) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + ex.getMessage());
			System.out.println("No se realiz� peticion: " + ex.getMessage());
			
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
