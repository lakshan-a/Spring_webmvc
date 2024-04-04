package lk.ijse.gdse66.spring.api;

import jakarta.validation.Valid;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomer(@Valid @RequestPart("id") String id,
                             @RequestPart("name") String name,
                             @RequestPart("address") String address,
                             @RequestPart("profilePic") String profilePic) {
        String base64Profilepic = Base64.getEncoder().encodeToString(profilePic.getBytes());
        CustomerDto customer = new CustomerDto(id, name, address, base64Profilepic);
        customerService.saveCustomer(customer);
    }
//    public void saveCustomer(@Valid @RequestBody CustomerDto customer){
//        customerService.saveCustomer(customer);
//    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") String id){
        customerService.deleteCustomer(id);
    }

    @PatchMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") String id,
                              @Valid @RequestBody CustomerDto customer){
        customer.setId(id);
        customerService.updateCustomer(customer);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto GetCustomerDetails(@PathVariable("id") String id){
        return customerService.getCustomerDetails(id);
    }
}
