package adopet.api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice //Responsável por capturar e tratar as exceções de forma global
public class GlobalExceptionHandler {
    @ExceptionHandler(AdocaoException.class) //Indicando ao Spring que este método é um lidador de exceção AdocaoException
    public ResponseEntity<ResponseError> adocaoException(AdocaoException ex){

        ResponseError response = new ResponseError(
                ex.getMessage(),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now()
        );

        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> trataException(Exception ex){
        ResponseError response = new ResponseError(
                ex.getMessage(),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now()
        );

        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
