package com.clutch.api.repository;

import com.clutch.api.model.Order;
import com.clutch.api.model.Product;
import com.clutch.api.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    List<ProductOrder> findByOrderId(Long orderId);
}
