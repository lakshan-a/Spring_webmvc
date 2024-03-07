package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.*;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    /*@GetMapping
    public String getAllCustomers(){
        return "GetAllCustomer()";
    }

//    @GetMapping("/{city}")
//    public String getAllCustomerByCity(@PathVariable String city){
//        return String.format("getAllCustomerByCity(String city) :%s ",city);
////        return "getAllCustomerByCity()";
//    }

    @GetMapping("/{city}/{name}")
    public String getAllCustomerByCity(@PathVariable String city, @PathVariable("name") String CusName){
        return String.format("getAllCustomerByCity(String city , String name) :%s,%s ",city,CusName);
    }

    @GetMapping("/{id:C\\d{3}}")
    public String getCustomerById(@PathVariable String id){
        return String.format("getCustomerById(): %s",id);
    }
*/

    @PostMapping
    public String SaveCustomer(String id, String name, int age){
        return String.format("SaveCustomer(String id, String name, int age) :%s,%s,s% ",id,name,age);
    }

}
