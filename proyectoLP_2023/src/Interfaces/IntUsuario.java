package Interfaces;


import java.util.List;

import Modelo.Usuario;

public interface IntUsuario {
	public void ActualizarUsuario(Usuario usus);
	public Usuario BuscarUsuario(Usuario usus);
	//public Usuario validarUsuario(Usuario usu);
	public List<Usuario> ListarUsuarios();
}
