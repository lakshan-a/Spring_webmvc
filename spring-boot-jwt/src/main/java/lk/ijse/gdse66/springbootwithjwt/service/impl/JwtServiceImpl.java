package lk.ijse.gdse66.springbootwithjwt.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.ijse.gdse66.springbootwithjwt.service.JwtService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */


@Service
public class JwtServiceImpl implements JwtService {

    @Value("${token.key}")
    String jwdKey;

    @Override
    public String extractUserName(String token) {
        return extractClaims(token,claims -> claims.getSubject());
    }


    @Override
    public String generateToken(UserDetails userDetails) {
        HashMap<String,Object> claims =new HashMap<>();
        claims.put("role",userDetails.getAuthorities());
        Date currentDate = new Date();
        Date expiredDate = new Date (currentDate.getTime()+ 1000 * 600);
        String accessToken = Jwts.builder().setClaims(claims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(currentDate)
                .setExpiration(expiredDate)
                .signWith(getSingKey())
//                .signWith(getSingKey(),SignatureAlgorithm.HS256)
                .compact();
        return accessToken;
    }

    @Override
    public boolean isTokenValid(String token, UserDetails userDetails) {
        String subject = extractClaims(token,claims -> claims.getSubject());
        return subject.equals(userDetails.getUsername()) && !isExpired(token);
    }

    private Key getSingKey(){
        byte[] bytes = Decoders.BASE64.decode(jwdKey);
        return Keys.hmacShaKeyFor(bytes);
    }

    private Claims getAllClaims(String token){
        Claims body = Jwts.parser().setSigningKey(getSingKey()).build().parseClaimsJws(token).getBody();
        return body;
    }

    private <T> T extractClaims(String token, Function<Claims,T> claimsResolve){
       Claims claims = getAllClaims(token);
       return claimsResolve.apply(claims);
    }

    private boolean isExpired(String token){
        Date expiredDate = extractClaims(token,claims -> claims.getExpiration());
        return expiredDate.before(new Date());
    }
}
