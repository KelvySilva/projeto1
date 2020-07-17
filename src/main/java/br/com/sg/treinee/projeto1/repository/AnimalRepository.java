package br.com.sg.treinee.projeto1.repository;

import br.com.sg.treinee.projeto1.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
