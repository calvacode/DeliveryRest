package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Dishe;
import br.com.delivery.api.gateways.mongo.DisheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DisheGatewayImpl implements DisheGateway {

    @Autowired
    private DisheRepository disheRepository;


    @Override
    public Dishe save(Dishe dishe) {
        return disheRepository.save(dishe);
    }

    @Override
    public List<Dishe> findAll() {
        return disheRepository.findAll();
    }

    @Override
    public Dishe findDisheById(String id) {
        return disheRepository.findDisheById(id);
    }
}
