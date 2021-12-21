package tpf.lp3.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organizacion extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1848934476586319093L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Usuario_ID;
	
	private String nombreOrganizacion;
	@ElementCollection
	private List<Usuario> listaMiembros = new ArrayList<Usuario>();
	@ElementCollection
	private List<Proyecto> listaProyectos = new ArrayList<Proyecto>();
	

	public String getNombreOrganizacion() {
		return nombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		this.nombreOrganizacion = nombreOrganizacion;
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

	public Long getUsuario_ID() {
		return Usuario_ID;
	}

	public void setUsuario_ID(long usuario_ID) {
		Usuario_ID = usuario_ID;
	}

	public Organizacion(long usuario_ID, String nombreOrganizacion, List<Usuario> listaMiembros,
			List<Proyecto> listaProyectos) {
		super();
		Usuario_ID = usuario_ID;
		this.nombreOrganizacion = nombreOrganizacion;
		this.listaMiembros = listaMiembros;
		this.listaProyectos = listaProyectos;
	}

	
}
