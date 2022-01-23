package sistema.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.lp3.domain.Organizacion;
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

	public void save(Organizacion organizaciones) {
		organizacion_repository.save(organizaciones);
		
	}
	
	@Override
	public void delete_org(long organizacion_ID) {
		organizacion_repository.deleteById(organizacion_ID);
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
	
}
