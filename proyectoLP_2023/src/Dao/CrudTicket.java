package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarBD;
import Interfaces.IntTicket;
import Modelo.Ticket;

public class CrudTicket implements IntTicket {

	@Override
	public void AgregarTicket(Ticket tk) {
		String sql ="insert into ticket values (null,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			
			ps.setString(1,tk.getNombre());
			ps.setInt(2, tk.getTipo());
			ps.setString(3, tk.getPrioridad());
			ps.setString(4,  tk.getCategoria());
			ps.setString(5, tk.getFuenteSol());
			ps.setDate(6,new java.sql.Date(tk.getFechaAper().getTime()));
			ps.setDate(7, new java.sql.Date(tk.getFechaResol().getTime()));
			ps.setInt(8,tk.getIdDetAt());
			
			int y=ps.executeUpdate();
			if(y>0){		
				System.out.println("TICKET REGISTRADO en la BD correctamente");	
			}else{
				System.out.println("TICKET NO REGISTRADO en la BD");	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al registar" + e.getMessage());	
		
		}//FIN DEL CATCH
		
	}

	@Override
	public Ticket BuscarTicket(Ticket cod) {
		//REALIZAMOS LA CADENA SQL
				String sql="select * from ticket where idTicket=?";
						PreparedStatement ps=null;
						ResultSet rs=null;
						Ticket tk = new Ticket();
						try {
							ps=ConectarBD.conexion().prepareStatement(sql);
							//asignamos el parametro
							ps.setInt(1,cod.getIdTicket());
							//ejecutamos
							rs=ps.executeQuery();
							//aplicamos una condicion
							if(rs.next()){		
							
							//RECUPERAMOS LOS VALORES
							tk.setIdTicket(rs.getInt(1));
							tk.setNombre(rs.getString(2));
							tk.setTipo(rs.getInt(3));
							tk.setPrioridad(rs.getString(4));
							tk.setCategoria(rs.getNString(5));
							tk.setFuenteSol(rs.getString(6));
							tk.setFechaAper(rs.getDate(7));
							tk.setFechaResol(rs.getDate(8));
							tk.setIdDetAt(rs.getInt(9));
							}//fin de la condicion
						}catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();		
							}  		
				return tk;
		
	}

	@Override
	public List<Ticket> ListarTickets() {
		String sql="select * from ticket";
		PreparedStatement ps=null;
		ResultSet rs=null;
		//ARRAY
		List<Ticket> listar = new ArrayList<Ticket>();
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			rs=ps.executeQuery();
			//aplicamos un bucle..
			while(rs.next()){	
			Ticket tk = new Ticket();
			
			//RECUPERAMOS LOS VALORES
			tk.setIdTicket(rs.getInt(1));
			tk.setNombre(rs.getString(2));
			tk.setTipo(rs.getInt(3));
			tk.setPrioridad(rs.getString(4));
			tk.setCategoria(rs.getNString(5));
			tk.setFuenteSol(rs.getString(6));
			tk.setFechaAper(rs.getDate(7));
			tk.setFechaResol(rs.getDate(8));
			tk.setIdDetAt(rs.getInt(9));
			
			listar.add(tk);
				
			}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		return listar;
	}

	@Override
	public List<Ticket> ListarTicketsTodo() {
		String sql="SELECT t.idTicket, t.nombre, t.tipo, t.prioridad, t.categoria, t.fuenteSol, t.fechaApertura, t.fechaResulucion, d.idDetalleAtencion as idDetalle, d.estado, d.descripcion FROM ticket t JOIN detalleAtencion d ON t.idDetalleAtencion = d.idDetalleAtencion";

		PreparedStatement ps=null;
		ResultSet rs=null;
		//ARRAY
		List<Ticket> listar = new ArrayList<Ticket>();
		
		try{
			ps=ConectarBD.conexion().prepareStatement(sql);
			rs=ps.executeQuery();
			//aplicamos un bucle..
			while(rs.next()){	
			Ticket tk = new Ticket();
			
			//RECUPERAMOS LOS VALORES
			tk.setIdTicket(rs.getInt(1));
			tk.setNombre(rs.getString(2));
			tk.setTipo(rs.getInt(3));
			tk.setPrioridad(rs.getString(4));
			tk.setCategoria(rs.getNString(5));
			tk.setFuenteSol(rs.getString(6));
			tk.setFechaAper(rs.getDate(7));
			tk.setFechaResol(rs.getDate(8));
			tk.setIdDetAt(rs.getInt(9));
			
			tk.setEstado(rs.getString(10));
			tk.setDescripcion(rs.getString(11));
			
			listar.add(tk);
				
			}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		return listar;
	}

	@Override
	public Ticket BuscarTicketTodo(Ticket cod) {
		String sql="SELECT t.idTicket, t.nombre, t.tipo, t.prioridad, t.categoria, t.fuenteSol, t.fechaApertura, t.fechaResulucion, d.idDetalleAtencion as idDetalle, d.estado, d.descripcion FROM ticket t JOIN detalleAtencion d ON t.idDetalleAtencion = d.idDetalleAtencion WHERE t.idTicket=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Ticket tk = new Ticket();
		try {
			ps=ConectarBD.conexion().prepareStatement(sql);
			//asignamos el parametro
			ps.setInt(1,cod.getIdTicket());
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos una condicion
			if(rs.next()){		
			
			//RECUPERAMOS LOS VALORES
			tk.setIdTicket(rs.getInt(1));
			tk.setNombre(rs.getString(2));
			tk.setTipo(rs.getInt(3));
			tk.setPrioridad(rs.getString(4));
			tk.setCategoria(rs.getNString(5));
			tk.setFuenteSol(rs.getString(6));
			tk.setFechaAper(rs.getDate(7));
			tk.setFechaResol(rs.getDate(8));
			tk.setIdDetAt(rs.getInt(9));			
			tk.setEstado(rs.getString(10));
			tk.setDescripcion(rs.getString(11));
			}//fin de la condicion
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
			}  		
return tk;
		
	}
	
}
