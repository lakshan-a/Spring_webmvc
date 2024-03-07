package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomers(){
        return "GetAllCustomer()";
    }

    @GetMapping("/{city}")
    public String getAllCustomerByCity(@PathVariable String city){
        return String.format("getAllCustomerByCity(String city) :%s ",city);
//        return "getAllCustomerByCity()";
    }

    @GetMapping("/{city}/{name}")
    public String getAllCustomerByCity(@PathVariable String city, @PathVariable String CusName){
        return String.format("getAllCustomerByCity(String city , String name) :%s,%s ",city,CusName);
//        return "getAllCustomerByCity()";
    }


}
