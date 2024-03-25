package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ArrayList<CustomerDto> getAllCustomers(){
//
//        ArrayList<CustomerDto> customerList = new ArrayList<>();
//        customerList.add(new CustomerDto("C001","Navishka","Matara"));
//        customerList.add(new CustomerDto("C002","lakshan","Galle"));
//        customerList.add(new CustomerDto("C003","Savinda","Thangalla"));
//
//        return customerList;
//
//    }

    public List<CustomerDto>getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomer(@RequestBody CustomerDto customer){
        customerService.saveCustomer(customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") String id){
        customerService.deleteCustomer(id);

    }

    @PatchMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") String id,@RequestBody CustomerDto customer){
        customerService.updateCustomer(customer);



    }

    @GetMapping("/{id}")
    public CustomerDto getCustomerDetails(@PathVariable("id") String id){

        return customerService.getCustomerDetail(id);
    }
}
