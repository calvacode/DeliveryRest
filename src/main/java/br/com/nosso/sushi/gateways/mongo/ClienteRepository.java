package br.com.nosso.sushi.gateways.mongo;

import br.com.nosso.sushi.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {


}
