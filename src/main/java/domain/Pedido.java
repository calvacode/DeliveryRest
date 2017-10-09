package domain;

import lombok.Data;

import java.util.List;

@Data
public class Pedido {

    private Cliente cliente;
    private List<Prato> pratoList;

}
