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
@Table (name = "USUARIOS")
public class Usuario {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column
	 Integer idUsuario;
	
	 @Column (name = "username")
     String username;
	 
	 @Column (name = "password")
     String password;
     
	 @Column (name = "nombre")
     String nombre;
     
	 @Column (name = "apellido")
     String apellido;
    
	 @Column (name = "celular")
     Integer numeroCel;
    
	 @Column (name = "email")
     String email;
    
	 @Column (name = "tipouser")
     String tipoUs;
	 
	 public Usuario() {
		// TODO Auto-generated constructor stub
	}

	 public Usuario(Integer idUsuario, String username, String password, String nombre, String apellido,
			Integer numeroCel, String email, String tipoUs) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCel = numeroCel;
		this.email = email;
		this.tipoUs = tipoUs;
	 }

	 public Integer getIdUsuario() {
		 return idUsuario;
	 }

	 public void setIdUsuario(Integer idUsuario) {
		 this.idUsuario = idUsuario;
	 }

	 public String getUsername() {
		 return username;
	 }

	 public void setUsername(String username) {
		 this.username = username;
	 }

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getApellido() {
		 return apellido;
	 }

	 public void setApellido(String apellido) {
		 this.apellido = apellido;
	 }

	 public Integer getNumeroCel() {
		 return numeroCel;
	 }

	 public void setNumeroCel(Integer numeroCel) {
		 this.numeroCel = numeroCel;
	 }

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
	 }

	 public String getTipoUs() {
		 return tipoUs;
	 }

	 public void setTipoUs(String tipoUs) {
		 this.tipoUs = tipoUs;
	 }
	 
	 
}
