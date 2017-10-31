package br.com.delivery.api.controller;

import br.com.delivery.api.domain.Dishe;
import br.com.delivery.api.usecases.CrudDishe;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("v1/delivery/dishe")
public class DisheController {
    private final CrudDishe crudDishe;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody Dishe dishe){

        return ResponseEntity.ok(crudDishe.saveDishe(dishe));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dishe>> listAllDishe(){
        return ResponseEntity.ok(crudDishe.findAllDishe());
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/{id}")
    public ResponseEntity<Dishe> getDisheById(
            @PathVariable("id") String id
    ){
        return ResponseEntity.ok(crudDishe.findDisheById(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value= "/category/{category}")
    public ResponseEntity<List<Dishe>> getDisheByCategory(@PathVariable("category") String category){
        return ResponseEntity.ok(crudDishe.findDisheByCategory(category));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/name/{name}")
    public ResponseEntity<List<Dishe>> getDisheByName(@PathVariable("name") String name){
        return ResponseEntity.ok(crudDishe.findDisheByName(name));
    }



}
