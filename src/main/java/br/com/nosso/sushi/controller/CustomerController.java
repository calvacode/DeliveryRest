package br.com.nosso.sushi.controller;

import br.com.nosso.sushi.domain.Customer;
import br.com.nosso.sushi.usecases.CrudCustomer;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1/sushi")
public class CustomerController {

    private final CrudCustomer crudCustomer;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody Customer customer){

        crudCustomer.createCustomer(customer);

        return ResponseEntity.ok(customer);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer find(@RequestParam String customerName){

        return crudCustomer.findCustomerByName(customerName);
    }


}