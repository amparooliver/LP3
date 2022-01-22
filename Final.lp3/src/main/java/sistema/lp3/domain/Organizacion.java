/*package sistema.lp3.domain;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.CascadeType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Organizacion extends Usuario implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long Organizacion_ID;
	

	protected String nombreOrganizacion;
	
	@OneToMany(cascade = CascadeType.ALL)
	protected List<Usuario> listaMiembros;
	@OneToMany(cascade = CascadeType.ALL)
	protected List<Proyecto> listaProyectos;
	

	public Long getOrganizacion_ID() {
		return Organizacion_ID;
	}

	public void setOrganizacion_ID(Long organizacion_ID) {
		Organizacion_ID = organizacion_ID;
	}

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

	public Organizacion(Long organizacion_ID, String nombreOrganizacion, List<Usuario> listaMiembros,
			List<Proyecto> listaProyectos) {
		super();
		Organizacion_ID = organizacion_ID;
		this.nombreOrganizacion = nombreOrganizacion;
		this.listaMiembros = listaMiembros;
		this.listaProyectos = listaProyectos;
	}



	
}
*/