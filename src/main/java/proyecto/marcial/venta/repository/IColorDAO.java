package proyecto.marcial.venta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proyecto.marcial.venta.model.Color;
import proyecto.marcial.venta.model.Producto;

@Repository
public interface IColorDAO extends CrudRepository<Color, String>{
	
	@Query("from Color c order by c.codigo")
	public List<Color> findAll();

}
