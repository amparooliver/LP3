package py.edu.uc.lp3.interfaces;

public interface PagoService {
	// Metodo para realizar un pago
	public Pago crearPago(String Usuario_ID, Float Monto, String email);
	
	// Metodo para determinar si aplica impuesto
	public boolean conImpuesto();
	

}
