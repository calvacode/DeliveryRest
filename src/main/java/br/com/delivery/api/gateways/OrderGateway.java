package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Order;

public interface OrderGateway {

    Order save(Order order);

    Order findOrderByPhoneNumber(String phoneNumber);

}
