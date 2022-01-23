package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Implementador extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String asignacion;
	
	public String getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(String asignacion) {
		this.asignacion = asignacion;
	}

	public Implementador() {
		this.rol = "Implementador";
	}


}
