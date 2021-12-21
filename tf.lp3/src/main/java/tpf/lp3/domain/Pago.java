package tpf.lp3.domain;

public class Pago {
	// Se especifica el tipo de pago ( dinero , creditos , etc )
	String Tipo_Pago;
	float Monto;
	String Destinatario;
	String Origen;
	

	public Pago(String tipo_Pago, float monto, String destinatario, String origen) {
		super();
		Tipo_Pago = tipo_Pago;
		Monto = monto;
		Destinatario = destinatario;
		Origen = origen;
	}
	// Getters y Setters
	public String getTipo_Pago() {
		return Tipo_Pago;
	}
	public void setTipo_Pago(String tipo_Pago) {
		Tipo_Pago = tipo_Pago;
	}
	public float getMonto() {
		return Monto;
	}
	public void setMonto(float monto) {
		Monto = monto;
	}
	public String getDestinatario() {
		return Destinatario;
	}
	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	// Metodo para generar pago
	public static void main(String[] args) {
		//Pago pago= new Pago("Cash",100f,"Amandam","Pepe");
		
	}
	
}
