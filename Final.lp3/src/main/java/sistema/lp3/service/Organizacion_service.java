package sistema.lp3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sistema.lp3.domain.Organizacion;

@Service
public interface Organizacion_service {
	
	List<Organizacion> findAll();

	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);
}
