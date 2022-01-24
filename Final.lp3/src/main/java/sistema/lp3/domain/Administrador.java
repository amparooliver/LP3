package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/*Clase hija de usuario para el rol del Administrador
 *  Atributos: Bienes 
 *  */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Administrador extends Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bienes;
	
	//Getters y Setters
	
	public String getBienes() {
		return bienes;
	}

	public void setBienes(String bienes) {
		this.bienes = bienes;
	}
	
	//Metodo para asignar al usuario el rol de administrador
	public Administrador() {
		this.rol = "Administrador";
	}
	
}
