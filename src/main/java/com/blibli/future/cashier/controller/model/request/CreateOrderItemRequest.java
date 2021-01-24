package com.blibli.future.cashier.controller.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateOrderItemRequest {
    private int price;
    private int quantity;
    private String productName;
}
