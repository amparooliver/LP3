package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sistema.lp3.constants.ApiPaths;
import sistema.lp3.domain.Transferencia;
import sistema.lp3.service.impl.Transferencia_service_impl;

@RestController
@RequestMapping(ApiPaths.TRANSFERENCIA)
public class Transferencia_controller {
	
	@Autowired
	private Transferencia_service_impl transferencia_service_impl;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Transferencia> mostrar(){
			return transferencia_service_impl.findAll();
	}

	//Post para guardar transferencias
	@PostMapping
	public void add(@RequestBody Transferencia transferencia) {
		transferencia_service_impl.save(transferencia);
	}
	
	//Delete para eliminar transferencias por su id 
	@DeleteMapping("/{transferencia_ID}")
	public String delete_transfer(@PathVariable("transferencia_ID") long transferencia_ID) {
		transferencia_service_impl.delete_transfer(transferencia_ID);
		
		return "transferencia exitosamente eliminada";
	}
	
	//Put para actualizar usuarios por su id 
	@PutMapping("/{transferencia_ID}")
	public Transferencia update_transfer(@RequestBody Transferencia transfer, @PathVariable("transferencia_ID") long transferencia_ID) {
		return transferencia_service_impl.update_transfer(transfer, transferencia_ID);
	}
}
