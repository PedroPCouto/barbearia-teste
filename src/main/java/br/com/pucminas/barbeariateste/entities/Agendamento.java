package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agendamento {
    private LocalDateTime horarioMarcado;
    @OneToOne
    private Servico servicos;
    @Id
    private Long id;

}
