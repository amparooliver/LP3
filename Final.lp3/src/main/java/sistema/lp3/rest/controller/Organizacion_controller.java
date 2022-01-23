package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sistema.lp3.domain.Organizacion;
import sistema.lp3.domain.Usuario;
import sistema.lp3.service.impl.Organizacion_service_impl;
import sistema.lp3.constants.ApiPaths;


@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class Organizacion_controller {
	
	@Autowired
	private Organizacion_service_impl organizacion_service_impl;
	
	/*
	 * Metodo mostrar() Retorna una lista de todos las organizaciones existentes en el
	 * repositorio
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Organizacion> mostrar(){
			return organizacion_service_impl.findAll();
	}

	//Post para guardar organizaciones
	@PostMapping
	public void add(@RequestBody Organizacion organizacion) {
		organizacion_service_impl.save(organizacion);
	}
	
	@GetMapping("/{tipoDeOrganizacion}")
	public List<Organizacion> findByTipoDeOrganizacion(@PathVariable("tipoDeOrganizacion") String tipoDeOrganizacion){
	    List<Organizacion> organizaciones= organizacion_service_impl.findByTipoDeOrganizacion(tipoDeOrganizacion);
	    return organizaciones;
	}

}
