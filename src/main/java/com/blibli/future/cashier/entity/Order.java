package com.blibli.future.cashier.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private int id;
    private int totalPrice;
    private Customer customer;
    private List<OrderItem> orderItems;
}
