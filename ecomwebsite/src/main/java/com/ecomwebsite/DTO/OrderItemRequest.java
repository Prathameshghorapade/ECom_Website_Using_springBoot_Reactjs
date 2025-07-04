package com.ecomwebsite.DTO;

import lombok.Data;

@Data
public class OrderItemRequest {

    private int productId;
    private int quantity;
}
