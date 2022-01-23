package sistema.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.lp3.domain.Administrador;
import sistema.lp3.domain.Brainstormer;
import sistema.lp3.domain.Implementador;
import sistema.lp3.domain.Sponsor;
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
		
		if(Objects.nonNull(user.getnombre()) && !"".equalsIgnoreCase(user.getnombre())) {
			usuario.setnombre(user.getnombre());
		}
		
		if(Objects.nonNull(user.getcontra()) && !"".equalsIgnoreCase(user.getcontra())) {
			usuario.setcontra(user.getcontra());
		}
		
		if(Objects.nonNull(user.getemail()) && !"".equalsIgnoreCase(user.getemail())) {
			usuario.setemail(user.getemail());
		}
		
		if(Objects.nonNull(user.getrol()) && !"".equalsIgnoreCase(user.getrol())) {
			usuario.setrol(user.getrol());
		}
		
		return usuarioRepository.save(usuario);
		
	}
	
	@Override
	public List<Usuario> findByRol(String rol){
		List<Usuario> users = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepository.findByRol(rol).iterator();
		while (iteratorUsuarios.hasNext()) {
			users.add(iteratorUsuarios.next());
		}
		return users;	
	}

	public Administrador update_admin(Administrador user, long usuario_ID) {
		Administrador admin= (Administrador) usuarioRepository.findById(usuario_ID).get();
		
		if(Objects.nonNull(user.getnombre()) && !"".equalsIgnoreCase(user.getnombre())) {
			admin.setnombre(user.getnombre());
		}
		
		if(Objects.nonNull(user.getcontra()) && !"".equalsIgnoreCase(user.getcontra())) {
			admin.setcontra(user.getcontra());
		}
		
		if(Objects.nonNull(user.getemail()) && !"".equalsIgnoreCase(user.getemail())) {
			admin.setemail(user.getemail());
		}
		
		if(Objects.nonNull(user.getBienes()) && !"".equalsIgnoreCase(user.getBienes())) {
			admin.setBienes(user.getBienes());
		}
		
		return usuarioRepository.save(admin);
	}

	public Sponsor update_sponsor(Sponsor user, long usuario_ID) {
		Sponsor sponsor= (Sponsor) usuarioRepository.findById(usuario_ID).get();
		
		if(Objects.nonNull(user.getnombre()) && !"".equalsIgnoreCase(user.getnombre())) {
			sponsor.setnombre(user.getnombre());
		}
		
		if(Objects.nonNull(user.getcontra()) && !"".equalsIgnoreCase(user.getcontra())) {
			sponsor.setcontra(user.getcontra());
		}
		
		if(Objects.nonNull(user.getemail()) && !"".equalsIgnoreCase(user.getemail())) {
			sponsor.setemail(user.getemail());
		}
		
		if(Objects.nonNull(user.getBienes()) && !"".equalsIgnoreCase(user.getBienes())) {
			sponsor.setBienes(user.getBienes());
		}
		
		if(Objects.nonNull(user.getCategoria()) && !"".equalsIgnoreCase(user.getCategoria())) {
			sponsor.setCategoria(user.getCategoria());
		}
		return usuarioRepository.save(sponsor);
	}
	
	public Implementador update_implementador(Implementador user, long usuario_ID) {
		Implementador implementador= (Implementador) usuarioRepository.findById(usuario_ID).get();
		
		if(Objects.nonNull(user.getnombre()) && !"".equalsIgnoreCase(user.getnombre())) {
			implementador.setnombre(user.getnombre());
		}
		
		if(Objects.nonNull(user.getcontra()) && !"".equalsIgnoreCase(user.getcontra())) {
			implementador.setcontra(user.getcontra());
		}
		
		if(Objects.nonNull(user.getemail()) && !"".equalsIgnoreCase(user.getemail())) {
			implementador.setemail(user.getemail());
		}
		
		if(Objects.nonNull(user.getAsignacion()) && !"".equalsIgnoreCase(user.getAsignacion())) {
			implementador.setAsignacion(user.getAsignacion());
		}
	
		return usuarioRepository.save(implementador);
	}
	
	public Brainstormer update_brainstormer(Brainstormer user, long usuario_ID) {
		Brainstormer brainstormer= (Brainstormer) usuarioRepository.findById(usuario_ID).get();
		
		if(Objects.nonNull(user.getnombre()) && !"".equalsIgnoreCase(user.getnombre())) {
			brainstormer.setnombre(user.getnombre());
		}
		
		if(Objects.nonNull(user.getcontra()) && !"".equalsIgnoreCase(user.getcontra())) {
			brainstormer.setcontra(user.getcontra());
		}
		
		if(Objects.nonNull(user.getemail()) && !"".equalsIgnoreCase(user.getemail())) {
			brainstormer.setemail(user.getemail());
		}
		
		if(Objects.nonNull(user.getProfesion()) && !"".equalsIgnoreCase(user.getProfesion())) {
			brainstormer.setProfesion(user.getProfesion());
		}
		
		if(Objects.nonNull(user.getIdea()) && !"".equalsIgnoreCase(user.getIdea())) {
			brainstormer.setIdea(user.getIdea());
		}
		return usuarioRepository.save(brainstormer);
	}
	
	public void financiamiento(long usuario_ID, float monto) {
		//Realizar la transferencia de acuerdo al monto al usuario asignado
		//Retorna nulo 
	}
	
}
