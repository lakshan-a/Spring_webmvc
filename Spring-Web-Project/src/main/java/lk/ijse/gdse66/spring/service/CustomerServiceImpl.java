package lk.ijse.gdse66.spring.service;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    ArrayList<CustomerDto> customerList = new ArrayList<>();



    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customerList=customerRepo.findAll();
        return customerList;
    }

    @Override
    public CustomerDto getCustomerDetail(String id) {
        for (CustomerDto customer : customerList){
            if (customer.getId().equals(id))
                return customer;
        }
        return null;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        Customer customer =new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress());
        customerRepo.save(customer);
    }

    @Override
    public boolean updateCustomer(CustomerDto customerDto) {
        for (CustomerDto customer : customerList) {
            if (customer.getId().equals(customerDto.getId())){
                customer.setName(customerDto.getName());
                customer.setAddress(customerDto.getAddress());
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteCustomer(String id) {
        for (CustomerDto customer : customerList){
            if (customer.getId().equals(id))
                customerList.remove(customer);
        }

    }
}
