package com.blibli.future.cashier.controller.model.response;

import com.blibli.future.cashier.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetOrdersResponse {
    private List<Order> content;
}
