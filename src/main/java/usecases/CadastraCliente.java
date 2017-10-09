package usecases;

import domain.Cliente;
import gateways.ClienteGateway;
import gateways.mongo.ClienteRepository;

public class CadastraCliente {

    private ClienteGateway clienteGateway;


    public CadastraCliente (ClienteGateway clienteGateway){
        this.clienteGateway = clienteGateway;
    }

    public Cliente cadastraCliente(Cliente cliente){
        return clienteGateway.save(cliente);

    }

}
