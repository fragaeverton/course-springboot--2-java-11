package com.evertonfraga.course.repositories;

import com.evertonfraga.course.entities.OrderItem;
import com.evertonfraga.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}