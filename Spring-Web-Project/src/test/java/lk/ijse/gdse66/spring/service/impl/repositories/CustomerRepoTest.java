package lk.ijse.gdse66.spring.service.impl.repositories;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test
    void saveCustomer(){
        Customer customer = new Customer("C001", "Navishka", "Galle", "Photo");
        Customer saveCustomer = customerRepo.save(customer);

        assertNotNull(saveCustomer);
    }

}