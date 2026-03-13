package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.PartidoPolitico;
import java.util.List;
import br.com.agentespublicos.api.model.AgentePublico;
import java.util.Set;



public interface PartidoPoliticoRepository extends JpaRepository<PartidoPolitico, Long> {

    List<PartidoPolitico> findByNumero(Integer numero);

    List<PartidoPolitico> findBySigla(String sigla);

    List<PartidoPolitico> findByNome(String nome);

    List<PartidoPolitico> findByAgentesPublicos(Set<AgentePublico> agentesPublicos);
}
