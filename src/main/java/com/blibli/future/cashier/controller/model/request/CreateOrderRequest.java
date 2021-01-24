package com.blibli.future.cashier.controller.model.request;

import com.blibli.future.cashier.entity.Customer;
import com.blibli.future.cashier.entity.OrderItem;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateOrderRequest {
    private Customer customer;
    private List<CreateOrderItemRequest> orderItems;
}
