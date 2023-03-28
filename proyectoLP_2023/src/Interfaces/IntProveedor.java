package Interfaces;

import java.util.List;


import Modelo.Proveedor;

public interface IntProveedor {
	public void RegistrarProveedor(Proveedor prov);
	public void ActualizarProveedor(Proveedor prov);
	public void EliminarProveedor(Proveedor prov);
	public List<Proveedor> ListarProveedores();
	public Proveedor BuscarProveedor(Proveedor em);
}
