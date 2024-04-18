package lk.ijse.gdse66.springbootwithjwt.service;

import lk.ijse.gdse66.springbootwithjwt.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */
public interface UserService {

    UserDetailsService userDetailService();
    void Save (UserDTO userDTO);
}
