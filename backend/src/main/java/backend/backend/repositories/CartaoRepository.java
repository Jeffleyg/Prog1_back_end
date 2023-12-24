package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
    
}
