package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/*Clase hija de Usuario para rol de Brainstormer
 * Atributos: Profesion e idea a desarrollar
 * */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="usuario_ID")
public class Brainstormer extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String profesion;
	private String idea;
	
	//Metodo para asignar rol
	public Brainstormer() {
		this.rol = "Brainstormer";
	}
	
	//Getters y Setters

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	

}
