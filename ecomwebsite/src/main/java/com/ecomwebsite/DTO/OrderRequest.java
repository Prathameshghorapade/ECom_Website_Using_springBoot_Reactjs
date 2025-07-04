package com.ecomwebsite.DTO;

import com.ecomwebsite.Entity.Payment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {

    private double totalPrice;

    private List<OrderItemRequest> items;

    private Payment paymentInfo;






}
