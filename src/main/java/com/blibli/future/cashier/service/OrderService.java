package com.blibli.future.cashier.service;

import com.blibli.future.cashier.controller.model.request.CreateOrderRequest;
import com.blibli.future.cashier.entity.Order;

public interface OrderService {

    public Order createOrder(CreateOrderRequest createOrderRequest);
}
