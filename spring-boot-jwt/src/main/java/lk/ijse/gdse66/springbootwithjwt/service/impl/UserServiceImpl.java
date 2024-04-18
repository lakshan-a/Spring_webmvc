package lk.ijse.gdse66.springbootwithjwt.service.impl;

import lk.ijse.gdse66.springbootwithjwt.dto.UserDTO;
import lk.ijse.gdse66.springbootwithjwt.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDetailsService userDetailService() {
        return null;
    }

    @Override
    public void Save(UserDTO userDTO) {

    }
}
