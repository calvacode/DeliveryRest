package gateways;

import domain.Cliente;
import gateways.mongo.ClienteRepository;

public class ClienteGatewayImpl implements ClienteGateway{
    private ClienteRepository clienteRepository;

    public ClienteGatewayImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }


    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
