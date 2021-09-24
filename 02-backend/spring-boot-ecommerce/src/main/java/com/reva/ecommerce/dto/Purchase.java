package com.reva.ecommerce.dto;

import lombok.Data;

import java.util.Set;

import com.reva.ecommerce.entity.Address;
import com.reva.ecommerce.entity.Customer;
import com.reva.ecommerce.entity.Order;
import com.reva.ecommerce.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
