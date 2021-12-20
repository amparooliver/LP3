package tf.lp3.clases;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import tf.lp3.excepciones.CorreoException;
import tf.lp3.excepciones.LoginException;
import tf.lp3.utilidades.Verificaciones;

@Entity
public class Usuario extends Verificaciones implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Usuario_ID;
	
	private String Usuario_contra;
	private String Nombre;
	private String Email;
	private String Rol; // se va a modificar
	
	public Usuario() {
		super();
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
	
	//Constructor para clase usuario
	public Usuario(String usuario_ID, String usuario_contra, String nombre, String email, String rol) {
		super();
		Usuario_ID = usuario_ID;
		Usuario_contra = usuario_contra;
		Nombre = nombre;
		Email = email;
		Rol = rol; // se va a modificar
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
