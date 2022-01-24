package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import sistema.lp3.domain.Organizacion;
import sistema.lp3.exceptions.SistemaException;
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
	public ResponseEntity<List<Organizacion>> mostrar() throws SistemaException{
		try {
			List<Organizacion> orgs=organizacion_service_impl.findAll();
			return new ResponseEntity<List<Organizacion>>(orgs, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al listar organizaciones");
		}
	}

	//Post para guardar organizaciones
	@PostMapping
	public ResponseEntity<Organizacion> add(@RequestBody Organizacion organizacion, UriComponentsBuilder builder) throws SistemaException {
		try {
			organizacion_service_impl.save(organizacion);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/").buildAndExpand(organizacion.getOrganizacion_ID()).toUri());
			return new ResponseEntity<Organizacion>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear Organizacion");
		}
		
	}
	
	//Delete para eliminar transferencias por su id 
	@DeleteMapping("/{organizacion_ID}")
	public String delete_org(@PathVariable("organizacion_ID") long organizacion_ID) throws SistemaException{
		try {
			organizacion_service_impl.delete_org(organizacion_ID);
			return "organizacion exitosamente eliminada";
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al eliminar organizacion");
		}
	}
	
	@GetMapping("/{tipoDeOrganizacion}")
	public ResponseEntity<List<Organizacion>> findByTipoDeOrganizacion(@PathVariable("tipoDeOrganizacion") String tipoDeOrganizacion) throws SistemaException{
	    try {
	    	List<Organizacion> organizaciones= organizacion_service_impl.findByTipoDeOrganizacion(tipoDeOrganizacion);
	    	return new ResponseEntity<List<Organizacion>>(organizaciones, HttpStatus.FOUND);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al listar organizaciones");
		}
		
	}

}
