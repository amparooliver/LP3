package tpf.lp3.service;

import java.util.List;

import tpf.lp3.domain.Organizacion;
import tpf.lp3.domain.Proyecto;
import tpf.lp3.domain.Usuario;


public interface OrganizacionService {
	/*
	 * Medoto agregarCharla Recibe como parametros un evento y una charla y devuelve
	 * un evento con la charla en su lista de charlas
	 * 
	 */
	public Proyecto agregarProyecto(Organizacion organizacion, Proyecto proyecto);

	/*
	 * Metodo listarExpositores Recibe como parametro un evento y devuelve una lista
	 * de todos los expositores de las charlas de los mismos
	 */
	public List<Usuario> listarIntegrantes(Organizacion organizacion);
	
	public Organizacion agregarIntegrante(Organizacion organizacion, Usuario usuario);
}
