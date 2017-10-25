package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Order;
import br.com.delivery.api.gateways.mongo.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderGatewayImpl implements OrderGateway {

    private OrderRepository orderRepository;

    @Override
    public Order save(Order order) {return orderRepository.save(order);}

    @Override
    public Order findOrderByPhoneNumber(String phoneNumber){return orderRepository.findOne(phoneNumber);}
}
