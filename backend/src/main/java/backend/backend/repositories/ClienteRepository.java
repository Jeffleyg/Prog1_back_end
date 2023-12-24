package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
