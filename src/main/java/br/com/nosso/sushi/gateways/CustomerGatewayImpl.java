package br.com.nosso.sushi.gateways;

import br.com.nosso.sushi.domain.Customer;
import br.com.nosso.sushi.gateways.mongo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {

    private CustomerRepository customerRepository;

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerByName(String name){return customerRepository.findByName(name);}
}
