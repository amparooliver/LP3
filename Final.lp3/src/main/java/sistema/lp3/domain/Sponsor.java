package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Sponsor extends Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bienes;
	private String categoria;
	
	public String getBienes() {
		return bienes;
	}
	public void setBienes(String bienes) {
		this.bienes = bienes;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Sponsor() {
		this.rol = "Sponsor";
	}
}
