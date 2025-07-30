package proyecto.marcial.venta.model;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "PRODUCTOS")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer codigo;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Column (name = "precio")
	private double precio;
	
	@Column (name = "estado")
	private boolean estadoProducto;
	
	@ManyToMany
	@Column (name = "colores")
	private List<Color> colores = new ArrayList<Color>();
	
	@ManyToMany
	@Column (name = "etiquetas")
	private List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();
	
	@ElementCollection
	@CollectionTable(name = "producto_imagenes")
	@Column(name = "imagen", columnDefinition = "LONGTEXT")
    private List<String> imagenes = new ArrayList<String>();
	
	
    public Producto() {
		// TODO Auto-generated constructor stub
	}


	public Producto(Integer codigo, String nombre, String descripcion, double precio, boolean estadoProducto,
			List<Color> colores, List<Etiqueta> etiquetas, List<String> imagenes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estadoProducto = estadoProducto;
		this.colores = colores;
		this.etiquetas = etiquetas;
		this.imagenes = imagenes;
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


	public List<Color> getColores() {
		return colores;
	}


	public void setColores(List<Color> colores) {
		this.colores = colores;
	}


	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}


	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}


	public List<String> getImagenes() {
		return imagenes;
	}


	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}
    
    
	
}
