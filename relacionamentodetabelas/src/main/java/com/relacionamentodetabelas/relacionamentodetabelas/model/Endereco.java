package com.relacionamentodetabelas.relacionamentodetabelas.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "logradouro_endereco", length = 50, nullable = false)
    private String logradouro;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "codigo")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "codigo")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "codigo")
    private Estado estado;

}
