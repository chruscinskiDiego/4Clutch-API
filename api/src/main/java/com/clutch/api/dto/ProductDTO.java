package com.clutch.api.dto;
import com.clutch.api.model.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.math.BigDecimal;

@Data
public class ProductDTO {

        private int id;

        @NotNull
        @Size(min = 2, max = 100)
        @Column(length = 100, nullable = false)
        private String name;

        @NotNull
        @Size(min = 10)
        private String description;

        @NotNull
        private String imageUrl;

        private BigDecimal price;

        private Category category;

        private int quantity;

}

