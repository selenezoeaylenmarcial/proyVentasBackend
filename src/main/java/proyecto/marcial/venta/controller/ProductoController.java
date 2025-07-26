package proyecto.marcial.venta.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.marcial.venta.model.Producto;
import proyecto.marcial.venta.service.IProductoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productos")
public class ProductoController {

	
	@Autowired
	IProductoService prodService;

	
	
	@PostMapping("/guardar")
	public Producto guardarProducto(@RequestBody Producto prod){
		
		return prodService.guardarProducto(prod);
		
	}
	
	@GetMapping
	public List<Producto> verProductos() {
		
		System.out.println("productos: " );
		
		return prodService.obtenerProductos();
	}
	
	@GetMapping("/ver/{cod}")
	public Producto verProducto(@PathVariable Integer cod) {
		
		System.out.println("producto encontrad");
		
		return prodService.buscarProducto(cod);
		
	}
}
