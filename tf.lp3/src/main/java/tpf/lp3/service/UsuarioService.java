package tpf.lp3.service;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import tpf.lp3.domain.Usuario;
import tpf.lp3.domain.Usuario.RolEnum;

public interface UsuarioService {
	/**
	 * Metodo para listar todos los usuarios y de ser especificado obtener por filtros
	 * 
	 * @param Usuario_ID. Obtener usuario por su id. Puede ser null.
	 * @param Nombre. Obtener usuario con dicho nombre. Puede ser null.
	 * @param Email. Obtener usaurio por su correo. Puede ser null.
	 * @param Rol. Obtener usuario por rol. Puede ser null.
	 * @return Lista de usuarios con los filtros indicados 
	 */
	public List<Usuario> obtenerUsuario(Long Usuario_ID, String Nombre, String Email, RolEnum Rol);
	
}
