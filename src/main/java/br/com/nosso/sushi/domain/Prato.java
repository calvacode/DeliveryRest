package br.com.nosso.sushi.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Prato {

    @Id
    private String id;

    private String descricao;
    private String categoria;
    private Double valor;
    private String urlImagem;
}
