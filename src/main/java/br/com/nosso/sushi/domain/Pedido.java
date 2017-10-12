package br.com.nosso.sushi.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Pedido {

    @Id
    private String id;

    private Cliente cliente;
    private List<Prato> pratoList;

}
