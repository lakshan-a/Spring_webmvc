package lk.ijse.gdse66.hello_springboot.service.impl;

import lk.ijse.gdse66.hello_springboot.dto.CustomerDTO;
import lk.ijse.gdse66.hello_springboot.service.CustomerService;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDTO> getAllCustomer() {
        return null;
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void updatedCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
