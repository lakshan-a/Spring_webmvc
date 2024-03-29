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

    @Null(message = "Id Is Auto Generated")
    private String id;
    @NotBlank(message = "Name Cannot Been Null")
//    @Pattern(regexp = "[A-Za-z]+$", message = "Name IS Not Validated")
    private String name;
    @NotBlank(message = "Address Cannot Been Null")
    private String address;
    private String ProfilePic;


}
