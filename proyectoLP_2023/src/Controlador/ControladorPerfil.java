package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.crudUsuario;
import Modelo.Usuario;

/**
 * Servlet implementation class ControladorPerfil
 */
@WebServlet("/ControladorPerfil")
public class ControladorPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public String  idU;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorPerfil() {
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
				case "Ingresar":
					datosValidos(request,response);
					break;
				case "perfil":
					buscarPerfil(request,response);
					break;
				case "actualizarPerfil":
					actualizarPerfil(request,response);
					break;
				case "getUsuario":
					getUsuario(request,response);
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

	private void getUsuario(HttpServletRequest request, HttpServletResponse response) {
		String url="/perfil.jsp";
		crudUsuario crud = new crudUsuario();
		Usuario usu = new Usuario();
		String id = request.getParameter("idUsuario");
		System.out.println("id=>:" +id);
		if(id !=null){
			usu.setIdUsuario(Integer.parseInt(id));
			try {
				usu = crud.BuscarUsuario(usu);
				if(usu != null){
					
					/*System.out.println("codigo: "+ usu.getIdUsuario()+"| usuario: "+ usu.getUsuario()+
							"| password: "+usu.getPassword()+"| email: "+ usu.getEmail());*/
					
					request.setAttribute("getUsuario",usu);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar Usuario");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar Usuario Alert" + e.getMessage());
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

	private void datosValidos(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sesion;
		String url= "/Main.jsp";
		String urlReject = "/index.jsp";
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		Usuario usu=new Usuario();
		crudUsuario crud=new crudUsuario();
		
		String mensaje="";
		
		if(usuario != null && password != null){
			
			usu.setUsuario(usuario);
			usu.setPassword(password);
			
			Usuario validar=crud.ValidarUsuario(usu);
			try {
			if(validar.getUsuario()!=null && validar.getPassword()!=null){
				
					 sesion = request.getSession();
					 
					 request.getSession().setAttribute("user", validar.getUsuario());
					request.getSession().setAttribute("email", validar.getEmail());
					request.getSession().setAttribute("idUsuario", validar.getIdUsuario());
					 idU =String.valueOf(validar.getIdUsuario());
					/* System.out.println(idU);*/
			            request.setAttribute("msje", "Bienvenido al sistema");
			            this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);		
			}else{
				 request.setAttribute("msje", "Credenciales Incorrectas");
		            request.getRequestDispatcher(urlReject).forward(request, response);
			}
		} catch (Exception e) {
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}
		}
		
	}

	private void actualizarPerfil(HttpServletRequest request, HttpServletResponse response) {
		
		String url="/index.jsp";
		Usuario usu=new Usuario();
		crudUsuario crud=new crudUsuario();
		
		String idUsuario = request.getParameter("idUsuario");
		String user = request.getParameter("usuarioNuevo");
		String password = request.getParameter("passwordNuevo");
		String email = request.getParameter("emailNuevo");
		
		if(idUsuario != null){
			usu.setIdUsuario(Integer.parseInt(idUsuario));
			usu.setUsuario(user);
			usu.setPassword(password);
			usu.setEmail(email);
			try {
				crud.ActualizarUsuario(usu);
				response.sendRedirect("ControladorPerfil?accion=perfil");	
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo Actualizar " + e.getMessage());
				System.out.println("No se realiz� la actualizaci�n: " + e.getMessage());
				 request.setAttribute("usu",usu);
			}
			try {
				//this.listaCargos(request);
				this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
				System.out.println("No se realiz� peticion: " + e.getMessage());
			}
		}else{
			System.out.println("No tiene  ID usuario ");
		}
	}

	private void buscarPerfil(HttpServletRequest request, HttpServletResponse response) {
		/*
		String url="/perfil.jsp";
		try {
			
			this.getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje","No se pudo realizar petici�n " + e.getMessage());
			System.out.println("No se realiz� peticion: " + e.getMessage());
		}*/
		
		
		String url="/perfil.jsp";
		//ControladorPerfil?accion=perfil
		crudUsuario crud = new crudUsuario();
		Usuario usu = new Usuario();
		//String id = request.getParameter("idUsuario");
		
		if(idU !=null){
			usu.setIdUsuario(Integer.parseInt(idU));
			try {
				usu = crud.BuscarUsuario(usu);
				if(usu != null){
					
					System.out.println("codigo: "+ usu.getIdUsuario()+"| usuario: "+ usu.getUsuario()+
							"| password: "+usu.getPassword()+"| email: "+ usu.getEmail());
					
					request.setAttribute("getUsuario",usu);
					
				}else{
					 request.setAttribute("mensaje","No se pudo buscar Usuario");
				}
			} catch (Exception e) {
				request.setAttribute("mensaje","No se pudo buscar Usuario Alert" + e.getMessage());
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
