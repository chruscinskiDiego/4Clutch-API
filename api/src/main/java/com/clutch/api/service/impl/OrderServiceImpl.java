package com.clutch.api.service.impl;
import com.clutch.api.model.Order;
import com.clutch.api.model.ProductOrder;
import com.clutch.api.repository.OrderRepository;
import com.clutch.api.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends CrudServiceImpl<Order, Long> implements IOrderService {

    @Autowired
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
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
