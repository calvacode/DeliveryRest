package br.com.nosso.sushi.usecases;

import br.com.nosso.sushi.domain.Customer;
import br.com.nosso.sushi.gateways.CustomerGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastraCliente {

    private final CustomerGateway customerGateway;

    public Customer cadastraCliente(Customer customer){
        return customerGateway.save(customer);
    }



}
