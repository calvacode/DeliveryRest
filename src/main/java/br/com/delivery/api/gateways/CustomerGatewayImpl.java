package br.com.delivery.api.gateways;

import br.com.delivery.api.domain.Customer;
import br.com.delivery.api.gateways.mongo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {

    private CustomerRepository customerRepository;

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerByPhone(String phone){return customerRepository.findByPhone(phone);}
}
