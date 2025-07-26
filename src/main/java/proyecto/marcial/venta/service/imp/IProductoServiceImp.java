package proyecto.marcial.venta.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.marcial.venta.model.Producto;
import proyecto.marcial.venta.repository.IProductoDAO;
import proyecto.marcial.venta.service.IProductoService;

@Service
public class IProductoServiceImp implements IProductoService{

	@Autowired 
	IProductoDAO prodDAO;
	
	@Autowired
	Producto producto;
	
	@Override
	public Producto guardarProducto(Producto prodGuardado) {
		// TODO Auto-generated method stub
		return prodDAO.save(prodGuardado);
	}

	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		System.out.println(prodDAO.findAll().size());
		return prodDAO.findAll();
	}

	@Override
	public Producto buscarProducto(Integer codigo) {
		// TODO Auto-generated method stub
		return prodDAO.findByCodigo(codigo);
	}

	@Override
	public void eliminarProducto(Producto prodEliminar) {
		// TODO Auto-generated method stub
		
	}

}
