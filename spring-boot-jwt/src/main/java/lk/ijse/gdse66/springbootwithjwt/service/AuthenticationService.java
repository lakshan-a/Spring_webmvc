package lk.ijse.gdse66.springbootwithjwt.service;

import lk.ijse.gdse66.springbootwithjwt.auth.request.SingInRequest;
import lk.ijse.gdse66.springbootwithjwt.auth.request.SingUpRequest;
import lk.ijse.gdse66.springbootwithjwt.auth.response.JwtAuthResponse;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */
public interface AuthenticationService {
    JwtAuthResponse singIn(SingInRequest singInRequest);
    JwtAuthResponse singUp(SingUpRequest singUpRequest);
}
