package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cliente  {
    private String nome;
    private String password;
    private String email;
    @Id
    private Long id;
    @OneToMany
    private List<Agendamento> agendamentos;


}
