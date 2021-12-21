package tpf.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Proyecto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7562878724855337953L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Usuario_ID;

	private String nombreProyecto;
	private String descripcionProyecto;
	
	public Long getUsuario_ID() {
		return Usuario_ID;
	}
	public void setUsuario_ID(Long usuario_ID) {
		Usuario_ID = usuario_ID;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public String getDescripcionProyecto() {
		return descripcionProyecto;
	}
	public void setDescripcionProyecto(String descripcionProyecto) {
		this.descripcionProyecto = descripcionProyecto;
	}
	public Proyecto(Long usuario_ID, String nombreProyecto, String descripcionProyecto) {
		super();
		Usuario_ID = usuario_ID;
		this.nombreProyecto = nombreProyecto;
		this.descripcionProyecto = descripcionProyecto;
	}

	
	
	
}
