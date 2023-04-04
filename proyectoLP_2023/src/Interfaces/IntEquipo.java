package Interfaces;

import java.util.List;

import Modelo.Equipo;

public interface IntEquipo {
	public void RegistrarEquipo(Equipo equ);
	public void ActualizarEquipo(Equipo equ);
	public void EliminarEquipo(Equipo equ);
	public List<Equipo> ListarEquipos();
	public Equipo BuscarEquipo(Equipo equ);
}
