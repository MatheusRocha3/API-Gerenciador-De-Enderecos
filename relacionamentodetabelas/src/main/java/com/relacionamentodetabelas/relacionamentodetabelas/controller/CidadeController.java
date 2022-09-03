package com.relacionamentodetabelas.relacionamentodetabelas.controller;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cidade;
import com.relacionamentodetabelas.relacionamentodetabelas.service.CidadeService;
import com.relacionamentodetabelas.relacionamentodetabelas.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidades")
    public Iterable<Cidade> buscarTodasCidades(){
        return cidadeService.buscarTodos();
    }
    @GetMapping(path = "/cidades/{codigo}")
    public Optional<Cidade> buscarPorId(@PathVariable Integer codigo){
        return cidadeService.buscarId(codigo);
    }
    @PostMapping(path = "/cidades")
    @ResponseStatus(HttpStatus.CREATED)
    public Cidade cadastrarCidade(@RequestBody Cidade cidade){
        return cidadeService.cadastrar(cidade);
    }
    @PutMapping(path = "/cidades/{codigo}")
    public Cidade alterarCidade(@RequestBody Cidade cidade){
        return cidadeService.alterar(cidade);
    }

    @DeleteMapping(path = "/cidades/{codigo}")
    public void deletarCidade(@PathVariable Integer codigo){
        cidadeService.deletar(codigo);
    }

}
