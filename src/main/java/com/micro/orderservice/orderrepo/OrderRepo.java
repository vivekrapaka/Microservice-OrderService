package com.micro.orderservice.orderrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.orderservice.orderentity.OrderDetailsData;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetailsData, Long>{

}
