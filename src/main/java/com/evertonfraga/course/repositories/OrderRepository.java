package com.evertonfraga.course.repositories;

import com.evertonfraga.course.entities.Order;
import com.evertonfraga.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}