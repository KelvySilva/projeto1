package br.com.sg.treinee.projeto1.repository;

import br.com.sg.treinee.projeto1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeIgnoreCaseContaining(String nome);
}
