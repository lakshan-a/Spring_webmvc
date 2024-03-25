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

    @Override
    public List<CustomerDto> getAllCustomer() {
        return null;
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
