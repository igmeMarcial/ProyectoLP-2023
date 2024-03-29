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
				case "eliminarProveedor":
					eliminarProveedor(request,response);
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

	private void eliminarProveedor(HttpServletRequest request, HttpServletResponse response) {
		Proveedor pro = new Proveedor();
		CrudProveedor crud= new CrudProveedor();
		String id = request.getParameter("cod");
		if(id != null){
			pro.setIdProveedor(Integer.parseInt(id));
			try {
				crud.EliminarProveedor(pro);
				response.sendRedirect("ControladorProveedor?accion=listarProveedores");										
				request.setAttribute("success","Eliminado correctamente");
				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo eliminar Alert" + e.getMessage());
			}
		}else{
			 request.setAttribute("mensaje","El id no se puede eliminar");
		}
		
	}

	private void actualizarProveedor(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarProveedores.jsp";
		Proveedor pro = new Proveedor();
		CrudProveedor crud= new CrudProveedor();
		String id = request.getParameter("idProveedor");
		String ruc = request.getParameter("rucProveedor");
		String rs = request.getParameter("rsProveedor");
		String categoria = request.getParameter("categoriaProveedor");
		String t = request.getParameter("tipoProveedor");
		String email = 	request.getParameter("emailProveedor");
		String celu = request.getParameter("celularProveedor");
		if(id != null){
			pro.setIdProveedor(Integer.parseInt(id));
			pro.setRuc(ruc);
			pro.setRazonSocial(rs);
			pro.setCategoria(categoria);
			pro.setTipoSolitud(t);	
			pro.setEmail(email);
			pro.setTelefono(celu);
			try {
				crud.ActualizarProveedor(pro);
				response.sendRedirect("ControladorProveedor?accion=listarProveedores");	
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo Actualizar " + e.getMessage());
				System.out.println("No se realiz� la actualizaci�n: " + e.getMessage());
				 request.setAttribute("empleado",pro);
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

	private void leerProveedor(HttpServletRequest request, HttpServletResponse response) {
		String url="/ActualizarProveedores.jsp";
		Proveedor pro = new Proveedor();
		CrudProveedor crud= new CrudProveedor();	
		String idPro = request.getParameter("codPro");
		if(idPro !=null){
			pro.setIdProveedor(Integer.parseInt(idPro));
			try {
				pro = crud.BuscarProveedor(pro);
				if(pro != null){
					request.setAttribute("getProveedor",pro);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar Empleado");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar Empleado Alert" + e.getMessage());
			}
		}else{
			request.setAttribute("mensaje","Se necesita  Id");
		}
		try {
			
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		
	}

	private void registrarNuevoProveedor(HttpServletRequest request, HttpServletResponse response) {
		Proveedor pro = new Proveedor();
		CrudProveedor crud= new CrudProveedor();	
		String ruc = request.getParameter("rucProveedor");
		String rs = request.getParameter("rsProveedor");
		String categoria = request.getParameter("categoriaProveedor");
		String t = request.getParameter("tipoProveedor");
		String email = 	request.getParameter("emailProveedor");
		String celu = request.getParameter("celularProveedor");
		
		if(ruc !=null ){
			//pro.setIdProveedor(11);
			pro.setRuc(ruc);
			pro.setRazonSocial(rs);
			pro.setCategoria(categoria);
			pro.setTipoSolitud(t);	
			pro.setEmail(email);
			pro.setTelefono(celu);
			
			try {
				crud.RegistrarProveedor(pro);
				response.sendRedirect("ControladorProveedor?accion=listarProveedores");				
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo registrar " + e.getMessage());
				System.out.println("No se realiz� el registro: " + e.getMessage());
				 request.setAttribute("empleado",pro);
				 this.registrarProveedor(request,response);
			}
		}
		
	}

	private void registrarProveedor(HttpServletRequest request, HttpServletResponse response) {
		String url="/RegistrarProveedor.jsp";
		try {
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
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
