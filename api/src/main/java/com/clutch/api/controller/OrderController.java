package com.clutch.api.controller;
import com.clutch.api.model.Order;
import com.clutch.api.model.ProductOrder;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IOrderService;
import com.clutch.api.service.IProductOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends CrudController<Order, Long>{

    private final IOrderService orderService;
    private final IProductOrderService productOrderService;

    //GET das "Product Orders" para a "Order" indicada
    @GetMapping("/{orderId}/product-orders")
    public ResponseEntity<List<ProductOrder>> getProductOrdersByOrderId(@PathVariable Long orderId) {
        List<ProductOrder> productOrders = productOrderService.getProductOrdersByOrderId(orderId);
        if (productOrders.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productOrders, HttpStatus.OK);
    }

    @PostMapping("/{orderId}/product-orders")
    public ResponseEntity<List<ProductOrder>> addProductOrdersToOrder(@PathVariable Long orderId,
                                                                      @RequestBody List<ProductOrder> productOrders) {
        List<ProductOrder> addedProductOrders = productOrderService.addProductOrdersToOrder(orderId, productOrders);
        return new ResponseEntity<>(addedProductOrders, HttpStatus.CREATED);
    }


    public OrderController(IOrderService orderService, IProductOrderService productOrderService) {
        this.orderService = orderService;
        this.productOrderService = productOrderService;
    }

    @Override
    protected ICrudService<Order, Long> getService() {
        return orderService;
    }
}
