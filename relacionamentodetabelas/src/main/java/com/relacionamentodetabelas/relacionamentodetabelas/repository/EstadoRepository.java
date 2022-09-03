package com.relacionamentodetabelas.relacionamentodetabelas.repository;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Estado;
import com.relacionamentodetabelas.relacionamentodetabelas.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
