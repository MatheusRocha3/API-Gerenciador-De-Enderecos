package com.relacionamentodetabelas.relacionamentodetabelas.controller;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cidade;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Estado;
import com.relacionamentodetabelas.relacionamentodetabelas.service.EstadoService;
import com.relacionamentodetabelas.relacionamentodetabelas.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/estados")
    public Iterable<Estado> buscarTodosEstados(){
        return estadoService.buscarTodos();
    }
    @GetMapping(path = "/estados/{codigo}")
    public Optional<Estado> buscarPorId(@PathVariable Integer codigo){
        return estadoService.buscarId(codigo);
    }
    @PostMapping(path = "/estados")
    @ResponseStatus(HttpStatus.CREATED)
    public Estado cadastrarEstado(@RequestBody Estado estado){
        return estadoService.cadastrar(estado);
    }
    @PutMapping(path = "/estados/{codigo}")
    public Estado alterarEstado(@RequestBody Estado estado){
        return estadoService.alterar(estado);
    }

    @DeleteMapping(path = "/estados/{codigo}")
    public void deletarEstado(@PathVariable Integer codigo){
        estadoService.deletar(codigo);
    }

}
