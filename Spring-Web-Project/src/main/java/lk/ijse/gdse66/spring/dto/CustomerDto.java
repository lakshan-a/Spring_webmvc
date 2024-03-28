package lk.ijse.gdse66.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable {
    @Null(message = "id is auto generated")
    private String id;
    @NotBlank(message = "name can not be null")
    @Pattern(regexp = "[A-Za-z]+", message = "name not valid")
    private String name;
    @NotBlank(message = "address can not be null")
    private String address;


}
