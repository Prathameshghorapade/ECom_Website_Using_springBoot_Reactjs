package com.ecomwebsite.Repository;

import com.ecomwebsite.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
