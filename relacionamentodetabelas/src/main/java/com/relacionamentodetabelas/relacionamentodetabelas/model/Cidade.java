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
@Table(name = "cidades")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nome_cidade", length = 50, nullable = false)
    private String nomeCidade;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade", cascade=CascadeType.ALL)
    private List<Endereco> enderecos;
}
