package com.clutch.api.model;
import jakarta.persistence.*;
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

    private BigDecimal price;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @Setter
    @JoinColumn(name = "order_id")
    private Order order;
}
