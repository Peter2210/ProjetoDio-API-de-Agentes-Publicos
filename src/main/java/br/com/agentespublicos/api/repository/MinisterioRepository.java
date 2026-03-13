package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.Ministerio;
import java.util.List;


public interface MinisterioRepository extends JpaRepository<Ministerio, Long>{

    List<Ministerio> findBySigla(String sigla);

    List<Ministerio> findByNome(String nome);
    
}
