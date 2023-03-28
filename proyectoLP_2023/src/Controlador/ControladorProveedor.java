package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudProveedor;
import Modelo.Empleado;
import Modelo.Proveedor;

/**
 * Servlet implementation class ControladorProveedor
 */
@WebServlet("/ControladorProveedor")
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
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
				case "listarProveedores":
					listarProveedores(request,response);
					break;
				case "registrarProveedor":
					registrarProveedor(request,response);
					break;
				case "nuevoProveedor":
					registrarNuevoProveedor(request,response);
					break;
				case "leerProveedor":
					leerProveedor(request,response);
					break;
				case "actualizarProveedor":
					actualizarProveedor(request,response);
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

	private void actualizarProveedor(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void leerProveedor(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void registrarNuevoProveedor(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void registrarProveedor(HttpServletRequest request, HttpServletResponse response) {
		String url="/RegistrarProveedor.jsp";
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petición " + e.getMessage());
			System.out.println("No se realizó peticion: " + e.getMessage());
		}
		
	}

	private void listarProveedores(HttpServletRequest request, HttpServletResponse response) {
		String url="/ListadoProveedores.jsp";
		Proveedor prov = new Proveedor();
		CrudProveedor crud = new CrudProveedor();
		List<Proveedor> listadoProv=crud.ListarProveedores();
		try {
			 request.setAttribute("listadoProv",listadoProv);
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
