package com.ghartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghartur.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
