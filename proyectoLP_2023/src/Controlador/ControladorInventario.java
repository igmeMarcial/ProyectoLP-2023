package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudCargo;
import Dao.CrudCategoria;
import Dao.CrudEquipo;
import Dao.CrudInventario;
import Dao.CrudProveedor;
import Dao.CrudTicket;
import Modelo.Cargo;
import Modelo.Categoria;
import Modelo.Equipo;
import Modelo.Inventario;
import Modelo.Proveedor;
import Modelo.Ticket;

/**
 * Servlet implementation class ControladorInventario
 */
@WebServlet("/ControladorInventario")
public class ControladorInventario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorInventario() {
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
				case "listarInventarios":
					listarInventarios(request,response);
					break;
				case "registrarInventario":
					registrarInventario(request,response);
					break;
				case "nuevoInventario":
					registrarNuevoInventario(request,response);
					break;
				case "leerInventario":
					leerInventario(request,response);
					break;
				case "actualizarInventario":
					actualizarInventario(request,response);
					break;
				case "eliminarInventario":
					eliminarInventario(request,response);
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

	private void eliminarInventario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void actualizarInventario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void leerInventario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void registrarNuevoInventario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void listarEquipo(HttpServletRequest request) {
			
		CrudEquipo crud= new CrudEquipo();	
		List<Equipo> listadoE=crud.ListarEquipos();
			
			try {
				 request.setAttribute("listadoEquipos",listadoE);	
			} catch (Exception e) {
				 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
				 System.out.println("No se puede listar: " + e.getMessage());
			}
			 
		}
	private void listarCategoria(HttpServletRequest request) {
		
		CrudCategoria crud = new CrudCategoria();
		List<Categoria> listado=crud.ListarCategorias();
			
			try {
				request.setAttribute("listadoCategorias",listado);
			} catch (Exception e) {
				 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
				 System.out.println("No se puede listar: " + e.getMessage());
			}
			 
		}
	private void listarProveedor(HttpServletRequest request) {
		
		CrudProveedor crud = new CrudProveedor();
		List<Proveedor> listadoProv=crud.ListarProveedores();
			
			try {
				request.setAttribute("listadoProv",listadoProv);
			} catch (Exception e) {
				 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
				 System.out.println("No se puede listar: " + e.getMessage());
			}
			 
		}
	private void listarTicket(HttpServletRequest request) {
		
		CrudTicket crud= new CrudTicket();
		List<Ticket> listadoProv=crud.ListarTicketsTodo();
			
			try {
				request.setAttribute("listadoTicket",listadoProv);
			} catch (Exception e) {
				 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
				 System.out.println("No se puede listar: " + e.getMessage());
			}
			 
		}
	private void registrarInventario(HttpServletRequest request, HttpServletResponse response) {
		 String url="/RegistrarInventario.jsp";
			try {
				this.listarEquipo(request);
				this.listarCategoria(request);
				this.listarProveedor(request);	
				this.listarTicket(request);
				this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo realizar petición " + e.getMessage());
				System.out.println("No se realizó peticion: " + e.getMessage());
			}
		
	}

	private void listarInventarios(HttpServletRequest request, HttpServletResponse response) {
		String url="/ListadoInventario.jsp";	
		//Inventario in = new Inventario();
		CrudInventario crud = new CrudInventario();
		
		List<Inventario > listado=crud.ListarInventarios();
		try {
			 request.setAttribute("listadoInventarios",listado);		
		} catch (Exception e) {
			 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
			 System.out.println("No se puede listar: " + e.getMessage());
		}
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception ex) {
			request.setAttribute("mensaje","No se pudo realizar petición " + ex.getMessage());
			System.out.println("No se realizó peticion: " + ex.getMessage());
			
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
