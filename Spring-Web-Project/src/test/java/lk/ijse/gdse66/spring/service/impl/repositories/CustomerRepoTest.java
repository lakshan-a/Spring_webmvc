package lk.ijse.gdse66.spring.service.impl.repositories;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

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

    void addAllCustomers(){
        Customer customer1 = new Customer("C001", "Kasun Sampath", "Galle", "ProfilePic1");
        Customer customer2 = new Customer("C002", "Saman Kumara", "Matara", "ProfilePic2");
        Customer customer3 = new Customer("C003", "Amal Perera", "Panadura", "ProfilePic3");

        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
    }

    @Test
    void saveCustomer(){
        Customer customer = new Customer("C001", "lakshan", "Galle", "ProfilePic");
        Customer saveCustomer = customerRepo.save(customer);

        assertNotNull(saveCustomer);
    }

    @Test
    void getCustomerByName(){
        addAllCustomers();
        List<Customer> customerList = customerRepo.findCustomersByName("lakshan");
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }

    @Test
    void getCustomersByAddress(){
        addAllCustomers();
        List<Customer> customerList =customerRepo.searchByNameAndAddress("lakshan","matara");
        for ()
    }

}