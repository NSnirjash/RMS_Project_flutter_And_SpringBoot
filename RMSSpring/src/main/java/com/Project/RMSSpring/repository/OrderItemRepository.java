package com.Project.RMSSpring.repository;

import com.Project.RMSSpring.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
