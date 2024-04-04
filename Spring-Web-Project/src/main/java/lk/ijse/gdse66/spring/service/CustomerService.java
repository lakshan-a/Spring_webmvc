package lk.ijse.gdse66.spring.service;

import lk.ijse.gdse66.spring.dto.CustomerDto;

import java.util.List;


public interface  CustomerService {
    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerDetails(String id);

    CustomerDto saveCustomer(CustomerDto customerDTO);

    void updateCustomer(CustomerDto customerDTO);

    void deleteCustomer(String id);
}
