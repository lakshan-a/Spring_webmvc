package lk.ijse.gdse66.hello_springboot.controller;

import jdk.jfr.Registered;
import lk.ijse.gdse66.hello_springboot.dto.CustomerDTO;
import lk.ijse.gdse66.hello_springboot.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {


    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<CustomerDTO> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    CustomerDTO saveCustomer(CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO)
    }

}
