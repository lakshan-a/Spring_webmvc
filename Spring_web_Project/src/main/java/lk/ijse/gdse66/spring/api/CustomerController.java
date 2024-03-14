package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/14/2024
 */

@CrossOrigin(origins = "*")
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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCustomer(@RequestBody CustomerDTO customer){
        System.out.println(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id){
        System.out.println(id);
    }

}
