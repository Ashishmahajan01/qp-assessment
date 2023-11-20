package com.springBootImageApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootImageApplication.beans.Product;

public interface ProductAdmRepository extends JpaRepository<Product, Long> {
}
