package sistema.lp3.exceptions;

import javax.management.AttributeNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiSistemaAdvice {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(SistemaException.class)
	public Response handleSistemaException(SistemaException ex) {
		Response response = new Response();
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.setMessage(ex.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return response;
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Throwable.class)
	public Response handleInternalException(Throwable ex) {
		System.out.println(ex);
		Response response = new Response();
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.setMessage("Ocurrio un error inesperado, favor comunicarse con soporte del sistema.");
		response.setTimeStamp(System.currentTimeMillis());
		return response;
	}
	
	
	@ExceptionHandler(AttributeNotFoundException.class)
    public ResponseEntity<Response> handleFoundException(AttributeNotFoundException ine){
        Response errorResponse = new Response();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(ine.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<Response>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleRequestException(Exception ex){
        Response errorResponse = new Response();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<Response>(errorResponse,HttpStatus.BAD_REQUEST);
    }

}
