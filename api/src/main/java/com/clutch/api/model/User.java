package com.clutch.api.model;
import com.clutch.api.annotation.UniqueUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "tb_user")
@ToString
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueUsername
    @NotNull(message = "{com.clutch.api.user.username.NotNull}")
    @Size(min = 6, max = 100, message = "{com.clutch.api.user.username.Size}")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "{com.clutch.api.user.username.Pattern}")
    @Column(length = 100, nullable = false)
    private String username;

    @NotNull(message = "{com.clutch.api.user.password.NotNull}")
    @Size(min = 6, max = 100, message = "{com.clutch.api.user.password.Size}")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{com.clutch.api.user.password.Pattern}")
    @Column(length = 100, nullable = false)
    private String password;

    @NotNull(message = "{com.clutch.api.user.email.NotNull}")
    @Size(min = 6, max = 100, message = "{com.clutch.api.user.email.Size}")
    @Pattern(regexp = ".*@.*", message = "{com.clutch.api.user.email.Patern}")
    @Column(length = 100, nullable = false)
    private String email;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
