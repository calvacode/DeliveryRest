package br.com.delivery.api.gateways.mongo;

import br.com.delivery.api.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByName(String name);

}
