package com.clutch.api.service.impl;
import com.clutch.api.model.Order;
import com.clutch.api.model.ProductOrder;
import com.clutch.api.repository.OrderRepository;
import com.clutch.api.repository.ProductOrderRepository;
import com.clutch.api.service.IProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductOrderServiceImpl extends CrudServiceImpl<ProductOrder, Long> implements IProductOrderService{


    private final ProductOrderRepository productOrderRepository;
    private final OrderRepository orderRepository;


    public List<ProductOrder> getProductOrdersByOrderId(Long orderId) {
        return productOrderRepository.findByOrderId(orderId);
    }

    public List<ProductOrder> addProductOrdersToOrder(Long orderId, List<ProductOrder> productOrders) {

        Optional<Order> orderOptional = orderRepository.findById(orderId);
        if (!orderOptional.isPresent()) {
            throw new RuntimeException("Order not found");
        }

        Order order = orderOptional.get();

        // Associa cada ProductOrder ao objeto Order
        for (ProductOrder productOrder : productOrders) {
            productOrder.setOrder(order);
        }

        // Salva as ProductOrders no banco de dados
        return productOrderRepository.saveAll(productOrders);
    }

    @Autowired
    public ProductOrderServiceImpl(ProductOrderRepository productOrderRepository, OrderRepository orderRepository) {
        this.productOrderRepository = productOrderRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    protected JpaRepository<ProductOrder, Long> getRepository() {
        return productOrderRepository;
    }


    @Override
    protected void updateEntityFields(ProductOrder existingEntity, ProductOrder newEntity) {

    }

    @Override
    public long count() {
        return 0;
    }
}
