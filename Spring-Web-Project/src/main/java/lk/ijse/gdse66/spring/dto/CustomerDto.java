package lk.ijse.gdse66.spring.dto;

import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable {
    @Null(message = "Id Is Auto Generated")
    private String id;
    private String name;
    private String address;


}
