package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import lk.ijse.gdse66.spring.service.util.Transformer;
import lk.ijse.gdse66.spring.service.util.UtilMatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//    ArrayList<CustomerDto> customerList = new ArrayList<>();


    @Autowired
    Transformer transformer;

    @Override
    public List<CustomerDto> getAllCustomers() {
        /*List<Customer> customerList =repo.findAll();
        Stream<Customer> customerStream =customerList.stream();
        Stream<CustomerDto> customerDtoStream = customerStream.map(customer -> transformer.fromCustomerEntity(customer));
        List<CustomerDto> customerDtoList =customerDtoStream.collect(Collectors.toList());*/

        return repo.findAll().stream()
                .map(customer -> transformer.fromCustomerEntity(customer)).toList();
    }

    @Override
    public CustomerDto getCustomerDetails(String id) {
        return transformer.fromCustomerEntity(repo.findById(id).get());
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDTO) {
        customerDTO.setId(UtilMatter.generateId());
        return transformer.fromCustomerEntity(repo.save(transformer.toCustomerEntity(customerDTO)));
//        Customer customer = repo.save(transformer.toCustomerEntity(customerDTO));
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
