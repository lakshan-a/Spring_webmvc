package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.service.exception.DuplicateRecordException;
import lk.ijse.gdse66.spring.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/28/2024
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Map<String,Object>> handleServiceException(ServiceException exception){
        if (exception instanceof DuplicateRecordException){
            getCommonErrorAttribute(HttpStatus.CONFLICT);
        }

    }

    public Map<String,Object> getCommonErrorAttribute(HttpStatus status){
        LinkedHashMap<String,Object> errorAttribute = new  LinkedHashMap<>();
        errorAttribute.put("code",status.value());
        errorAttribute.put("status",status);
        return errorAttribute;

    }
}
