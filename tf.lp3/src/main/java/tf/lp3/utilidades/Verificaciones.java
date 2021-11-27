package tf.lp3.utilidades;

import tf.lp3.clases.Usuario;
import java.util.regex.*;
import java.util.*;

public class Verificaciones {
	//Utilidad para la verificacion de crear usuario 
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
	
	//Utilidad para validar direccion de correo
	public static void validarCorreo(Usuario user) {
		ArrayList<String> email = new ArrayList<String>();  
        //Agregamos el correo a la lista 
        email.add(user.getEmail());  
        //Expresion general  
        String regx = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Obtenemos patron  
        Pattern pattern = Pattern.compile(regx);  
        //Iterar lista  
        for(String email1 : email){  
            //Crear instancia de matcher   
            Matcher matcher = pattern.matcher(email1);  
            System.out.println(email1 +" : "+ matcher.matches()+"\n"); 
        }
    }
	
}
