package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import lk.ijse.gdse66.spring.service.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

@Service
@Transactional
public class CustomerServiceImpl implements lk.ijse.gdse66.spring.service.CustomerService {

    @Autowired
    CustomerRepo repo;

    ArrayList<CustomerDto> customerList = new ArrayList<>();


    @Autowired
    Transformer transformer;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return repo.findAll().stream()
                .map(customer -> transformer.fromCustomerEntity(customer)).toList();
    }

    @Override
    public CustomerDto getCustomerDetails(String id) {
        return transformer.fromCustomerEntity(repo.findById(id).get());
    }

    @Override
    public void saveCustomer(CustomerDto customerDTO) {
        repo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void updateCustomer(CustomerDto customerDTO) {
        repo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(String id) {
        repo.deleteById(id);
    }
}
