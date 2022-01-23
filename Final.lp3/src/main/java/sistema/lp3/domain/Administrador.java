package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Administrador extends Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bienes;
	
	public String getBienes() {
		return bienes;
	}

	public void setBienes(String bienes) {
		this.bienes = bienes;
	}
	
	public Administrador() {
		this.rol = "Administrador";
	}

	@Override
	public String toString() {
		return "Administrador [usuario_ID=" + usuario_ID + ", contra=" + contra + ", nombre=" + nombre + ", email="
				+ email + ", rol=" + rol + ", invitacion=" + invitacion + "]";
	}
	
}
