package lk.ijse.gdse66.springbootwithjwt.service;

import org.springframework.security.core.userdetails.UserDetails;


/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */
public interface JwdService {

    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}
