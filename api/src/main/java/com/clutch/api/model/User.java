package com.clutch.api.model;
import com.clutch.api.annotation.UniqueUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "tb_user")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueUsername
    @Size(min = 2, max = 100)
    @Column(length = 100, nullable = false)
    private String username;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    @Size(min = 2, max = 100)
    @Column(length = 100, nullable = false)
    private String password;

    @Size(min = 2, max = 100)
    @Column(length = 100, nullable = false)
    private String email;

}
