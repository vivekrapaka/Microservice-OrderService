package com.micro.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.orderservice.oderdto.OrderDetails;
import com.micro.orderservice.orderentity.OrderDetailsData;
import com.micro.orderservice.orderrepo.OrderRepo;

@Service
public class OderService {
	
	@Autowired
	OrderRepo orderrepo; 

	public String createOrder(OrderDetails order) {
		OrderDetailsData orderdata = OrderDetailsData.builder()
				.name(order.getName())
				.email(order.getEmail())
				.amount(order.getAmount())
				.orderId(order.getOrderId())
				.contact(order.getContact())
				.build();
		
		System.out.println("printing order data "+ orderdata);
		orderrepo.save(orderdata);
		
		return "Order Created Succesfully";
		
	}

}
