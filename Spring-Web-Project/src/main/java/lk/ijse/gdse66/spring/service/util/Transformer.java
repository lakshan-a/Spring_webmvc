package lk.ijse.gdse66.spring.service.util;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.dto.ItemDto;
import lk.ijse.gdse66.spring.entity.Customer;
import lk.ijse.gdse66.spring.entity.Item;
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

    public Transformer(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public CustomerDto fromCustomerEntity(Customer customer){
        CustomerDto customerDTO = mapper.map(customer, CustomerDto.class);
        return customerDTO;
    }

    public Customer toCustomerEntity(CustomerDto customerDTO){
        Customer customer = mapper.map(customerDTO, Customer.class);
        return customer;
    }

    public ItemDto fromItemEntity(Item item){
        ItemDto itemDto = mapper.map(item, ItemDto.class);
        return itemDto;
    }

    public Item toItemEntity(ItemDto itemDto){
        Item item = mapper.map(itemDto, Item.class);
        return item;
    }
}
