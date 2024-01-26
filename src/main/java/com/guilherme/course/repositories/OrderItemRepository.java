package com.guilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.course.entities.OrderItem;
import com.guilherme.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {}
