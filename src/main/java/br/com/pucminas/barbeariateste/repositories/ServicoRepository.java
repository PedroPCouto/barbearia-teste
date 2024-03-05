package br.com.pucminas.barbeariateste.repositories;

import br.com.pucminas.barbeariateste.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
