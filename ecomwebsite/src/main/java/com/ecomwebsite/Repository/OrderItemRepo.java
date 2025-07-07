package com.ecomwebsite.Repository;

import com.ecomwebsite.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


                                                                  //dynamic filtering support using JpaSpecificationExecutor”
public interface OrderItemRepo extends JpaRepository<OrderItem, Long>, JpaSpecificationExecutor<OrderItem> {
}
