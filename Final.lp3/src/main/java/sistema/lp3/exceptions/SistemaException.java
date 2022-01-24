package sistema.lp3.exceptions;

import java.io.Serializable;

public class SistemaException extends Exception implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public SistemaException() {
		// TODO Auto-generated constructor stub
	}

	public SistemaException(String message) {
		super(message);
		this.message = message;
	}

	public SistemaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SistemaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SistemaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SistemaException [message=" + message + "]";
	}
	
	

}
