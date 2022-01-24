package sistema.lp3.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import sistema.lp3.Utils.interfaces.Notificable;

@Table(name="sis_usuarios")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable, Notificable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long usuario_ID;
	
	protected String contra;
	protected String nombre;
	protected String email;
	protected String rol;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="Fecha_invitacion")
	protected Date invitacion;
	
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	protected Date fechaVencimiento;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	protected Date notificacionVencimiento;
	
	public Long getusuario_ID() {
		return usuario_ID;
	}

	public void setusuario_ID(Long usuario_ID) {
		this.usuario_ID = usuario_ID;
	}

	public String getcontra() {
		return contra;
	}

	public void setcontra(String contra) {
		this.contra = contra;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getrol() {
		return rol;
	}

	public void setrol(String rol) {
		this.rol = rol;
	}

	public Date getinvitacion() {
		return invitacion;
	}

	public void setinvitacion(Date invitacion) {
		this.invitacion = invitacion;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getNotificacionVencimiento() {
		return notificacionVencimiento;
	}

	public void setNotificacionVencimiento(Date notificacionVencimiento) {
		this.notificacionVencimiento = notificacionVencimiento;
	}

	public Usuario() {
		super();
	}
	
	
}
