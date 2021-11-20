package py.edu.uc.lp3.interfaces;

public interface MembresiaService {
	// Iniciar la membresia de un usuario
	public void iniciarMembresia(String Usuario_ID);
	// Notificacion a los usuarios de que la membresia esta por vencer via email 
	public void notificarVencimiento(String Usuario_ID);
	// Terminar la membresia de un usuario
	public void terminarMembresia(String Usuario_ID);
}
