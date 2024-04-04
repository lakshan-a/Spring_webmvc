package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.service.CustomerService;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
@Transactional
//@SpringJUnitConfig
class CustomerServiceImplTest {
  
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerDto addOneCustomer(){
        CustomerDto customerDto = new CustomerDto("C001", "lakshan", "Galle", "ProfilePic");
        return customerService.saveCustomer(customerDto);

    }



    @Test  //test case ekak
    void getAllCustomers() {

        CustomerDto customer1 = new CustomerDto("C001", "Lakshan", "Matara", "Profilel");
        CustomerDto customer2 = new CustomerDto("C002","rashmika","galle","Profilel");
        CustomerDto customer3 = new CustomerDto("C003","kalshan","colombo","Profilel");

        customerService.saveCustomer(customer1);
        customerService.saveCustomer(customer2);
        customerService.saveCustomer(customer3);


//        assertNotEquals("null",customerService.getAllCustomers());

    }

    @Test  //test case ekak
    void getCustomerDetails() {
        assertThrows(NotFoundException.class, () ->customerService.getCustomerDetails("C001"));



        /*CustomerDto customerDto = customerService.saveCustomer(new CustomerDto("C001", "lakshan", "Galle", "Profilel"));
        assertDoesNotThrow(() -> customerService.getCustomerDetails(customerDto.getId()));*/

    }

    @Test
    void saveCustomer() {
        CustomerDto customerDto = new CustomerDto("C001", "lakshan", "Galle", "Profilel");
        CustomerDto customer = customerService.saveCustomer(customerDto);

        assertNotEquals(null,customer);
        assertNotEquals("C001",customer.getId());

        
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = new CustomerDto("C001", "lakshan", "Galle", "Profilel");

        assertThrows(NotFoundException.class, () ->customerService.updateCustomer(new CustomerDto("C001", "Rashmika", "Galle", "Profilel")));

    }

    @Test
    void deleteCustomer() {
        assertThrows(NotFoundException.class, () ->customerService.deleteCustomer("C001"));

    }
}