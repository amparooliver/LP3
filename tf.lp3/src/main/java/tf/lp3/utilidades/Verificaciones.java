package tf.lp3.utilidades;

import tf.lp3.clases.Usuario;

public class Verificaciones {
	//Utitlidad para la verificacion de crear usuario 
	//Parametros: la clase de usuario
	//Retorna si no se ingresa algun campo
	public static void verificarUsuario(Usuario user) {
		if(isEmptyString(user.getNombre())) {
			System.out.println("No se ingreso nombre");
		}
		if(isEmptyString(user.getUsuario_contra())) {
			System.out.println("No se ingreso contrasenha");
		}
		if(isEmptyString(user.getUsuario_ID())) {
			System.out.println("No se ingreso usuario");
		}
		if(isEmptyString(user.getEmail())) {
			System.out.println("No se ingreso ningun correo");
		}
	}
	
	//Metodo para verificar si un string esta vacio
	public static Boolean isEmptyString(String cadena) {
		return cadena == null || cadena.isBlank();
	}
}
