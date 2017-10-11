package br.com.nosso.sushi.domain;


import lombok.Data;

@Data
public class Prato {

    private String descricao;
    private String categoria;
    private double valor;
    private String urlImagem;
}
