package lk.ijse.gdse66.springbootwithjwt.auth.request;

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
public class SingInRequest {
    private String email;
    private String password;
}
