package com.example.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderService.common.Payment;
import com.example.OrderService.common.TransactionRequest;
import com.example.OrderService.common.TransactionResponse;
import com.example.OrderService.entity.Order;
import com.example.OrderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(path = "/saveorder", method = RequestMethod.POST)
	public TransactionResponse saveOrder(@RequestBody TransactionRequest request) {
		
		return orderService.saveOrder(request);
	}

}
