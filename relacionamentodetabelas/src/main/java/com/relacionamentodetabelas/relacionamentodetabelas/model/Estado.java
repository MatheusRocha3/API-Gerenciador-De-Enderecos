package com.relacionamentodetabelas.relacionamentodetabelas.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nome_estado", length = 50, nullable = false)
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade=CascadeType.ALL)
    private List<Endereco> enderecos;
}
