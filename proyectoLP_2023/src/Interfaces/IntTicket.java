package Interfaces;

import java.util.List;

import Modelo.Ticket;

public interface IntTicket {
	public void AgregarTicket(Ticket tk);
	public Ticket BuscarTicket(Ticket tk);
	public List<Ticket> ListarTickets();
	public List<Ticket> ListarTicketsTodo();
	public Ticket BuscarTicketTodo(Ticket tk);
}
