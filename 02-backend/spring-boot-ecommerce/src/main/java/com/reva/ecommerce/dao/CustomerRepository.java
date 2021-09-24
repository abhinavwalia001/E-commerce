package com.reva.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reva.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
