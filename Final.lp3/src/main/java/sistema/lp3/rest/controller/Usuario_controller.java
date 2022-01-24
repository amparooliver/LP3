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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import sistema.lp3.constants.ApiPaths;
import sistema.lp3.domain.Administrador;
import sistema.lp3.domain.Angel_Investor;
import sistema.lp3.domain.Brainstormer;
import sistema.lp3.domain.Implementador;
import sistema.lp3.domain.Sponsor;
import sistema.lp3.domain.Usuario;
import sistema.lp3.exceptions.SistemaException;
import sistema.lp3.service.impl.Usuario_service_impl;


@RestController
@RequestMapping(ApiPaths.USUARIO)
public class Usuario_controller {
	
	@Autowired
	private  Usuario_service_impl Usuario_service;
	
	
	//Request para listar todos los usuarios 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> list() throws SistemaException{
			try {
				List<Usuario> usuarios= Usuario_service.findAll();	
				return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
			} catch (Exception e) {
				System.out.println(e);
				throw new SistemaException("Error al listar usuarios");
			}	
	}
	
	//Post para guardar usuarios 
	@PostMapping
	public ResponseEntity<Usuario> add(@RequestBody Usuario user, UriComponentsBuilder builder) throws SistemaException{
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Usuario>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear usuario");
		}
	}
	
	//Delete para eliminar usaurios por su id 
	@DeleteMapping("/{usuario_ID}")
	public ResponseEntity<Void> delete_user(@PathVariable("usuario_ID") long usuario_ID) throws SistemaException{
		try {
			Usuario_service.delete_user(usuario_ID);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al eliminar usuario");
		}
	}
	
	//Put para actualizar usuarios por su id 
	@PutMapping("/{usuario_ID}")
	public ResponseEntity<Usuario> update_user(@RequestBody Usuario user, @PathVariable("usuario_ID") long usuario_ID) throws SistemaException{
		try {
			Usuario_service.update_user(user, usuario_ID);
			return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar usuario");
		}
	}
	
	//Get para listar usuarios por rol
	@GetMapping("/{rol}")
	public ResponseEntity<List<Usuario>> findByRol(@PathVariable("rol") String rol) throws SistemaException{
		try {
			List<Usuario> users=Usuario_service.findByRol(rol);
			return new ResponseEntity<List<Usuario>>(users, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al listar los usuarios por roles");
		}
		
	}
	
	//Post para crear administrador
	@RequestMapping(value="/Administrador", method= RequestMethod.POST)
	public ResponseEntity<Administrador> add_admin(@RequestBody Administrador user,  UriComponentsBuilder builder) throws SistemaException{
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/Administrador/{usuario_ID}").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Administrador>(headers, HttpStatus.CREATED);
			
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear administrador");
		}
	}
	
	//Put para actualizar administrador 
	@PutMapping("/Administrador/{usuario_ID}")
	public ResponseEntity<Administrador> update_admin(@RequestBody Administrador user, @PathVariable("usuario_ID") long usuario_ID) throws SistemaException {
		try {
			Usuario_service.update_admin(user, usuario_ID);
			return new ResponseEntity<Administrador>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar administrador");
		}
	}
	
	//Post para crear sponsor 
	@RequestMapping(value="/Sponsor", method= RequestMethod.POST)
	public ResponseEntity<Sponsor> add_sponsor(@RequestBody Sponsor user, UriComponentsBuilder builder) throws SistemaException{
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/Sponsor/{usuario_ID}").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Sponsor>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear sponsor");
		}
	}
	
	//Put para actualizar sponsor
	@PutMapping("/Sponsor/{usuario_ID}")
	public ResponseEntity<Sponsor> update_sponsor(@RequestBody Sponsor user, @PathVariable("usuario_ID") long usuario_ID) throws SistemaException {
		try {
			Usuario_service.update_sponsor(user, usuario_ID);
			return new ResponseEntity<Sponsor>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar sponsor");
		}
	}
	
	//Post para crear Angel Inversor 
	@RequestMapping(value="/Angel", method= RequestMethod.POST)
	public ResponseEntity<Angel_Investor> add_angel(@RequestBody Angel_Investor user, UriComponentsBuilder builder) throws SistemaException{
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/Angel/{usuario_ID}").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Angel_Investor>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear angel");
		}	
	}
	
	//Post para crear Implementador 
	@RequestMapping(value="/Implementador", method= RequestMethod.POST)
	public ResponseEntity<Implementador> add_Implementador(@RequestBody Implementador user, UriComponentsBuilder builder) throws SistemaException {
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/Implementador/{usuario_ID}").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Implementador>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear implementador");
		}
	}
	
	//Put para actualizar implementador
	@PutMapping("/Implementador/{usuario_ID}")
	public ResponseEntity<Implementador> update_implementador(@RequestBody Implementador user, @PathVariable("usuario_ID") long usuario_ID) throws SistemaException{
		try {
			Usuario_service.update_implementador(user, usuario_ID);
			return new ResponseEntity<Implementador>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar implementador");
		}
	}
	
	//Post para crear Brainstormer
	@RequestMapping(value="/Brainstormer", method= RequestMethod.POST)
	public ResponseEntity<Brainstormer> add_Brainstormer(@RequestBody Brainstormer user, UriComponentsBuilder builder) throws SistemaException{
		try {
			Usuario_service.save(user);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(builder.path("/Brainstormer/{usuario_ID}").buildAndExpand(user.getusuario_ID()).toUri());
			return new ResponseEntity<Brainstormer>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al crear Brainstormer");
		}
	}
	
	//Put para actualizar brainstormer
	@PutMapping("/Brainstormer/{usuario_ID}")
	public ResponseEntity<Brainstormer> update_brainstormer(@RequestBody Brainstormer user, @PathVariable("usuario_ID") long usuario_ID) throws SistemaException {
		try {
			Usuario_service.update_brainstormer(user, usuario_ID);
			return new ResponseEntity<Brainstormer>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			throw new SistemaException("Error al actualizar Brainstormer");
		}
	}

	
}
