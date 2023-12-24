package backend.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Cartao;
import backend.backend.repositories.CartaoRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CartaoController {
    CartaoRepository repos;

    @GetMapping("/cartoes")
    public List<Cartao> getAllCartoes() {
        return repos.findAll();
    }
    
    @GetMapping("/cartao/{id}")
    public Cartao getCartaoById(@PathVariable Long id) {
        return repos.findById(id).get();
    }

    @PostMapping("/cartao")
    public Cartao saveCartao(@RequestBody Cartao cartao) {
        return repos.save(cartao);
    }

    @DeleteMapping("/cartao/{id}")
    public void deleteCartao(@PathVariable Long id) {
        repos.deleteById(id);
    }    
}
