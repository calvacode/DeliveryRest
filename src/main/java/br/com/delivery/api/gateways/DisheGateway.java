package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Dishe;

import java.util.List;

public interface DisheGateway  {

    Dishe save (Dishe dishe);

    List<Dishe> findAll();

    Dishe findDisheById(String id);

}
