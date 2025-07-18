package com.ecomwebsite.DTO;


import com.ecomwebsite.Enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {

    private int orderItemId;

    private int quantity;

    private double price;

    private OrderStatus status;


    private UserDto user;


    private ProductDto product;


    private OrderDto order;



    private LocalDateTime createdAt ;

}
