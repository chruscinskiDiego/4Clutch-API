package com.clutch.api.repository;
import com.clutch.api.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    List<ProductOrder> findByOrderId(Long orderId);
}
