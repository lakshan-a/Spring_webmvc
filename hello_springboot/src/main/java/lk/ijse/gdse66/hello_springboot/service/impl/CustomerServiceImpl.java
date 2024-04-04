package lk.ijse.gdse66.hello_springboot.service.impl;

import lk.ijse.gdse66.hello_springboot.dto.CustomerDTO;
import lk.ijse.gdse66.hello_springboot.entity.CustomerEntity;
import lk.ijse.gdse66.hello_springboot.repository.CustomerRepo;
import lk.ijse.gdse66.hello_springboot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CustomerDTO> getAllCustomer() {
        customerRepo.findAll().stream().map(customerEntity -> modelMapper.map(customerRepo.))
        return null;
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return modelMapper.map(customerRepo.save(modelMapper.map(customerDTO, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void updatedCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
