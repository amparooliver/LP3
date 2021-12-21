package tpf.lp3.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tpf.lp3.domain.Usuario;
import tpf.lp3.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepository.findAll().iterator();
		while (iteratorUsuarios.hasNext()) {
			usuarios.add(iteratorUsuarios.next());
		}
		return usuarios;
	}
	

	public void save(Usuario usuarios) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuarios);
		
	}
}
