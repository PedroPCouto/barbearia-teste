package br.com.pucminas.barbeariateste.repositories;
import br.com.pucminas.barbeariateste.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
