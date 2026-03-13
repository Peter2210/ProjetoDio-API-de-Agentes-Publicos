package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agentespublicos.api.model.AgentePublico;
import java.util.List;
import java.util.Optional;

@Repository
public interface AgentePublicoRepository extends JpaRepository<AgentePublico, Long>{

    Optional<AgentePublico> findByNome(String nome);
    List<AgentePublico> findByCpf(String cpf);

}
