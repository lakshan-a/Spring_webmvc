package lk.ijse.gdse66.spring.repositories;

import lk.ijse.gdse66.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */
public interface CustomerRepo extends JpaRepository<Customer,String> {
}

