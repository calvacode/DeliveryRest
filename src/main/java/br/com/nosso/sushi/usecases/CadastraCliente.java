package br.com.nosso.sushi.usecases;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.gateways.ClienteGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastraCliente {

    private final ClienteGateway clienteGateway;

    public Cliente cadastraCliente(Cliente cliente){
        return clienteGateway.save(cliente);
    }

}
