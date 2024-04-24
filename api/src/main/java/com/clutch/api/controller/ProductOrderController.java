package com.clutch.api.controller;
import com.clutch.api.model.ProductOrder;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IProductOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product-orders")
public class ProductOrderController extends CrudController<ProductOrder, Long> {

    private final IProductOrderService productOrderService;

    public ProductOrderController(IProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }

    @Override
    protected ICrudService<ProductOrder, Long> getService() {
        return productOrderService;
    }
}
