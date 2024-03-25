package lk.ijse.gdse66.spring.service.util;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

@Component
public class Transformer {

    @Autowired
    ModelMapper mapper;

    public CustomerDto fromCustomerEntity(Customer customer){
        CustomerDto customerDto = mapper.map(customer, CustomerDto.class);
        return customerDto;
    }
}
