package proyecto.marcial.venta.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "PRODUCTOS")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	Integer codigo;
	
	@Column (name = "nombre")
    String nombre;
	
	@Column (name = "descripcion")
    String descripcion;
	
	@Column (name = "precio")
    double precio;
	
	@Column (name = "estado")
    boolean estadoProducto;
	
    //ArrayList<String> colores;
    //imagenes!:Array<String>;
    //etiquetas!:Array<String>;
	
	
    public Producto() {
		// TODO Auto-generated constructor stub
	}
    

	public Producto(Integer codigo, String nombre, String descripcion, double precio, boolean estadoProducto) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estadoProducto = estadoProducto;
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(boolean estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
    
    
    
}
