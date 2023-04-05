package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudEquipo;
import Modelo.Equipo;
import Modelo.Proveedor;

/**
 * Servlet implementation class ControladorEquipo
 */
@WebServlet("/ControladorEquipo")
public class ControladorEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEquipo() {
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
				case "listarEquipos":
					listarEquipos(request,response);
					break;
				case "registrarEquipo":
					registrarEquipo(request,response);
					break;
				case "nuevoEquipo":
					registrarNuevoEquipo(request,response);
					break;
				case "leerEquipo":
					leerEquipo(request,response);
					break;
				case "actualizarEquipo":
					actualizarEquipo(request,response);
					break;
				case "eliminarEquipo":
					eliminarEquipo(request,response);
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

	private void eliminarEquipo(HttpServletRequest request, HttpServletResponse response) {
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();
		String id = request.getParameter("idE");
		if(id != null){
			equ.setIdEquipo(Integer.parseInt(id));
			try {
				crud.EliminarEquipo(equ);
				response.sendRedirect("ControladorEquipo?accion=listarEquipos");										
				request.setAttribute("success","Eliminado correctamente");
				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo eliminar  Alert" + e.getMessage());
			}
		}else{
			 request.setAttribute("mensaje","El id no se puede eliminar");
		}
		
	}

	private void actualizarEquipo(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarEquipos.jsp";
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();
		String id = request.getParameter("idE");
		String nombre = request.getParameter("nombreE");
		String marca = request.getParameter("marcaE");
		String modelo = request.getParameter("modeloE");
		String tipo = 	request.getParameter("tipoE");
		String serie = request.getParameter("serieE");
		String ip = request.getParameter("ipE");
		if(id != null){
			equ.setIdEquipo(Integer.parseInt(id));
			equ.setNombre(nombre);
			equ.setMarca(marca);
			equ.setModelo(modelo);
			equ.setTipo(Integer.parseInt(tipo));	
			equ.setSerie(serie);
			equ.setIP(ip);
			try {
				crud.ActualizarEquipo(equ);
				response.sendRedirect("ControladorEquipo?accion=listarEquipos");	
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo Actualizar " + e.getMessage());
				System.out.println("No se realiz� la actualizaci�n: " + e.getMessage());
				 request.setAttribute("empleado",equ);
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

	private void leerEquipo(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarEquipos.jsp";
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();	
		String id = request.getParameter("codE");
		if(id !=null){
			equ.setIdEquipo(Integer.parseInt(id));
			try {
				equ = crud.BuscarEquipo(equ);
				if(equ != null){
					request.setAttribute("getEquipo",equ);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar de servelt");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar  Alert" + e.getMessage());
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

	private void registrarNuevoEquipo(HttpServletRequest request, HttpServletResponse response) {
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();	
		
		
		
		String nombre = request.getParameter("nombreE");
		String marca = request.getParameter("marcaE");
		String modelo = request.getParameter("modeloE");
		String tipo = 	request.getParameter("tipoE");
		String serie = request.getParameter("serieE");
		String ip = request.getParameter("ipE");
		if(nombre !=null ){
			equ.setNombre(nombre);
			equ.setMarca(marca);
			equ.setModelo(modelo);
			equ.setTipo(Integer.parseInt(tipo));	
			equ.setSerie(serie);
			equ.setIP(ip);
			try {
				crud.RegistrarEquipo(equ);
				response.sendRedirect("ControladorEquipo?accion=listarEquipos");				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo registrar Empleado " + e.getMessage());
				System.out.println("No se realiz� el registro: " + e.getMessage());
				 request.setAttribute("empleado",equ);
				 this.registrarEquipo(request, response);
			}	
		}
	
		
		
	}

	private void registrarEquipo(HttpServletRequest request, HttpServletResponse response) {
		
		String url="/RegistrarEquipo.jsp";
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void listarEquipos(HttpServletRequest request, HttpServletResponse response) {
		String url="/ListadoEquipos.jsp";	
		Equipo equ = new Equipo();
		CrudEquipo crud= new CrudEquipo();	
		List<Equipo> listadoE=crud.ListarEquipos();
		try {
			 request.setAttribute("listadoEquipos",listadoE);	
			
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
