package com.clutch.api.model;
import com.clutch.api.annotation.UniqueCategoryName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.Objects;

@Entity
@Table(name = "tb_category")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueCategoryName
    @NotNull(message = "{com.clutch.api.category.name.NotNull}")
    @Size(min = 4, max = 100, message = "{com.clutch.api.category.name.Size}")
    @Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "{com.clutch.api.category.name.Pattern}")
    @Column(length = 100, nullable = false)
    private String name;

    public Category(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}