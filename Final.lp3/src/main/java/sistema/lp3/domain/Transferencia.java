package sistema.lp3.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Transferencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long transferencia_ID;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Metodo_Pago> metodoPago;
	
	public Long getTransferencia_ID() {
		return transferencia_ID;
	}

	public void setTransferencia_ID(Long transferencia_ID) {
		this.transferencia_ID = transferencia_ID;
	}

	public List<Metodo_Pago> getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(List<Metodo_Pago> metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Transferencia() {
		super();
	}
	
	// Metodo if boolean is true then calculate iva according to monto 
	
	

}
