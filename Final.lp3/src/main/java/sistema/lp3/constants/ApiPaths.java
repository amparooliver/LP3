package sistema.lp3.constants;

/*Clase para especificar los paths a consultar. */
public class ApiPaths {
	private static final String BASE_API = "/api/lp3"; //Para la api rest en general
	
	public static final String USUARIO = BASE_API + "/usuario"; //Para el CRUD de usuario
	public static final String ORGANIZACION = BASE_API + "/organizacion"; //Para el CRUD de organizacion
	public static final String TRANSFERENCIA = BASE_API + "/transferencia"; //Para el CRUD de transferencia

}
