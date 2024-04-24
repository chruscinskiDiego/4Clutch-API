package com.clutch.api.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import java.math.BigDecimal;

@ToString
@Entity
@Getter
@Setter
@Table(name = "tb_product_order")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{com.clutch.api.productorder.price.NotNull}")
    @PositiveOrZero(message = "{com.clutch.api.productorder.price.PositiveOrZero}")
    private BigDecimal price;

    @NotNull(message = "{com.clutch.api.productorder.quantity.NotNull}")
    @PositiveOrZero(message = "{com.clutch.api.productorder.quantity.PositiveOrZero}")
    private int quantity;

    @NotNull(message = "{com.clutch.api.productorder.product.NotNull}")
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @NotNull(message = "{com.clutch.api.productorder.order.NotNull}")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Long getProductId() {
        return product != null ? product.getId() : null;
    }
}
