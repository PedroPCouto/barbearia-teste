package br.com.pucminas.barbeariateste.repositories;

import br.com.pucminas.barbeariateste.entities.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {

}
