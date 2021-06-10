package com.digitalhouse.Gerador.de.Diploma.V2.exceptions;

import jdk.javadoc.doclet.Reporter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ApiExceptionControllerAdvice  {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){
        List<ValidationError> validationErrorList = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach(fieldError -> {
            validationErrorList.add(new ValidationError(fieldError.getField(), fieldError.getDefaultMessage()));
        });

        return new ResponseEntity<List>(validationErrorList, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity httpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request){
        ValidationError validationError = new ValidationError(
                "Campo não informado!",
                ex.getMessage()
        );
        return new ResponseEntity(validationError, HttpStatus.BAD_REQUEST);
    }
}
