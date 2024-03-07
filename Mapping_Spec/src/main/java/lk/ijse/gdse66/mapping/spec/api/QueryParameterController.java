package lk.ijse.gdse66.mapping.spec.api;

import lk.ijse.gdse66.mapping.spec.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/query")
public class QueryParameterController {

    /*@PostMapping
    public String SaveCustomer(String id, String name, int age){
        return  String.format("SaveCustomer(String id, String name, int age) :%s,%s,%s" ,id,name,age);
    }*/

    @PostMapping
    public String SaveCustomer(@ModelAttribute CustomerDTO customer){
        return customer.toString();
    }

    public String SaveSupplier(String id,String name, int age){
        return  String.format("SaveCustomer(String id, String name, int age) :%s,%s,%s" ,id,name,age);
    }

}
