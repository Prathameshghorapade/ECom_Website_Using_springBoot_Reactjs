package com.ecomwebsite.Repository;

import com.ecomwebsite.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
