package br.com.nosso.sushi.gateways.http;

import br.com.nosso.sushi.domain.Cliente;
import br.com.nosso.sushi.usecases.CadastraCliente;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sushi/cliente")
@Api(value="Clientes API")
public class ClienteController {

    private CadastraCliente cadastraCliente;

    @Autowired
    public ClienteController(CadastraCliente cadastraCliente){
        this.cadastraCliente = cadastraCliente;
    }

    @ApiOperation(value="Cria um novo cliente.", notes="Inserção síncrona.")
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity save(@RequestBody final Cliente cliente){

        cadastraCliente.cadastraCliente(cliente);

        return ResponseEntity.ok(cliente);
    }



}
