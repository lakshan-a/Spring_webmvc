package lk.ijse.gdse66.spring.service.impl.service.impl;

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

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
@Transactional
//@SpringJUnitConfig
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    CustomerDto addOneCustomer(){
        CustomerDto customerDTO = new CustomerDto("C001",
                "Kasun Sampath", "Galle", "ProfilePic1");
        return customerService.saveCustomer(customerDTO);
    }

    void addAllCustomers(){
        CustomerDto customer1 = new CustomerDto("C001", "Kasun Sampath", "Galle", "ProfilePic1");
        CustomerDto customer2 = new CustomerDto("C002", "Saman Kumara", "Matara", "ProfilePic2");
        CustomerDto customer3 = new CustomerDto("C003", "Amal Perera", "Panadura", "ProfilePic3");

        customerService.saveCustomer(customer1);
        customerService.saveCustomer(customer2);
        customerService.saveCustomer(customer3);
    }

    @Test
    void getAllCustomers() {
        addAllCustomers();

        List<CustomerDto> allCustomers = customerService.getAllCustomers();
        assertEquals(3,allCustomers.size());
    }

    @Test
    void getCustomerDetails() {
        assertThrows(NotFoundException.class,
                () -> customerService.getCustomerDetails("C001"));

        CustomerDto customerDTO = addOneCustomer();

        assertDoesNotThrow(() ->
                customerService.getCustomerDetails(customerDTO.getId()));
    }

    @Test
    void saveCustomer() {
        CustomerDto customerDTO = new CustomerDto("C001",
                "Kasun Sampath", "Galle", "ProfilePic1");
        CustomerDto customer = customerService.saveCustomer(customerDTO);
        assertNotEquals(null,customer);
        assertNotEquals("C001",customer.getId());
        assertNotNull(customer);
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = addOneCustomer();


        assertThrows(NotFoundException.class,
                () -> customerService.updateCustomer(new CustomerDto(
                        "C001","Janith Lakmal","Kandy",
                        "ProfilePic1")));

        assertDoesNotThrow(() -> customerService.updateCustomer(new CustomerDto(
                customerDto.getId(),"Janith Lakmal","Kandy",
                "ProfilePic1")));
    }

    @Test
    void deleteCustomer() {
        CustomerDto customerDTO = addOneCustomer();

        assertThrows(NotFoundException.class,
                () -> customerService.deleteCustomer("C001"));
    }
}