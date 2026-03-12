package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.AgentePublico;
import java.util.List;


public interface AgentePublicoRepository extends JpaRepository<AgentePublico, Long>{
    List<AgentePublico> findAllByCpf(String cpf);
}
