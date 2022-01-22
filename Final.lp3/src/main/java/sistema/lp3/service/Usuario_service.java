package sistema.lp3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sistema.lp3.domain.Usuario;

@Service
public interface Usuario_service {
	
	//Metodo para listar todos los usuarios
	List<Usuario> findAll();
	
	//Metodo para eliminar un usuario por su id 
	void delete_user(long Usuario_ID);
	
	//Metodo para actualizar datos de usuarios segun su id 
	Usuario update_user(Usuario user, long usuario_ID);

	//List<Usuario> findbyRol(String Rol);
	
}

