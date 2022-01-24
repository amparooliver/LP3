package sistema.lp3.exceptions;

public class Response {

	private int status;
	private String message;
	private  long timeStamp;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp + "]";
	}
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
}
