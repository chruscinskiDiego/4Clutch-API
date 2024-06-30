package com.clutch.api.model;
import com.clutch.api.annotation.UniqueProduct;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "tb_product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @UniqueProduct
    @NotNull(message = "{com.clutch.api.product.name.NotNull}")
    @Size(min = 4, max = 100, message = "{com.clutch.api.product.name.Size}")
    @Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "{com.clutch.api.product.name.Pattern}")
    @Column(length = 100, nullable = false)
    private String name;

    @NotNull(message = "{com.clutch.api.product.description.NotNull}")
    @Size(min = 10, message = "{com.clutch.api.product.description.Size}")
    private String description;

    @NotNull(message = "{com.clutch.api.product.imageUrl.NotNull}")
    private String imageUrl;

    @NotNull(message = "{com.clutch.api.product.price.NotNull}")
    @PositiveOrZero(message = "{com.clutch.api.product.price.PositiveOrZero}")
    private float price;

    @NotNull(message = "{com.clutch.api.product.category.NotNull}")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category categoryId;

    @NotNull(message = "{com.clutch.api.product.model.NotNull}")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model modelId;

    @NotNull(message = "{com.clutch.api.product.quantity.NotNull}")
    @PositiveOrZero(message = "{com.clutch.api.product.quantity.PositiveOrZero}")
    private int quantity;

    // Additional CS2 specific attributes
    //private Rarity rarity;
    //private Exterior exterior;

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
