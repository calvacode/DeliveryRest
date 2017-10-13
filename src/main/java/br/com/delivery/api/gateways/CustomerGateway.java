package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Customer;

public interface CustomerGateway {

    Customer save(Customer customer);

    Customer findCustomerByPhone(String phone);

}