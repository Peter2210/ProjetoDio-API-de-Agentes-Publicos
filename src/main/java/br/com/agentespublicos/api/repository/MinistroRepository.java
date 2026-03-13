package br.com.agentespublicos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.model.Ministerio;
import br.com.agentespublicos.api.model.Ministro;
import java.util.List;
import java.time.LocalDate;


public interface MinistroRepository extends JpaRepository<Ministro, Long> {

    List<Ministro> findByDataNomeacao(LocalDate dataNomeacao);

    List<Ministro> findByMinisterio(Ministerio ministerio);

    List<Ministro> findByPresidenteNomeacao(String presidenteNomeacao);
}
