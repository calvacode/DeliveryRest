package br.com.nosso.sushi.usecases;

import br.com.nosso.sushi.domain.Customer;
import br.com.nosso.sushi.gateways.CustomerGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CrudCustomer {

    private final CustomerGateway customerGateway;

    public Customer createCustomer(Customer customer){return customerGateway.save(customer);}

    public Customer findCustomerByName(String name){return customerGateway.findCustomerByName(name);}



}
