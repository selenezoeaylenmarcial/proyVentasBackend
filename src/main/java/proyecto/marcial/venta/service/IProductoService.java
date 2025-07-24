package proyecto.marcial.venta.service;


import java.util.List;

import org.springframework.stereotype.Service;

import proyecto.marcial.venta.model.Producto;

@Service
public interface IProductoService {

	public Producto guardarProducto(Producto prodGuardado);
	public List<Producto> obtenerProductos();
	public Producto buscarProducto(Integer codigo);
	public void eliminarProducto(Producto prodEliminar);
	
}
