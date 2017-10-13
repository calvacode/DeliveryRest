package br.com.delivery.api.usecases;

import br.com.delivery.api.domain.Order;
import br.com.delivery.api.gateways.OrderGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CrudOrder {

    private final OrderGateway orderGateway;

    public Order createOrder(Order order){return orderGateway.save(order);}
}
