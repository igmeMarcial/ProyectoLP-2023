package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.crudUsuario;
import Modelo.Usuario;

/**
 * Servlet implementation class ControladorUsuario
 */
@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		if(accion.equals("Ingresar")){
			String usuario=request.getParameter("usuario");
			String password=request.getParameter("password");
			
			System.out.println(usuario);
			System.out.println(password);
			
			String mensaje="";
			String url="";
			Usuario usu=new Usuario();
			crudUsuario val=new crudUsuario();
			
			usu.setUsuario(usuario);
			usu.setPassword(password);
			
			Usuario validar=val.ValidarUsuario(usu);
			if(validar.getUsuario()!=null && validar.getPassword()!=null){
				
				mensaje="Sesi�n iniciado";
				
				url="/Main.jsp";
				
				request.getSession().setAttribute("user", validar.getUsuario());
				request.getSession().setAttribute("email", validar.getEmail());
				
			}else{
				mensaje="Ingreso un dato no v�lido";
				url="/index.jsp";
				
			}
			request.setAttribute("mensaje",mensaje);
			request.getRequestDispatcher(url).forward(request,response);
		}else{
			request.getRequestDispatcher("/index.jsp").forward(request,response);
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
