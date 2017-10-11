package br.com.nosso.sushi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @NonNull
    private String nome;
    @NonNull
    private String telefone;
    @NonNull
    private String endereco;

}
