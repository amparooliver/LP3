package sistema.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sistema.lp3.constants.ApiPaths;
import sistema.lp3.domain.Administrador;
import sistema.lp3.domain.Usuario;
import sistema.lp3.repository.Usuario_repository;
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
	@DeleteMapping("/{usuario_ID}")
	public String delete_user(@PathVariable("usuario_ID") long usuario_ID) {
		Usuario_service.delete_user(usuario_ID);
		
		return "Usuario exitosamente eliminado";
	}
	
	//Put para actualizar usuarios por su id 
	@PutMapping("/{usuario_ID}")
	public Usuario update_user(@RequestBody Usuario user, @PathVariable("usuario_ID") long usuario_ID) {
		return Usuario_service.update_user(user, usuario_ID);
	}
	
	//Get para listar usuarios por rol
	@GetMapping("/{rol}")
	public List<Usuario> findByRol(@PathVariable("rol") String rol){
	    List<Usuario> users=Usuario_service.findByRol(rol);
	    return users;
	}
	
	//Post para crear administrador
	@RequestMapping(value="/Administrador", method= RequestMethod.POST)
	public void add_admin(@RequestBody Administrador user) {
		Usuario_service.save(user);
	}
	
	//Put para actualizar administrador 
	@PutMapping("/Administrador/{usuario_ID}")
	public Usuario update_admin(@RequestBody Administrador user, @PathVariable("usuario_ID") long usuario_ID) {
		return Usuario_service.update_admin(user, usuario_ID);
	}
	
	
	
}
