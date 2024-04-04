package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
//@SpringJUnitConfig
public class CustomerServiceImplTest {

//    @Autowired
//    CustomerService customerService;

    @Test
    void getAllCustomers() {
    }

    @Test
    void getCustomerDetails() {
    }

    @Test
    void saveCustomer() {

    }

    @Test
    void updateCustomer() {
    }

    @Test
    void deleteCustomer() {
    }
}
