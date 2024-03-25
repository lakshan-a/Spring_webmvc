package lk.ijse.gdse66.spring.servicce;

import lk.ijse.gdse66.spring.dto.CustomerDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

public class CustomerServiceImpl implements CustomerService{

    ArrayList<CustomerDto> customerList = new ArrayList<>();

    {
        customerList.add(new CustomerDto("C001","Navishka","Matara"));
        customerList.add(new CustomerDto("C002","lakshan","Galle"));
        customerList.add(new CustomerDto("C003","Savinda","Thangalla"));
    }



    @Override
    public List<CustomerDto> getAllCustomer() {
//        for (CustomerDto customerDto:customerList){
//
//            customer.add("id",customerDTO.getCusId());
//            customer.add("name",customerDTO.getCusName());
//            customer.add("address",customerDTO.getCusAddress());
//            customer.add("salary",customerDTO.getCusSalary());
//
//            allCustomers.add(customer.build());
//        }

    }

    @Override
    public CustomerDto getCustomerDetail(String id) {
        return null;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {

    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
