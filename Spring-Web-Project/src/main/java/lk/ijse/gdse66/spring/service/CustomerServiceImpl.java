package lk.ijse.gdse66.spring.service;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import lk.ijse.gdse66.spring.service.util.Transformer;
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

    @Autowired
    Transformer transformer;


    @Override
    public List<CustomerDto> getAllCustomer() {
        List<CustomerDto> list = new ArrayList<>();
        List<Customer> customerList1=customerRepo.findAll();
        for (Customer customer:customerList1){
            list.add(new CustomerDto(
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress()
            ));
        }
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
        Customer customer = transformer.toCustomerEntity(customerDto);
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
