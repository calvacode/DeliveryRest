package br.com.nosso.sushi.gateways;

import br.com.nosso.sushi.domain.Customer;

public interface CustomerGateway {

    Customer save(Customer customer);

    Customer findCustomerByName(String name);

}