package sistema.lp3.service;

import java.util.List;

import sistema.lp3.domain.Usuario;

public interface Usuario_service {
	
	//Metodo para listar todos los usuarios
	List<Usuario> findAll();
	
	//Metodo para eliminar un usuario por su id 
	void delete_user(long usuario_ID);
	
	//Metodo para actualizar datos de usuarios segun su id 
	Usuario update_user(Usuario user, long usuario_ID);
	
	//Metodo para listar usuarios por roles
	List<Usuario> findByRol(String rol);
}

