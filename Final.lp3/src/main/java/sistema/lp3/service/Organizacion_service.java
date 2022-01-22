package sistema.lp3.service;

import java.util.List;

import sistema.lp3.domain.Organizacion;

public interface Organizacion_service {
	
	List<Organizacion> findAll();

	/*List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);*/
}
