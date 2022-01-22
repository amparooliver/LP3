package sistema.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.lp3.domain.Usuario;
import sistema.lp3.repository.Usuario_repository;
import sistema.lp3.service.Usuario_service;

@Service
public class Usuario_service_impl implements Usuario_service {
	@Autowired
	private Usuario_repository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		List<Usuario> users = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepository.findAll().iterator();
		while (iteratorUsuarios.hasNext()) {
			users.add(iteratorUsuarios.next());
		}
		return users;
	}

	public void save(Usuario user) {
		usuarioRepository.save(user);
	}

	@Override
	public void delete_user(long usuario_ID) {
		usuarioRepository.deleteById(usuario_ID);
	}

	@Override
	public Usuario update_user(Usuario user, long usuario_ID) {
		Usuario usuario= usuarioRepository.findById(usuario_ID).get();
		
		if(Objects.nonNull(user.getNombre()) && !"".equalsIgnoreCase(user.getNombre())) {
			usuario.setNombre(user.getNombre());
		}
		
		if(Objects.nonNull(user.getContra()) && !"".equalsIgnoreCase(user.getContra())) {
			usuario.setContra(user.getContra());
		}
		
		if(Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
			usuario.setEmail(user.getEmail());
		}
		
		if(Objects.nonNull(user.getRol()) && !"".equalsIgnoreCase(user.getRol())) {
			usuario.setRol(user.getRol());
		}
		
		return usuarioRepository.save(usuario);
		
	}
	
	/*@Override
	public List<Usuario> findbyRol(String Rol) {
		List<Usuario> users = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepository.findbyRol(Rol).iterator();
		while (iteratorUsuarios.hasNext()) {
			users.add(iteratorUsuarios.next());
		}
		return users;
	}*/
	
}
