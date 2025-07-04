package com.ecomwebsite.Repository;

import com.ecomwebsite.Entity.OrederItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemRepo extends JpaRepository<OrederItem, Long>, JpaSpecificationExecutor<OrederItem> {
}
