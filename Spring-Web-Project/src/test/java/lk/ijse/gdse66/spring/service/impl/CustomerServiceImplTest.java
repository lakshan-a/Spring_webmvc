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

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
//@SpringJUnitConfig
class CustomerServiceImplTest {
  
    @Autowired
    CustomerService customerService;

    @Test  //test case ekak
    void getAllCustomers() {
    }

    @Test  //test case ekak
    void getCustomerDetails() {
    }

    @Test
    void saveCustomer() {
        CustomerDto customerDto = new CustomerDto("C001", "navishka", "Galle", "Profilel");
        CustomerDto customer = customerService.saveCustomer(customerDto);

        assertNotEquals(null,customer);

        
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void deleteCustomer() {
    }
}