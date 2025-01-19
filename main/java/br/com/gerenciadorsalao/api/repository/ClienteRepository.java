package br.com.gerenciadorsalao.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorsalao.api.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
