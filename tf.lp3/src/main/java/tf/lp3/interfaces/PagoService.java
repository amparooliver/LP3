package tf.lp3.interfaces;

public interface PagoService {
	    // Metodo para realizar un pago
		public void crearPago(String Usuario_ID, Float Monto, String email);
		// Metodo para verificar el pago
		public void verificarPago(String Usuario_ID, Float Monto, String email);
		// Metodo para determinar si aplica impuesto
		public boolean conImpuesto();
}
