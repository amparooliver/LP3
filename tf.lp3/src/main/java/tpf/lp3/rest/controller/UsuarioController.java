package tpf.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import tpf.lp3.constants.ApiPaths;
import tpf.lp3.domain.Usuario;
import tpf.lp3.domain.Usuario.RolEnum;
import tpf.lp3.exceptions.ServiceException;
import tpf.lp3.service.UsuarioService;
import tpf.lp3.serviceImpl.UsuarioServiceImpl;

@RestController
@RequestMapping(ApiPaths.USUARIO)
public class UsuarioController {
	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Usuario> list() {
		return usuarioService.findAll();
	}
	
	@PostMapping
	public void add(@RequestBody Usuario usuarios) {
		usuarioService.save(usuarios);
	}
	
	/*/**
	 * Método que lista todos los usuarios segun los filtros indicados
	 * @return Lista de usuarios encontrados
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Usuario> list(
    		@RequestParam(name = "UsuarioID",  required = false) Long Usuario_ID,
    		@RequestParam(name = "Nombre",  required = false) String Nombre,
    		@RequestParam(name = "Email",  required = false) String Email,
    		@RequestParam(name = "Rol", required = false) RolEnum Rol) throws ServiceException{
		
        try {
			return usuarioService.obtenerUsuario(Usuario_ID, Nombre, Email, Rol);
        } catch (Exception e) {
        	System.out.println(e);
			throw new ServiceException("Ocurrió un error inesperado al listar usuarios.");
		}
    }*/
	
}
