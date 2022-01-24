package sistema.lp3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sistema.lp3.domain.Organizacion;
import sistema.lp3.exceptions.SistemaException;

@Service
public interface Organizacion_service {
	
	List<Organizacion> findAll();

	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);
	
	void delete_org(long organizacion_ID) throws SistemaException;
	
	//Metodo para que el Angel investor pueda invertir en las organizaciones 
	void invertir(long organizacion_ID, int miembros, long monto);
}
