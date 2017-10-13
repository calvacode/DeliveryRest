package br.com.delivery.api.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Dishe {

    @Id
    private String id;

    private String name;
    private String category;
    private Double value;
    private String urlImagem;
}
