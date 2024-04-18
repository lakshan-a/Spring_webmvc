package lk.ijse.gdse66.springbootwithjwt.dto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/4/2024
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;
}
