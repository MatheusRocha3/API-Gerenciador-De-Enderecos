package com.relacionamentodetabelas.relacionamentodetabelas.service;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cidade;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.CidadeRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.ClienteRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private  CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    }
    public Optional<Cidade> buscarId(Integer codigo){
        return cidadeRepository.findById(codigo);
    }
    public Cidade cadastrar(Cidade cliente){
        cliente.getCodigo();
        cliente.getNomeCidade();
        return cidadeRepository.save(cliente);
    }
    public Cidade alterar(Cidade cidade){
        cidade.getCodigo();
        cidade.getNomeCidade();

        return cidadeRepository.save(cidade);
    }
    public void deletar(Integer codigo){
        cidadeRepository.deleteById(codigo);
    }

}
