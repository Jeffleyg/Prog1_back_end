package backend.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Cliente;
import backend.backend.repositories.ClienteRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClienteController {
    ClienteRepository repos;
    
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes() {
        return repos.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return repos.findById(id).get();
    }

    @PostMapping("/cliente")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return repos.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable Long id) {
        repos.deleteById(id);
    }
}
