package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Servico {
    private String nome;
    private int qualidade;
    private double custo;
    private int minutosDuracao;
    @OneToOne
    private Barbeiro barbeiro;
    @Id
    private Long id;

}
