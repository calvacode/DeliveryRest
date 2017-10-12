package br.com.nosso.sushi.gateways.mongo;

import br.com.nosso.sushi.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

    Cliente findByNome(String name);

}
