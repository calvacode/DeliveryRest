package br.com.delivery.api.usecases;

import br.com.delivery.api.domain.Customer;
import br.com.delivery.api.gateways.CustomerGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CrudCustomer {

    private final CustomerGateway customerGateway;

    public Customer createCustomer(Customer customer){return customerGateway.save(customer);}

    public Customer findCustomerByPhone(String phone){return customerGateway.findCustomerByPhone(phone);}



}
