package com.example.OrderService.common;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	private int paymentId;
	private String paymentstatus;
	private String transactionId;
	private int orderId;
	private double amount;
	
	
	
	
	public Payment() {
		super();
	}
	
	
	

	public Payment(int paymentId, String paymentstatus, String transactionId, int orderId, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentstatus = paymentstatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.amount = amount;
	}




	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}




	public int getOrderId() {
		return orderId;
	}




	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}




	public int getPaymentId() {
		return paymentId;
	}




	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	
	
	
	

}
