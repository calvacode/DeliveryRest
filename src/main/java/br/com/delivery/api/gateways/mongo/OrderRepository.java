package br.com.delivery.api.gateways.mongo;

import br.com.delivery.api.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
