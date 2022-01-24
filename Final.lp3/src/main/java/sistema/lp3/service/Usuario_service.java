package sistema.lp3.service;

import java.util.List;

import sistema.lp3.domain.Administrador;
import sistema.lp3.domain.Brainstormer;
import sistema.lp3.domain.Implementador;
import sistema.lp3.domain.Sponsor;
import sistema.lp3.domain.Usuario;
import sistema.lp3.exceptions.SistemaException;

public interface Usuario_service {
	
	//Metodo para crear un usuario
	//public Usuario crearUsuario(Usuario usuario);
	
	//Metodo para listar todos los usuarios
	List<Usuario> findAll();
	
	//Metodo para eliminar un usuario por su id 
	void delete_user(long usuario_ID);
	
	//Metodo para actualizar datos de usuarios segun su id 
	Usuario update_user(Usuario user, long usuario_ID);
	
	//Metodo para listar usuarios por roles
	List<Usuario> findByRol(String rol);
	
	//Metodo para actualizar administrador (los bienes)
	Administrador update_admin(Administrador user, long usuario_ID);
	
	//Metodo para actualizar sponsor 
	Sponsor update_sponsor(Sponsor user, long usuario_ID);
	
	//Metodo para que el sponsor pueda financiar a usuarios
	void financiamiento(long usuario_ID, float monto);
	
	//Metodo para actualizar implementador
	Implementador update_implementador(Implementador user, long usuario_ID);
	
	//Metodo para actualizar brainstormer
	Brainstormer update_brainstormer(Brainstormer user, long usuario_ID);
	
	//Metodo para que el implementador pueda recibir las correspondientes tareas 
	void RecibirAsignacion(long usuario_ID, String asignacion);
	
	//Metodo que envia un mensaje por mail para notificar al usuario que su membresia esta por expirar
	public void notificarVencimiento() throws SistemaException;
	
}

