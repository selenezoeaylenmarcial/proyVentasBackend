package proyecto.marcial.venta;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import proyecto.marcial.venta.controller.ProductoController;
import proyecto.marcial.venta.model.Producto;
import proyecto.marcial.venta.service.IProductoService;

@SpringBootApplication
public class ProyVentaApplication implements CommandLineRunner{

	@Autowired
	ProductoController prodCon;
	
	@Autowired
	IProductoService prodService;
	
	@Autowired
	Producto prod;

	public static void main(String[] args) {
		SpringApplication.run(ProyVentaApplication.class, args);
		
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		prod.setNombre("Cartera Perla");
		prod.setDescripcion("Cartera Eco Cuero Medidas 20x30cm");
		prod.setEstadoProducto(true);
		prod.setPrecio(30000);
		
		prodService.guardarProducto(prod); 
		
		System.out.println(
				"Resultado :" + prodCon.verProductos() +
				" Hay productos: " + prodService.obtenerProductos().toString()); 
		*/
		
		
	}

}
