package br.com.agentespublicos.api.service;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;

public interface MinisterioService {
    
    Iterable<AgentePublicoDTO> buscarTodos();

    AgentePublicoDTO buscarPorId(Long id);

    AgentePublicoDTO buscarPorNome(String nome);

    void inserirMinisterio(AgentePublicoDTO agentePublico);

    void atualizarMinisterio(Long id, AgentePublicoDTO agentePublico);

    void deletarMinisterio(Long id);
}
