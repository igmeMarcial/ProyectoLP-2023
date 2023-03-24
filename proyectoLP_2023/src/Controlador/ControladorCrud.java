package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudCargo;
import Dao.CrudEmpleado;
import Modelo.Cargo;
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
		
		try {
			if(accion != null){
				switch (accion) {
				case "listarEmpleados":
					listarEmpleados(request,response);
					break;
				case "registrarEmpleado":
					registrarEmpleado(request,response);
					break;
				case "nuevoEmpleado":
					registrarNuevoEmpleado(request,response);
					break;
				case "leerEmpleado":
					leerEmpleado(request,response);
					break;
				case "actualizarEmpleado":
					actualizarUsuario(request,response);
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
	private void actualizarUsuario(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void leerEmpleado(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarEmpleados.jsp";
		CrudEmpleado crud = new CrudEmpleado();
		Empleado em = new Empleado();
		String id = request.getParameter("cod");
		if(id !=null){
			em.setIdEmpleado(Integer.parseInt(id));
			try {
				em = crud.BuscarEmpleado(em);
				if(em != null){
					request.setAttribute("getEmpleado",em);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar Empleado");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar Empleado Alert" + e.getMessage());
			}
		}else{
			request.setAttribute("mensaje","Se necesita  IdEmpleado");
		}
		try {
			this.listaCargos(request);
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void listaCargos(HttpServletRequest request) {
		
		CrudCargo c = new CrudCargo();
		List<Cargo> listado=c.ListarCargos();
		
		try {
			
			 request.setAttribute("listadoCargos",listado);
		} catch (Exception e) {
			 request.setAttribute("mensaje","No se puede listar" + e.getMessage());
			 System.out.println("No se puede listar: " + e.getMessage());
		}
		 
	}
	private void registrarNuevoEmpleado(HttpServletRequest request, HttpServletResponse response) {
		Empleado em = new Empleado();
		CrudEmpleado crud =new CrudEmpleado();
		
		String nombre = request.getParameter("nombreNuevo");
		String apellidos = request.getParameter("apellidosNuevo");
		String fechaN = request.getParameter("fechaNacimiento");
		String email = request.getParameter("emailNuevo");
		String celular = 	request.getParameter("celularNuevo");
		String telefono = request.getParameter("telefonoNuevo");
		String sexo = request.getParameter("sexoNuevo");
		String cargo = request.getParameter("testNuevo");
		
		
		
		
		System.out.println(sexo);
		System.out.println(cargo);
		
		
		if(nombre !=null  
			&& 	apellidos!=null  
			&& 	fechaN!=null  
			&& 	email!=null   
			&& 	sexo!=null  
			&& 	cargo!=null  ){
			
			em.setNombre(nombre);
			em.setApellidos(apellidos);
			em.setSexo(sexo);
			
			SimpleDateFormat fechafor=new SimpleDateFormat("dd/MM/yyyy");
			Date fecha;
			 try {
				fecha=fechafor.parse(fechaN);
				Date fechasql=new Date(fecha.getTime());
				em.setFechaNacimiento(fechasql);
				System.out.println(fechasql);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
				
			 
			em.setTelefono(telefono);
			em.setCelular(celular);
			em.setEmail(email);
			
			
			em.setCargo(Integer.parseInt(cargo));	
			
			
			
			
			
			
			try {
				crud.RegistrarEmpleado(em);
				response.sendRedirect("ControladorCrud?accion=listarEmpleados");
				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo registrar Empleado " + e.getMessage());
				System.out.println("No se realiz� el registro: " + e.getMessage());
				 request.setAttribute("empleado",em);
				 this.registrarEmpleado(request,response);
			}
			
			
		}
		
		
	}

	private void registrarEmpleado(HttpServletRequest request, HttpServletResponse response) {
		
		 String url="/RegistrarEmpleado.jsp";
		try {
			this.listaCargos(request);
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
