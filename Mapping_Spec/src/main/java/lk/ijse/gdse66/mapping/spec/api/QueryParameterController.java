package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/query")
public class QueryParameterController {

    @PostMapping
    public String SaveCustomer(String id, String name, int age){
        return String.format("SaveCustomer(String id, String name, int age) : s%,s%,s%",id,name,age);
    }
}
