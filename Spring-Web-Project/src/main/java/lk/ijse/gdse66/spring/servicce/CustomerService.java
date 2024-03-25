package lk.ijse.gdse66.spring.servicce;

import lk.ijse.gdse66.spring.dto.CustomerDto;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */
public interface CustomerService {
    List<CustomerDto> getAllCustomer();

    CustomerDto getCustomerDetail (String id);

    void saveCustomer (CustomerDto customerDto);

    boolean updateCustomer (CustomerDto customerDto);

    void deleteCustomer (String id);
}
