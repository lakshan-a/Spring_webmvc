package lk.ijse.gdse66.springbootwithjwt.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.gdse66.springbootwithjwt.service.JwtService;
import lk.ijse.gdse66.springbootwithjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */

@Configuration
@RequiredArgsConstructor
public class JwdConfigurationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authenticationHeader = request.getHeader("AuthenticationHeader");
        if (authenticationHeader != null && authenticationHeader.startsWith("Bearer")){
            String jwt = authenticationHeader.substring(7);
            String extractedUserName = jwtService.extractUserName(jwt);
            if (extractedUserName != null && SecurityContextHolder.getContext().getAuthentication()==null){
                UserDetails userDetails = userService.userDetailService.loadUserByName(extractedUserName);
                if (jwtService.isTokenValid(jwt.userDetails)){
                    UserNamePasswordAuthenticationToken authenticationToken = new UserNamePasswordAuthenticationToken(userDetails,null,userDetails,getAuthorities());
                    authenticationToken.setDetails(new )
                }
            }
        }
    }
}
