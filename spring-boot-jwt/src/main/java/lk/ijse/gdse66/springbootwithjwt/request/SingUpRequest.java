package lk.ijse.gdse66.springbootwithjwt.request;

import lk.ijse.gdse66.springbootwithjwt.util.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SingUpRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
