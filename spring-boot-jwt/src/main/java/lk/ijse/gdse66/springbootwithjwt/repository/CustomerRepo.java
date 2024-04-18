package lk.ijse.gdse66.springbootwithjwt.repository;

import lk.ijse.gdse66.springbootwithjwt.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {
}
