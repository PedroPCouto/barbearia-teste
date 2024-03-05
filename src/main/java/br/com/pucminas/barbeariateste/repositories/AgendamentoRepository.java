package br.com.pucminas.barbeariateste.repositories;

import br.com.pucminas.barbeariateste.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {


}
