package sistema.lp3.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sistema.lp3.domain.Metodo_Pago;
import sistema.lp3.domain.Organizacion;
import sistema.lp3.domain.Usuario;
import sistema.lp3.exceptions.SistemaException;

public class Verificaciones_Utils {

	//Utilidad para la verificacion de crear usuario 
	//Parametros: la clase de usuario
	//Retorna si no se ingresa algun campo
	public static Boolean verificarUsuario(Usuario user) throws SistemaException{
		boolean var= true;
		if(isEmptyString(user.getnombre())) {
			var= false;
			System.out.println("No se ingreso nombre");
			throw new SistemaException("Para crear usuario se debe ingresar un nombre");
		}
		if(isEmptyString(user.getcontra())) {
			var=false;
			System.out.println("No se ingreso contrasenha");
			throw new SistemaException("Para crear usuario se debe ingresar una contrasehna");
		}
		if(isEmptyString(user.getemail())) {
			var=false;
			System.out.println("No se ingreso ningun correo");
			throw new SistemaException("Para crear usuario se debe ingresar un correo");
			
		}
		if(! validarCorreo(user)){
			var=false;
			System.out.println("El correo ingresado es invalido");
			throw new SistemaException("Para crear usuario se necesita una direccion de correo");
		}
		else{
			var= true;
		}
		return var;
	}
	
	//Metodo para verificar si un string esta vacio
	public static Boolean isEmptyString(String cadena) {
		return cadena == null || cadena.isBlank();
	}
	
	//Utilidad para validar direccion de correo
	public static Boolean validarCorreo(Usuario user) throws SistemaException{
		boolean var= true;
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
            	var= false;
            	throw new SistemaException("El correo ingresado no es valido");
            }
        }
        return var;
	}
	
	public static Boolean verificarOrganizacion(Organizacion org) throws SistemaException{
		boolean var= true;
		if(isEmptyString(org.getNombreOrganizacion())) {
			var= false;
			System.out.println("No se ingreso nombre de la organizacion");
			throw new SistemaException("Para crear la organizacion se debe ingresar un nombre");
		}
		if(isEmptyString(org.getTipoDeOrganizacion())) {
			var=false;
			System.out.println("No se ingreso el tipo de organizacion");
			throw new SistemaException("Para crear la organizacion se debe ingresar el tipo");
		}
		else{
			var= true;
		}
		return var;
	}
	
	public static Boolean verificarPago(List<Metodo_Pago> pagos) throws SistemaException{
		boolean var= true;
		Iterator<Metodo_Pago> iteratorPagos= pagos.iterator();
		while (iteratorPagos.hasNext()) {
			Metodo_Pago p = iteratorPagos.next();
			if(isEmptyString(p.getDestinatario())) {
				var= false;
				System.out.println("No se ingreso el destinatario");
				throw new SistemaException("Para realizar una transferencia se debe ingresar un destinatario");
			}
			if(isEmptyString(p.getTipo_Pago())) {
				var=false;
				System.out.println("No se ingreso tipo de pago");
				throw new SistemaException("Para realizar una transferencia se debe ingresar una tipo de pago");
			}
			if(p.getMonto()==null) {
				var=false;
				System.out.println("No se ingreso ningun monto");
				throw new SistemaException("Para realizar una transferencia se debe ingresar un monto");
				
			}
			else{
				var= true;
			}
		}
		return var;
	}

}
