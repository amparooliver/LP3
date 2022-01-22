package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sistema.lp3.domain.Organizacion;
import sistema.lp3.service.impl.Organizacion_service_impl;
import sistema.lp3.constants.ApiPaths;


@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class Organizacion_controller {
	
	@Autowired
	private Organizacion_service_impl Organizacion_service;
	
	//Request para listar todos las organzaciones 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Organizacion> list(){
			return Organizacion_service.findAll();
	}
			
	//Post para guardar organizaciones
	@PostMapping
	public void add(@RequestBody Organizacion organizacion) {
		Organizacion_service.save(organizacion);
	}

}
