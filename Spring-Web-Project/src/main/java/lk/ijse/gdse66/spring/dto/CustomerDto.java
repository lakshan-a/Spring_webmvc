package lk.ijse.gdse66.spring.dto;

import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "name can not be null")
    private String name;
    @NotBlank(message = "address can not be null")
    private String address;


}
