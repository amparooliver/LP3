package sistema.lp3.Utils;

import sistema.lp3.Utils.interfaces.Notificable;

public final class Email_Utils {
	
	
  	 //Utilidad que notifica vencimiento de credencial a traves de un correo electronico

  	public static void notificarVencimientoEmail(Notificable notificable) {
  		String email = notificable.getemail();
  		String nombre = notificable.getnombre();
  		String asunto = "Vencimiento de Membresia";
  		String cuerpo = String.format(
  				"Estimado Sr/a. " + nombre
  				+ "%s\nSu membresia a nuestra plataforma expira en una semana. Si desea renovarla, ingresar a la seccion de Membresia y completar los datos solicitados.  "
  				+ "%s.\nGracias por elegirnos!,"
  				+ "Departamento de Asistencia al Cliente.");
  		
  		Email_Utils.enviarEmail(email, asunto, cuerpo);
  	}
  	
  	
  	 //Utilidad que envia un correo, simula el envio con una impresion en consola

  	public static void enviarEmail(String email, String asunto, String cuerpo) {
  		System.out.println("Enviando mail al: " + email);
  		System.out.println("Asunto: " + asunto);
  		System.out.println("Cuerpo: " + cuerpo);
  		System.out.println("SUCCESS.");
  	}
}
