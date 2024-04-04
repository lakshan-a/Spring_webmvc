package lk.ijse.gdse66.spring.repositories;

import lk.ijse.gdse66.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */
public interface ItemRepo extends JpaRepository<Item,String> {
}
