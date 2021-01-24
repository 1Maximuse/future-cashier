package com.blibli.future.cashier.service;

import com.blibli.future.cashier.controller.model.request.CreateOrderRequest;
import com.blibli.future.cashier.entity.Order;

import java.util.List;

public interface OrderService {

    public Order createOrder(CreateOrderRequest createOrderRequest);
    public Order getOrderById(int id);
    public List<Order> getOrders(boolean orderByCustomer, boolean orderByPrice);
}
