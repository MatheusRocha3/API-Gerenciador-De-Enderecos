package com.relacionamentodetabelas.relacionamentodetabelas.service;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cliente;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.ClienteRepository;
import com.relacionamentodetabelas.relacionamentodetabelas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarId(Integer codigo){
        return clienteRepository.findById(codigo);
    }

    public Cliente cadastrar(Cliente cliente){
        cliente.getCodigo();
        cliente.getNomeCliente();
        return clienteRepository.save(cliente);
    }

    public Cliente alterar(Cliente cliente){
        cliente.getCodigo();
        cliente.getNomeCliente();

        return clienteRepository.save(cliente);
    }

    public void deletar(Integer codigo){
        clienteRepository.deleteById(codigo);
    }
}
