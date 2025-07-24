package proyecto.marcial.venta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proyecto.marcial.venta.model.Producto;


@Repository
public interface IProductoDAO extends CrudRepository<Producto, Integer>{

	@Query("from Producto p order by p.codigo")
	public List<Producto> findAll();
	
	public Producto findByCodigo(Integer codigo);
}
