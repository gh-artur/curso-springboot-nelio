package com.ghartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghartur.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
