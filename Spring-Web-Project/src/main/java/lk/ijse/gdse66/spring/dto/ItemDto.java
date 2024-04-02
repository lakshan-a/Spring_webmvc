package lk.ijse.gdse66.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {

    private String ItemCode;
    private String ItemName;
    private double ItemPrice;
    private int ItemQty;

}
