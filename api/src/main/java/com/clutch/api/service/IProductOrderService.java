package com.clutch.api.service;
import com.clutch.api.model.ProductOrder;

import java.util.List;

public interface IProductOrderService extends ICrudService<ProductOrder, Long> {
    public List<ProductOrder> getProductOrdersByOrderId(Long orderId);
    public List<ProductOrder> addProductOrdersToOrder(Long orderId, List<ProductOrder> productOrders);
}
