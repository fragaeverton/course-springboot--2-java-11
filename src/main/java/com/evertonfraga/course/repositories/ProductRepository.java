package com.evertonfraga.course.repositories;

import com.evertonfraga.course.entities.Category;
import com.evertonfraga.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}