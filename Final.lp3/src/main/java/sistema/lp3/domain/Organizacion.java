package sistema.lp3.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
/*
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organizacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long Organizacion_ID;
	
	String nombreOrganizacion;
	String tipoDeOrganizacion;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Usuario> listaMiembros = new ArrayList<Usuario>();
	
	@OneToMany(cascade = CascadeType.ALL)
	protected List<Proyecto> listaProyectos;

	public Long getOrganizacion_ID() {
		return Organizacion_ID;
	}

	public void setOrganizacion_ID(Long organizacion_ID) {
		this.Organizacion_ID = organizacion_ID;
	}

	public String getNombreOrganizacion() {
		return nombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		this.nombreOrganizacion = nombreOrganizacion;
	}

	public String getTipoDeOrganizacion() {
		return tipoDeOrganizacion;
	}

	public void setTipoDeOrganizacion(String tipoDeOrganizacion) {
		this.tipoDeOrganizacion = tipoDeOrganizacion;
	}
	
	public List<Usuario> getListaMiembros() {
		return listaMiembros;
	}

	public void setListaMiembros(List<Usuario> listaMiembros) {
		this.listaMiembros = listaMiembros;
	}

	public List<Proyecto> getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(List<Proyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}

	public Organizacion() {
		super();
		
	}


	
	
}
