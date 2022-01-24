package sistema.lp3.Utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sistema.lp3.domain.Usuario;
import sistema.lp3.exceptions.SistemaException;

public class Verificaciones_Utils {

	//Utilidad para la verificacion de crear usuario 
	//Parametros: la clase de usuario
	//Retorna si no se ingresa algun campo
	public static void verificarUsuario(Usuario user) throws SistemaException{
		if(isEmptyString(user.getnombre())) {
			System.out.println("No se ingreso nombre");
			throw new SistemaException("Para ingresar se debe ingresar un nombre");
		}
		if(isEmptyString(user.getcontra())) {
			System.out.println("No se ingreso contrasenha");
			throw new SistemaException("Para ingresar se debe ingresar una contrasehna");
		}
		if(isEmptyString(user.getemail())) {
			System.out.println("No se ingreso ningun correo");
			throw new SistemaException("Para ingresar se debe ingresar un correo");
		}
	}
	
	//Metodo para verificar si un string esta vacio
	public static Boolean isEmptyString(String cadena) {
		return cadena == null || cadena.isBlank();
	}
	
	//Utilidad para validar direccion de correo
	public static void validarCorreo(Usuario user) throws SistemaException{
		ArrayList<String> email = new ArrayList<String>();  
        //Agregamos el correo a la lista 
        email.add(user.getemail());  
        //Expresion general  
        String regx = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Obtenemos patron  
        Pattern pattern = Pattern.compile(regx);  
        //Iterar lista  
        for(String email1 : email){  
            //Crear instancia de matcher   
            Matcher matcher = pattern.matcher(email1);  
            System.out.println(email1 +" : "+ matcher.matches()+"\n");
            
            if (matcher.matches()==false) {
            	throw new SistemaException("El correo ingresado no es valido");
            }
        }
	}

}
