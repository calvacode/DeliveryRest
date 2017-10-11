package br.com.nosso.sushi.usecases;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.gateways.ClienteGateway;

public class CadastraCliente {

    private ClienteGateway clienteGateway;


    public CadastraCliente (ClienteGateway clienteGateway){
        this.clienteGateway = clienteGateway;
    }

    public Cliente cadastraCliente(Cliente cliente){
        return clienteGateway.save(cliente);

    }

}
