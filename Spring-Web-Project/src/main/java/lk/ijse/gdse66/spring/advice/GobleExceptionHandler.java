package lk.ijse.gdse66.spring.advice;

import lk.ijse.gdse66.spring.service.exception.DuplicateRecordException;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/29/2024
 */

@RestControllerAdvice
public class GobleExceptionHandler {

    public Map<String,Object> getCommonErrorAttribute(HttpStatus status){
        LinkedHashMap<String,Object> errorAttributes = new LinkedHashMap<>();
        errorAttributes.put("code",status.value());
        errorAttributes.put("status",status);

        return errorAttributes;
    }


}
