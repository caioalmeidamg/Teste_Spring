package br.com.gerenciamento.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//Exemplo de handler de exceções

//A ExceptionResponse atua como uma classe modelo para transportar exceções

@ControllerAdvice  //Anotação que define que as exceções de todos os controllers serão lançadas aqui
@RestController //Devolve um json
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
/* Classe abastrada ResponseEntityExceptionHandler 
 * - serve para tratar exceções globalmente 
 * - enviar respostas http e definir status especificos
 * - usada principalmente para tratamento de exceções dos controllers
*/
	

	//Metodo que responde todas as exceções padrões
	@ExceptionHandler(Exception.class) //essa notação capta uma exceção para esse metodo
	public final ResponseEntity<ExceptionResponse> handleAllExceptions( Exception ex, WebRequest request) {
		
		//Pelo visto o objetivo desse método é tratar codigo 500 internal server error
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(),
				"ok",
				request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

/*    
	
	@ExceptionHandler(UnsupportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions( Exception ex, WebRequest request) {
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
*/    

}
