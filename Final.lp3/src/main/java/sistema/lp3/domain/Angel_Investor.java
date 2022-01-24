package sistema.lp3.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/*Clase hija de Usuario para rol de Angel Investor
 * Atributos: Bienes, Lista de Organizaciones a Invertir
 * */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Angel_Investor extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bienes;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Organizacion> listaOrganizaciones;
	
	//Getters y Setters

	public String getBienes() {
		return bienes;
	}

	public void setBienes(String bienes) {
		this.bienes = bienes;
	}

	public List<Organizacion> getListaOrganizaciones() {
		return listaOrganizaciones;
	}

	public void setListaOrganizaciones(List<Organizacion> listaOrganizaciones) {
		this.listaOrganizaciones = listaOrganizaciones;
	}
	
	//Metodo para asignar rol a usuario
	public Angel_Investor() {
		this.rol = "Angel";
	}

	
}