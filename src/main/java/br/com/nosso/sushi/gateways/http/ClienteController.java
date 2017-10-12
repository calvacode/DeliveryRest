package br.com.nosso.sushi.gateways.http;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.usecases.CadastraCliente;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1/sushi")
public class ClienteController {

    private final CadastraCliente cadastraCliente;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody Cliente cliente){

        cadastraCliente.cadastraCliente(cliente);

        return ResponseEntity.ok(cliente);
    }
}