package sistema.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.lp3.Utils.Verificaciones_Utils;
import sistema.lp3.domain.Organizacion;
import sistema.lp3.exceptions.SistemaException;
import sistema.lp3.repository.Organizacion_repository;
import sistema.lp3.service.Organizacion_service;

@Service
public class Organizacion_service_impl implements Organizacion_service{
	
	@Autowired
	private Organizacion_repository organizacion_repository;

	@Override
	public List<Organizacion> findAll() {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> iteratorOrganizaciones = organizacion_repository.findAll().iterator();
		while (iteratorOrganizaciones.hasNext()) {
			organizaciones.add(iteratorOrganizaciones.next());
		}
		return organizaciones;
	}

	public void save(Organizacion organizaciones) throws SistemaException{
		if(! Verificaciones_Utils.verificarOrganizacion(organizaciones)) {
			throw new SistemaException("Error: Rellene todos los campos obligatorios");
		}
		else {
			organizacion_repository.save(organizaciones);
		}
	}
	
	@Override
	public void delete_org(long organizacion_ID) throws SistemaException {
		if(! organizacion_repository.existsById(organizacion_ID)) {
			throw new SistemaException("La organizacion a eliminar no existe");
		}
		else {
			organizacion_repository.deleteById(organizacion_ID);
		}
	}

	@Override
	public List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion) {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> iteratorOrganizaciones = organizacion_repository.findByTipoDeOrganizacion(tipoDeOrganizacion).iterator();
		while (iteratorOrganizaciones.hasNext()) {
			organizaciones.add(iteratorOrganizaciones.next());
		}
		return organizaciones;
	}
	
	public void invertir(long organizacion_ID, int miembros, long monto) {
		//Parametros: el id de organizacion, cantidad de miembros de la org y el monto a invertir 
		//Retorna nulo 
	}
	
}
