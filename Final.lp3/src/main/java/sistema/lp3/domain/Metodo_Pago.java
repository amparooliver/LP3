package sistema.lp3.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Metodo_Pago implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long tipo_Pago_ID;
	
	String tipo_Pago;
	Float monto;
	String destinatario;
	protected Boolean remuneracionGrabada;
	

	public Long getTipo_Pago_ID() {
		return tipo_Pago_ID;
	}


	public void setTipo_Pago_ID(Long tipo_Pago_ID) {
		this.tipo_Pago_ID = tipo_Pago_ID;
	}


	public String getTipo_Pago() {
		return tipo_Pago;
	}


	public void setTipo_Pago(String tipo_Pago) {
		this.tipo_Pago = tipo_Pago;
	}


	public Float getMonto() {
		return monto;
	}


	public void setMonto(Float monto) {
		this.monto = monto;
	}


	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public Boolean getRemuneracionGrabada() {
		return remuneracionGrabada;
	}


	public void setRemuneracionGrabada(Boolean remuneracionGrabada) {
		this.remuneracionGrabada = remuneracionGrabada;
	}


	public Metodo_Pago() {
		super();
	}
	
	
}
