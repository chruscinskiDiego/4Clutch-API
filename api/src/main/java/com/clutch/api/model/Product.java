package com.clutch.api.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

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

    @NotNull
    @Size(min = 2, max = 100)
    @Column(length = 100, nullable = false)
    private String name;

    @NotNull
    @Size(min = 10)
    private String description;

    @NotNull
    private String ImageUrl;

    @NotNull
    private BigDecimal price;

    @ManyToOne
    private Category categoryId;
}
