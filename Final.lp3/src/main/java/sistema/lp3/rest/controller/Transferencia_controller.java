package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import sistema.lp3.constants.ApiPaths;
import sistema.lp3.domain.Organizacion;
import sistema.lp3.domain.Transferencia;
import sistema.lp3.exceptions.SistemaException;
import sistema.lp3.service.impl.Transferencia_service_impl;

@RestController
@RequestMapping(ApiPaths.TRANSFERENCIA)
public class Transferencia_controller {
	
	@Autowired
	private Transferencia_service_impl transferencia_service_impl;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Transferencia>> mostrar() throws SistemaException{
		try {
			List<Transferencia> transferencias= transferencia_service_impl.findAll();
			return new ResponseEntity<List<Transferencia>>(transferencias,HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al listar transferencias");
		}
	}

	//Post para guardar transferencias
	@PostMapping
	public ResponseEntity<Transferencia> add(@RequestBody Transferencia transferencia, UriComponentsBuilder builder) throws SistemaException {
		try {
			transferencia_service_impl.save(transferencia);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/").buildAndExpand(transferencia.getTransferencia_ID()).toUri());
			return new ResponseEntity<Transferencia>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear transferencia");
		}
		
	}
	
	//Delete para eliminar transferencias por su id 
	@DeleteMapping("/{transferencia_ID}")
	public ResponseEntity<Void> delete_transfer(@PathVariable("transferencia_ID") long transferencia_ID) throws SistemaException{
		try {
			transferencia_service_impl.delete_transfer(transferencia_ID);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al eliminar transferencia");
		} 
		
	}
	
	//Put para actualizar transferencias por su id 
	@PutMapping("/{transferencia_ID}")
	public ResponseEntity<Transferencia> update_transfer(@RequestBody Transferencia transfer, @PathVariable("transferencia_ID") long transferencia_ID) throws SistemaException {
		try {
			transferencia_service_impl.update_transfer(transfer, transferencia_ID);
			return new ResponseEntity<Transferencia>(transfer, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar transferencia");
		} 
	}
}
