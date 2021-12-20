package tf.lp3.clases;

import tf.lp3.excepciones.CorreoException;
import tf.lp3.excepciones.LoginException;
import tf.lp3.utilidades.Verificaciones;

public class Usuario extends Verificaciones{
	String Usuario_ID;
	String Usuario_contra;
	String Nombre;
	String Email;
	String Rol;
	
	//Constructor para clase usuario
	public Usuario(String usuario_ID, String usuario_contra, String nombre, String email, String rol) {
		super();
		Usuario_ID = usuario_ID;
		Usuario_contra = usuario_contra;
		Nombre = nombre;
		Email = email;
		Rol = rol;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario_ID() {
		return Usuario_ID;
	}
	public void setUsuario_ID(String usuario_ID) {
		Usuario_ID = usuario_ID;
	}
	public String getUsuario_contra() {
		return Usuario_contra;
	}
	public void setUsuario_contra(String usuario_contra) {
		Usuario_contra = usuario_contra;
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
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	
	public static void main(String[] args) {
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
 
	}
	
}
