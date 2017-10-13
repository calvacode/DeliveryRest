package br.com.nosso.sushi.gateways.mongo;

import br.com.nosso.sushi.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByName(String name);

}
