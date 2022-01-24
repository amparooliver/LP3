package sistema.lp3.Utils;

import sistema.lp3.Utils.interfaces.Notificable;

public final class Email_Utils {
	
	
	// Utilidad que simula el envio de un mail (imprime en consola)
	// Aviso de que la membresia ESTA POR EXPIRAR (una semana)

  	public static void notificarVencimientoEmail(Notificable notificable) {
  		String email = notificable.getemail();
  		System.out.println("Enviando mail al: " + email);
  		String nombre = notificable.getnombre();
  		String asunto = "Vencimiento de Membresia";
  		System.out.println("Asunto: " + asunto);
  		System.out.println("Estimado Sr/a. "+ nombre + "\nSu membresia a nuestra plataforma expira en una semana. Si desea renovarla, ingresar a la seccion de Membresia y completar los datos solicitados.\nGracias por elegirnos!,\nDepartamento de Asistencia al Cliente.");
	
  	}
  	
	// Utilidad que simula el envio de un mail (imprime en consola)
  	// Aviso de que la membresia EXPIRO

  	public static void notificarVencimientoFinalEmail(Notificable notificable) {
  		String email = notificable.getemail();
  		System.out.println("Enviando mail al: " + email);
  		String nombre = notificable.getnombre();
  		String asunto = "Vencimiento de Membresia";
  		System.out.println("Asunto: " + asunto);
  		System.out.println("Estimado Sr/a. "+ nombre + "\nSu membresia a nuestra plataforma ha oficialmente expirado. Si desea renovarla, ingresar a la seccion de Membresia y completar los datos solicitados.\nGracias por elegirnos!,\nDepartamento de Asistencia al Cliente.");
	
  	}
  	
}
