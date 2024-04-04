package lk.ijse.gdse66.spring.repositories;

import lk.ijse.gdse66.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

public interface CustomerRepo extends JpaRepository<Customer,String> {

    List<Customer> findCustomersByName(String name);

    Customer searchByNameAndAddress(String name ,String address);

    int countCustomersByAddressStartsWith(String letters);

    @Query(value = "select * from customer",nativeQuery = true)
    List<Customer> getAllCustomersWithSql();

//    @Query(value = "select c from Customer c")
//    List<Customer> getAllCustomersWithJPQL();
//
//    @Query(value = "from Customer c")
//    List<Customer> getAllCustomersWithHQL();

    @Query(value = "select * from  customers where name=?1 and address=?2",nativeQuery = true)
    List<Customer> getAllCustomersByNameAndAddress(String name, String address);

    @Query(value = "select * from  customer where name=:name and address=:address",nativeQuery = true)
    List<Customer> getAllCustomersByNameAndAddress2(@Param("name") String name,
                                                    @Param("address") String address);

}

