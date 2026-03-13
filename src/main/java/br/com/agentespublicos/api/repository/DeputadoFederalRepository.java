package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.DeputadoFederal;
import br.com.agentespublicos.api.model.PartidoPolitico;

import java.util.List;
import br.com.agentespublicos.api.enums.Estado;



public interface DeputadoFederalRepository extends JpaRepository<DeputadoFederal, Long>{

    List<DeputadoFederal> findByGabinete(String gabinete);

    List<DeputadoFederal> findByPartido(PartidoPolitico partido);

    List<DeputadoFederal> findByEstado(Estado estado);

    List<DeputadoFederal> findByLegislatura(Integer legislatura);
}
