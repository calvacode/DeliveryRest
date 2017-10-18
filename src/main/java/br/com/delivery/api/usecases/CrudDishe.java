package br.com.delivery.api.usecases;

import br.com.delivery.api.domain.Dishe;
import br.com.delivery.api.gateways.DisheGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CrudDishe {

    private DisheGateway disheGateway;

    public Dishe saveDishe(Dishe dishe){return disheGateway.save(dishe);}

    public List<Dishe> findAllDishe(){return disheGateway.findAll();}

    public Dishe findDisheById(String id){return disheGateway.findDisheById(id);}


}
