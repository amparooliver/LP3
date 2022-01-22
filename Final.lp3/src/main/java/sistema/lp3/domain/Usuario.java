package sistema.lp3.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Table(name="sis_usuarios")
@Entity
public class Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long Usuario_ID;
	
	protected String Contra;
	protected String Nombre;
	protected String Email;
	protected String Rol;
	
	@CreationTimestamp
	@Column(name="Fecha_Invitacion")
	protected Date Invitacion;

	public Long getUsuario_ID() {
		return Usuario_ID;
	}

	public void setUsuario_ID(Long usuario_ID) {
		this.Usuario_ID = usuario_ID;
	}

	public String getContra() {
		return Contra;
	}

	public void setContra(String contra) {
		this.Contra = contra;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		this.Rol = rol;
	}

	public Date getInvitacion() {
		return Invitacion;
	}

	public void setInvitacion(Date invitacion) {
		this.Invitacion = invitacion;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
