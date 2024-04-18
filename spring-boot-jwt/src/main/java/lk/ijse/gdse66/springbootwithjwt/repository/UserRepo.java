package lk.ijse.gdse66.springbootwithjwt.repository;

import lk.ijse.gdse66.springbootwithjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */
public interface UserRepo extends JpaRepository<UserEntity,String> {

    Optional<UserEntity> findByEmail(String email);
}
