package br.com.delivery.api.controller;

import br.com.delivery.api.domain.Order;
import br.com.delivery.api.usecases.CrudOrder;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1/delivery/order")
public class OrderController {

    private final CrudOrder crudOrder;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody Order order){

        return ResponseEntity.ok(crudOrder.createOrder(order));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "{phoneCustomerOrder}")
    public Order findOrder(@PathVariable("phoneCustomerOrder") String phoneCustomerOrder){
        return crudOrder.findOrder(phoneCustomerOrder);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> findAllOrder(){return(crudOrder.findAll());}
}
