package br.com.delivery.api.gateways.mongo;

import br.com.delivery.api.domain.Dishe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DisheRepository extends MongoRepository<Dishe, String> {

    Dishe findDisheById(String id);

    List<Dishe> findAll();

    List<Dishe> findDisheByCategory(String category);



}
