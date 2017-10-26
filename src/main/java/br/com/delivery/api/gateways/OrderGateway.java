package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Order;

import java.util.List;

public interface OrderGateway {

    Order save(Order order);

    Order findOrderByPhoneNumber(String phoneCustomerOrder);

    List<Order> findAll();

}
