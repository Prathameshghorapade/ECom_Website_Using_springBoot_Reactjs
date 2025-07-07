package com.ecomwebsite.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    private Double totalPrice;

    @OneToMany( mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem>orderItemList;

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
}
