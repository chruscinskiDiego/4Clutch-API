package com.clutch.api.model;
import com.clutch.api.annotation.UniqueExteriorName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.Objects;

@Entity
@Table(name = "tb_exterior")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Exterior {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueExteriorName
    @NotNull(message = "{com.clutch.api.exterior.name.NotNull}")
    @Size(min = 4, max = 100, message = "{com.clutch.api.exterior.name.Size}")
    @Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "{com.clutch.api.exterior.name.Pattern}")
    @Column(length = 100, nullable = false)
    private String name;

    public Exterior(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exterior exterior = (Exterior) o;
        return Objects.equals(id, exterior.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}