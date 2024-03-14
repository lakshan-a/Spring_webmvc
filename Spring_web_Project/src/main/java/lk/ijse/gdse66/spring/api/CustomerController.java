package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/14/2024
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @GetMapping
    public String GetAllCustomer(){
        return "GetAllCustomer()";
    }
}
