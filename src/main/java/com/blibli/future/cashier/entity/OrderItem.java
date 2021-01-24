package com.blibli.future.cashier.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItem {
    private int id;
    private int price;
    private int quantity;
    private String productName;
}
