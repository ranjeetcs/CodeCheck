package com.example.OrderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.OrderService.common.Payment;
import com.example.OrderService.common.TransactionRequest;
import com.example.OrderService.common.TransactionResponse;
import com.example.OrderService.entity.Order;
import com.example.OrderService.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
		
		String res= null; 
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setAmount(order.getPrice());
		payment.setOrderId(order.getId());
		//do a rest call to payment service
		Payment paymentResponse = restTemplate.postForObject("http://localhost:8082/payment/dopayment", payment, Payment.class);
		
		
		if(paymentResponse.getPaymentstatus().equalsIgnoreCase("success")) {
			res = "Payment Success and order placed";
		}else {
			res = "payment failed, order added to cart";
		}
		
		orderRepo.save(order);
		
		TransactionResponse tr = new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),res);
		return tr;
	}

}
