package lk.ijse.gdse66.hello_springboot.repository;

import lk.ijse.gdse66.hello_springboot.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {
}
