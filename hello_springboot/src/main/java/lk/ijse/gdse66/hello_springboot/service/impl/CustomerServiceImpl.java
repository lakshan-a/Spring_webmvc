package lk.ijse.gdse66.hello_springboot.service.impl;

import lk.ijse.gdse66.hello_springboot.dto.CustomerDTO;
import lk.ijse.gdse66.hello_springboot.entity.CustomerEntity;
import lk.ijse.gdse66.hello_springboot.repository.CustomerRepo;
import lk.ijse.gdse66.hello_springboot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepo customerRepo;
    ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper modelMapper) {
        this.customerRepo = customerRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
       return customerRepo.findAll().stream().map(customer -> modelMapper.map(customer ,CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setId(UUID.randomUUID().toString());
        return modelMapper.map(customerRepo.save(modelMapper.map(customerDTO, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void updatedCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
