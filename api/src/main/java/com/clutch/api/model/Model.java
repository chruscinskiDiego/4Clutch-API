package com.clutch.api.model;
import com.clutch.api.annotation.UniqueModelName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.Objects;

@Entity
@Table(name = "tb_model")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueModelName
    @NotNull(message = "{com.clutch.api.model.name.NotNull}")
    @Size(min = 4, max = 100, message = "{com.clutch.api.model.name.Size}")
    @Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "{com.clutch.api.model.name.Pattern}")
    @Column(length = 100, nullable = false)
    private String name;

    public Model(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(id, model.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}