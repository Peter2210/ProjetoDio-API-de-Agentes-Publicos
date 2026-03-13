package br.com.agentespublicos.api.service;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;

public interface AgentePublicoService {

    Iterable<AgentePublicoDTO> buscarTodos();

    AgentePublicoDTO buscarPorId(Long id);

    AgentePublicoDTO buscarPorNome(String nome);

    void inserirAgentePublico(AgentePublicoDTO agentePublico);

    void atualizarAgentePublico(Long id, AgentePublicoDTO agentePublico);

    void deletarAgentePublico(Long id);
}
