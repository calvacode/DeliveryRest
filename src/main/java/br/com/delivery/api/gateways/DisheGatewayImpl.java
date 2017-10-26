package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Dishe;
import br.com.delivery.api.gateways.mongo.DisheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DisheGatewayImpl implements DisheGateway {

    @Autowired
    private DisheRepository disheRepository;


    @Override
    public Dishe save(final Dishe dishe) {
        return disheRepository.save(dishe);
    }

    @Override
    public List<Dishe> findAll() {
        return disheRepository.findAll();
    }

    @Override
    public Dishe findDisheById(final String id) {
        return disheRepository.findDisheById(id);
    }

    @Override
    public List<Dishe> findDisheByCategoryIgnoreCase(final String category) {return disheRepository.findDisheByCategoryIgnoreCase(category);}

    @Override
    public List<Dishe> findDisheByNameIgnoreCase(final String name) {

        return disheRepository.findAll()
                .stream()
                .filter(d -> d.getName().toUpperCase().contains(name.toUpperCase()))
                .collect(Collectors.toList());
    }


}
