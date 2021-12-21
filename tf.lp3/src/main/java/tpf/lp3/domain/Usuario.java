package tpf.lp3.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import tf.lp3.utilidades.Verificaciones;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Verificaciones implements Serializable{
	
	public enum RolEnum {
		ADMINISTRADOR,SPONSOR,ANGEL_INVESTOR,IMPLEMENTADOR,BRAINSTORMER,ORGANIZACION
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long Usuario_ID;
	protected String Contrasehna;
	protected String Nombre;
	protected String Email;
	@Enumerated(EnumType.STRING)
	protected RolEnum Rol;
	
	public Usuario() {
		super();
	}

	public Long getUsuario_ID() {
		return Usuario_ID;
	}
	public void setUsuario_ID(Long usuario_ID) {
		Usuario_ID = usuario_ID;
	}
	public String getContrasehna() {
		return Contrasehna;
	}
	public void setContrasehna(String contrasehna) {
		Contrasehna = contrasehna;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public RolEnum getRolEnum() {
		return Rol;
	}
	public void setRol(RolEnum Rol) {
		this.Rol = Rol;
	}

	
	/*public static void main(String[] args) {
		Usuario user= new Usuario("Amandam", "123", "Amanda", "amandagmail.com", "administrador");
		
		//System.out.println("Usuario: " + user.getUsuario_ID());
		//System.out.println("Nombre: " + user.getNombre());
		try {
			verificarUsuario(user);
			validarCorreo(user);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CorreoException e) {
			e.printStackTrace();
		}
 
	}*/
	
}