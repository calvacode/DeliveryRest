package br.com.delivery.api.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Order {

    @Id
    private String id;

    private Customer customer;
    private List<Dishe> disheList;

}
