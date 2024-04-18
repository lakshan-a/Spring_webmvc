package lk.ijse.gdse66.springbootwithjwt.service.impl;

import lk.ijse.gdse66.springbootwithjwt.dto.UserDTO;
import lk.ijse.gdse66.springbootwithjwt.entity.UserEntity;
import lk.ijse.gdse66.springbootwithjwt.repository.UserRepo;
import lk.ijse.gdse66.springbootwithjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/18/2024
 */

@Service
//@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper mapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper mapper) {
        this.userRepo = userRepo;
        this.mapper = mapper;
    }

    @Override
    public UserDetailsService userDetailService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                /*Optional<UserEntity> userOptional = userRepo.findByEmail(username);
                 UserEntity user = userOptional.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
                 return user;*/
                return  userRepo.findByEmail(username).orElseThrow(() -> new
                        UsernameNotFoundException("User Not Found"));
            }
        };
    }

    @Override
    public void Save(UserDTO userDTO) {
        userRepo.save(mapper.map(userDTO, UserEntity.class));
    }
}
