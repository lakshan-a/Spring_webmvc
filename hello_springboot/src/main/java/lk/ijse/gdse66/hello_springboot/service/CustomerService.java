package lk.ijse.gdse66.hello_springboot.service;

import lk.ijse.gdse66.hello_springboot.dto.CustomerDTO;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

public interface CustomerService {

    List<CustomerDTO> getAllCustomer();
    CustomerDTO getCustomerDetails(String id);
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void updatedCustomer(String id, CustomerDTO customerDTO);
    void deleteCustomer(String id);
}
