package tf.lp3.interfaces;
import tpf.lp3.domain.Usuario;
import tpf.lp3.domain.Proyecto;

public interface ProyectoService {
	/*
	 * Metodo nuevoMiembro Recibe como parametros un proyecto y un usuario y
	 * devuelve una proyecto con el usuario unido a el
	 */
	public Proyecto nuevoMiembro(Proyecto proyecto, Usuario usuario);
}
