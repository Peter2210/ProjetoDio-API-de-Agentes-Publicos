package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.PartidoPolitico;
import br.com.agentespublicos.api.model.Senador;
import java.util.List;
import java.time.LocalDate;


public interface SenadorRepository extends JpaRepository<Senador, Long>{

    List<Senador> findByAnoFimMandato(LocalDate anoFimMandato);

    List<Senador> findByAnoInicioMandato(LocalDate anoInicioMandato);

    List<Senador> findByPartido(PartidoPolitico partido);
}
