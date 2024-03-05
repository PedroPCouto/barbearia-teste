package br.com.pucminas.barbeariateste.repositories;

import br.com.pucminas.barbeariateste.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
}
