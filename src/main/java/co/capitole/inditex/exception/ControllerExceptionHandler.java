package co.capitole.inditex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import co.capitole.inditex.model.ErrorObject;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorObject> handleResourceNotFoundException(Exception ex) {
		ErrorObject eObject = new ErrorObject.ErrorObjectBuilder().status(HttpStatus.NOT_FOUND.value())
				.message(ex.getMessage()).timestamp(System.currentTimeMillis()).builder();
		return new ResponseEntity<>(eObject, HttpStatus.NOT_FOUND);
	}
}
