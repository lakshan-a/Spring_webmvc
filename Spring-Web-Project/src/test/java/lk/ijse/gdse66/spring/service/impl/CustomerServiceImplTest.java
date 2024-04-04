package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.service.CustomerService;
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

    @Test  //test case ekak
    void getAllCustomers() {
    }

    @Test  //test case ekak
    void getCustomerDetails() {
//        CustomerDto customerDto = new CustomerDto("C001", "lakshan", "Galle", "Profilel");
        CustomerDto customerDto = customerService.saveCustomer(new CustomerDto("C001", "lakshan", "Galle", "Profilel"));

//        CustomerDto customerDetails = customerService.getCustomerDetails(customer.getId());

        assertDoesNotThrow(() -> customerService.getCustomerDetails(customerDto.getId()));

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

    }

    @Test
    void deleteCustomer() {
    }
}