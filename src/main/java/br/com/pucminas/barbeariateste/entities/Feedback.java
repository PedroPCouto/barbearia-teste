package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Feedback {
    @Id
    private Long id;
    @ManyToOne
    private Barbeiro barbeiro;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Servico servico;
    private int qualidade;
    private String comentario;
}
