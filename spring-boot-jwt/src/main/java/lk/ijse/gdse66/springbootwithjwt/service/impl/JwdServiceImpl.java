package lk.ijse.gdse66.springbootwithjwt.service.impl;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.ijse.gdse66.springbootwithjwt.service.JwdService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import java.security.Key;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */


@Service
public class JwdServiceImpl implements JwdService {

    @Value("${token.key}")
    String jwdKey;

    @Override
    public String extractUserName(String token) {
        return null;
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return null;
    }

    @Override
    public boolean isTokenValid(String token, UserDetails userDetails) {
        return false;
    }

    private Key getSingKey(){
        byte[] bytes = Decoders.BASE64.decode(jwdKey);
        return Keys.hmacShaKeyFor(bytes);
    }
}
