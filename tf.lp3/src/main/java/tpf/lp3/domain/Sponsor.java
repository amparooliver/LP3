package tpf.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sponsor extends Usuario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Usuario_ID;

	public String getUsuario_ID() {
		return Usuario_ID;
	}

	public void setUsuario_ID(String usuario_ID) {
		Usuario_ID = usuario_ID;
	}
	
}
