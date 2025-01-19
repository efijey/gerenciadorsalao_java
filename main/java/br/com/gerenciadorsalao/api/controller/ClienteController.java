package br.com.gerenciadorsalao.api.controller;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciadorsalao.api.entity.Cliente;
import br.com.gerenciadorsalao.api.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository acao;
    
    @PostMapping("/")
    public String cadastrarCliente(@RequestBody Cliente c) {
        return acao.save(c).toString();
    }
    
    @GetMapping("/")
    public Iterable<Cliente> listarClientes() {
        return acao.findAll();
    } 
    
    @PutMapping("/{id}")
    public Cliente editarCliente(@PathVariable Long id, @RequestBody Cliente c) {
        return acao.save(c);
    } 
  
    @DeleteMapping("/{id}")
    public void removerCliente(@PathVariable Long id) {
        acao.deleteById(id);
    }

 }
