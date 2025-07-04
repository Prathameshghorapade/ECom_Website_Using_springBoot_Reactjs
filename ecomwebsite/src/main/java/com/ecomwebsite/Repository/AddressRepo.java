package com.ecomwebsite.Repository;

import com.ecomwebsite.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
