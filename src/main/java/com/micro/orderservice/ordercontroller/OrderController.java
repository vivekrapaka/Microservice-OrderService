package com.micro.orderservice.ordercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.orderservice.OrderserviceApplication;
import com.micro.orderservice.oderdto.OrderDetails;
import com.micro.orderservice.service.OderService;

@RestController("/order")
public class OrderController {
	
	@Autowired
	OderService orderService;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderDetails order) {

		return orderService.createOrder(order);
	}
}
