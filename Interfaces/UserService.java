package py.edu.uc.lp3.interfaces;

public interface UserService {
	// Validar Acceso
	boolean validarLogin(String Usuario_ID, String Usuario_Contra);
	// Validar Registro
	boolean validarRegistro(String Usuario_ID, String Usuario_Contra);
	
	// Metodo para crear un Administrador
	public Administrador crearAdministrador(Administrador administrador);
	// Metodo para crear un Sponsor
	public Sponsor crearSponsor(Sponsor sponsor);
	// Metodo para crear un Angel Implementador
	public AngelImplementador crearAngelImplementador(AngelImplementador angelimplementador);
	// Metodo para crear un Brainstormer
	public Brainstormer crearBrainstormer(Brainstormer brainstormer);
	// Metodo para crear una Organizacion
	public Organziacion crearOrganizacion(Organizacion organizacion);
	
	// Metodo para listar un usuario por rol
	public List<Usuario> obtenerUsuario(String Usuario_ID, TipoUsuarioEnum rol, String email);
	
	// Metodo para listar una organizacion por tipo
	public List<Organizacion> obtenerOrganizacion(String Usuario_ID, TipoUsuarioEnum rol, String email);
	
	// Metodo para eliminar un usuario
	public void eliminarUsuario(String Usuario_ID);
	
}