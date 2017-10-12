package br.com.nosso.sushi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@ToString(callSuper = true)
public class Cliente {

    @Id
    private String id;

    private String nome;
    private String telefone;
    private String endereco;

}
