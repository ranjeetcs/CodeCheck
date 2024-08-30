package com.example.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrderService.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
