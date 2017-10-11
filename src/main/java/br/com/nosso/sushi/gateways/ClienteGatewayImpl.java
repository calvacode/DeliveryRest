package br.com.nosso.sushi.gateways;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.gateways.mongo.ClienteRepository;

public class ClienteGatewayImpl implements ClienteGateway{
    private ClienteRepository clienteRepository;

    public ClienteGatewayImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }


    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
