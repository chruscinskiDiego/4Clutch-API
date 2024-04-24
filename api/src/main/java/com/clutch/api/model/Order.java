package com.clutch.api.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date date;

}
