package com.micro.orderservice.oderdto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {

	String orderId;
	String name;
	String email;
	String contact;
	double amount;
}
