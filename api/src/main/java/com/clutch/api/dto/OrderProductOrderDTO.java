package com.clutch.api.dto;
import com.clutch.api.model.ProductOrder;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class OrderProductOrderDTO {

    private Date date;
    private Integer id;
    private List<ProductOrder> products;

}
