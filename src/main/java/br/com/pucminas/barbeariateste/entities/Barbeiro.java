package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Barbeiro {

    private String nome;
    private String password;
    private String email;
    @Id
    private Long id;
    private double notaMedia;
    @OneToOne
    private Horario horario;

}
