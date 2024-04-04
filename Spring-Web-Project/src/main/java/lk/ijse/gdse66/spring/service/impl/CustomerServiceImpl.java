package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.repositories.CustomerRepo;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import lk.ijse.gdse66.spring.service.util.Transformer;
import lk.ijse.gdse66.spring.service.util.UtilMatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service //component scan and create bean
@Transactional //database operation connect ekak eka unit ekak athule successful wenna one ehama nathi unoth wade wenne nh e de me annotion eka use karala pulun karagnna
public class CustomerServiceImpl implements lk.ijse.gdse66.spring.service.CustomerService {

    @Autowired
    CustomerRepo repo;

    ArrayList<CustomerDto> customerList = new ArrayList<>();


    @Autowired
    Transformer transformer;

    @Override
    public List<CustomerDto> getAllCustomers() {
//        List<Customer> customerList = repo.findAll();
//        Stream<Customer> stream = customerList.stream();
//        Stream<CustomerDto> objectStream = stream.map(customer -> transformer.fromCustomerEntity(customer));
//        List<CustomerDto> collect = objectStream.collect(Collectors.toList());
        return repo.findAll().stream() //strem eke coustomerla polimata hadanwa
                .map(customer -> transformer.fromCustomerEntity(customer)).toList();

    }

    @Override
    public CustomerDto getCustomerDetails(String id) {

        if (!repo.existsById(id)){
            throw new NotFoundException("Customer Id :" + id +"Dones not exis");
        }
        return transformer.fromCustomerEntity(repo.findById(id).get());
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDTO) {
        customerDTO.setId(UtilMatter.generateId());
        return transformer.fromCustomerEntity(repo.save(transformer.toCustomerEntity(customerDTO)));

    }

    @Override
    public void updateCustomer(CustomerDto customerDTO) {
        if (!repo.existsById(customerDTO.getId())){
            throw new NotFoundException("Update Filled Id :" + customerDTO.getId() +"Does not exist");
        }
        repo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)){
            throw new NotFoundException("Delete Filled Id :" + id +"Does not exist");
        }
        repo.deleteById(id);
    }
}
