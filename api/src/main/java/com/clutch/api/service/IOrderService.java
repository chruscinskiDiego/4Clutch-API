package com.clutch.api.service;
import com.clutch.api.model.Order;

import java.util.List;

public interface IOrderService extends ICrudService<Order, Long>{
    public List<Order> findByUserId(Long userId);

}
