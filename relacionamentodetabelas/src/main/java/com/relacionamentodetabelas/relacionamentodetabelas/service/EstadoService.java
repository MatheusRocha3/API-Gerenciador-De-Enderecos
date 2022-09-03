package com.relacionamentodetabelas.relacionamentodetabelas.service;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cidade;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Estado;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.CidadeRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.ClienteRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.EstadoRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos(){
        return estadoRepository.findAll();
    }
    public Optional<Estado> buscarId(Integer codigo){
        return estadoRepository.findById(codigo);
    }
    public Estado cadastrar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();
        return estadoRepository.save(estado);
    }
    public Estado alterar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();

        return estadoRepository.save(estado);
    }
    public void deletar(Integer codigo){
        estadoRepository.deleteById(codigo);
    }
}
