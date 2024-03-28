package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.service.exception.ServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/28/2024
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<Map<String,Object>> handleServiceException(ServiceException){

    }
}
