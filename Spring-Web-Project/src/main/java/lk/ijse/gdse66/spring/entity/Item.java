package lk.ijse.gdse66.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    private String ItemCode;
    private String ItemName;
    private double ItemPrice;
    private int ItemQty;
}
