package com.clutch.api.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;

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
