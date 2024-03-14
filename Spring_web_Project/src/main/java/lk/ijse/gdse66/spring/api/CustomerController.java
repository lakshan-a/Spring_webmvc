package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/14/2024
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> GetAllCustomer(){
        ArrayList<CustomerDTO>customerList =new ArrayList<>();
        customerList.add(new CustomerDTO("C001","lakshan","matara"));
        customerList.add(new CustomerDTO("C002","Rashmika","galle"));
        customerList.add(new CustomerDTO("C003","lahiru","matara"));
        return customerList;
    }

}
