package br.com.pucminas.barbeariateste.repositories;

import br.com.pucminas.barbeariateste.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
