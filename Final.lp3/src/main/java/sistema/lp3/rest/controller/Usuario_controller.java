package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sistema.lp3.constants.ApiPaths;
import sistema.lp3.domain.Usuario;
import sistema.lp3.service.impl.Usuario_service_impl;


@RestController
@RequestMapping(ApiPaths.USUARIO)
public class Usuario_controller {
	
	@Autowired
	private  Usuario_service_impl Usuario_service;
	
	//Request para listar todos los usuarios 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Usuario> list(){
			return Usuario_service.findAll();
	}
	
	//Post para guardar usuarios 
	@PostMapping
	public void add(@RequestBody Usuario user) {
		Usuario_service.save(user);
	}
	
	//Delete para eliminar usaurios por su id 
	@DeleteMapping("/{Usuario_ID}")
	public String delete_user(@PathVariable("Usuario_ID") long Usuario_ID) {
		Usuario_service.delete_user(Usuario_ID);
		
		return "Usuario exitosamente eliminado";
	}
	
	//Put para actualizar usuarios por su id 
	@PutMapping("/{Usuario_ID}")
	public Usuario update_user(@RequestBody Usuario user, @PathVariable("Usuario_ID") long Usuario_ID) {
		return Usuario_service.update_user(user, Usuario_ID);
	}
	
	/*@GetMapping(value = "/{userRole}")
	public List<Usuario> get_userbyRol(@PathVariable String Rol){
	    return Usuario_service.findbyRol(Rol);
	}*/
	
	
}
