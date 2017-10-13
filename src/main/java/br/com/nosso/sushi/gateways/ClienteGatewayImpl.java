package br.com.nosso.sushi.gateways;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.gateways.mongo.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteGatewayImpl implements ClienteGateway {

    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
