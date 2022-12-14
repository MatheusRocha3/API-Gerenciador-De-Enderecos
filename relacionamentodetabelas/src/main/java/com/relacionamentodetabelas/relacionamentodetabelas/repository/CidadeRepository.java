package com.relacionamentodetabelas.relacionamentodetabelas.repository;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
