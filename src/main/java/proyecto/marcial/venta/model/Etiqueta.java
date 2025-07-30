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
@Table(name = "ETIQUETAS")
public class Etiqueta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idEtiqueta;
	
	@Column (name = "nombre")
	private String nombreEtiqueta;
	
	public Etiqueta() {
		// TODO Auto-generated constructor stub
	}

	public Etiqueta(Integer idEtiqueta, String nombreEtiqueta) {
		super();
		this.idEtiqueta = idEtiqueta;
		this.nombreEtiqueta = nombreEtiqueta;
	}

	public Integer getIdEtiqueta() {
		return idEtiqueta;
	}

	public void setIdEtiqueta(Integer idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}

	public String getNombreEtiqueta() {
		return nombreEtiqueta;
	}

	public void setNombreEtiqueta(String nombreEtiqueta) {
		this.nombreEtiqueta = nombreEtiqueta;
	}
	
}
