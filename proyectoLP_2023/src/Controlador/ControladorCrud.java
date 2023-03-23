package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudCargo;
import Dao.CrudEmpleado;
import Modelo.Empleado;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class ControladorCrud
 */
@WebServlet("/ControladorCrud")
public class ControladorCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCrud() {
        super();
       
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		System.out.println("acc => " + accion);
		try {
			if(accion != null){
				switch (accion) {
				case "listarEmpleados":
					listarEmpleados(request,response);
					break;
				case "registrarEmpleado":
					registrarEmpleado(request,response);
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

	private void registrarEmpleado(HttpServletRequest request, HttpServletResponse response) {
		//CrudCargo cargo = new CrudCargo();
		 String url="/RegistrarEmpleado.jsp";
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void listarEmpleados(HttpServletRequest request, HttpServletResponse response) {
		Empleado em = new Empleado();
		CrudEmpleado crud =new CrudEmpleado();
		 String url="/ListadoEmpleados.jsp";
		
		 List<Empleado> listado=crud.ListarEmpleados();
		try {
			
			 request.setAttribute("listado",listado);
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
