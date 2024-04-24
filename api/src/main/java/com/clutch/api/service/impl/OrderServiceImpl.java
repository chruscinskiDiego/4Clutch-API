package com.clutch.api.service.impl;
import com.clutch.api.model.*;
import com.clutch.api.repository.OrderRepository;
import com.clutch.api.repository.ProductOrderRepository;
import com.clutch.api.repository.ProductRepository;
import com.clutch.api.repository.UserRepository;
import com.clutch.api.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl extends CrudServiceImpl<Order, Long> implements IOrderService {

    @Autowired
    private final OrderRepository orderRepository;


    public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository, ProductOrderRepository productOrderRepository, ProductRepository productRepository, ProductOrderServiceImpl productOrderService) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }


    @Override
    protected JpaRepository<Order, Long> getRepository() {
        return orderRepository;
    }

    @Override
    protected void updateEntityFields(Order existingEntity, Order newEntity) {

    }

    @Override
    public long count() {
        return 0;
    }
}

