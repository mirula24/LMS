package amirulschool.lms.controller;


import amirulschool.lms.utils.page.Res;
import jakarta.validation.ConstraintDeclarationException;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.UnexpectedTypeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e) {
        return Res.renderJson(
                null,
                e.getMessage(),
                HttpStatus.BAD_REQUEST
        );
    }
    @ExceptionHandler(UnexpectedTypeException.class)
    public ResponseEntity<?> handleUnexpectedTypeException(UnexpectedTypeException e) {
        String message = e.getMessage();
        if(message.contains("birthDate")) {
            message = "birthDate cannot be black";
        }
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return Res.renderJson(
                null,
                message,
                status
        );
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntimeException(RuntimeException e) {
        String message = e.getMessage();
        if(message.contains("Student with id")) {
            message = "cannot find student with id";
        }
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return Res.renderJson(
                null,
                message,
                status
        );
    }
}
