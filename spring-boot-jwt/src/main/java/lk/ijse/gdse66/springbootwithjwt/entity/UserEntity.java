package lk.ijse.gdse66.springbootwithjwt.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.springbootwithjwt.util.Role;
import lombok.AllArgsConstructor;
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
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
