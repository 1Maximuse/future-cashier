package com.blibli.future.cashier.service.impl;

import com.blibli.future.cashier.controller.model.request.CreateOrderItemRequest;
import com.blibli.future.cashier.controller.model.request.CreateOrderRequest;
import com.blibli.future.cashier.entity.Order;
import com.blibli.future.cashier.entity.OrderItem;
import com.blibli.future.cashier.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private int orderId = 0;

    private List<Order> orderList = new ArrayList<Order>();

    public Order createOrder(CreateOrderRequest createOrderRequest) {
        List<OrderItem> orderItems = new ArrayList<OrderItem>();

        int totalPrice = 0;
        int orderItemId = 0;
        for (CreateOrderItemRequest createOrderItemRequest : createOrderRequest.getOrderItems()) {
            totalPrice += createOrderItemRequest.getPrice() * createOrderItemRequest.getQuantity();
            orderItems.add(
                    OrderItem.builder()
                            .id(orderItemId++)
                            .price(createOrderItemRequest.getPrice())
                            .quantity(createOrderItemRequest.getQuantity())
                            .productName(createOrderItemRequest.getProductName())
                            .build()
            );
        }

        Order order = Order
                .builder()
                .id(orderId++)
                .totalPrice(totalPrice)
                .customer(createOrderRequest.getCustomer())
                .orderItems(orderItems)
                .build();
        orderList.add(order);
        return order;
    }

    public Order getOrderById(int id) {
        Order order = null;
        try {
            order = orderList.get(id);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return order;
    }

    public List<Order> getOrders() {
        return orderList;
    }
}
