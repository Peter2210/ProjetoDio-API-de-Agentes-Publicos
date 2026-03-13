package br.com.agentespublicos.api.mapper;

import org.springframework.stereotype.Component;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;
import br.com.agentespublicos.api.model.AgentePublico;

@Component
public class AgentePublicoMapper implements BaseMapper<AgentePublico, AgentePublicoDTO> {

    @Override
    public AgentePublicoDTO toDTO(AgentePublico agente) {

        AgentePublicoDTO dto = new AgentePublicoDTO();

        dto.setId(agente.getId());
        dto.setNome(agente.getNome());
        dto.setCpf(agente.getCpf());
        dto.setDataNascimento(agente.getDataNascimento());
        dto.setEstadoCivil(agente.getEstadoCivil());

        return dto;
    }

    @Override
    public AgentePublico toEntity(AgentePublicoDTO dto) {
        throw new UnsupportedOperationException(
            "AgentePublico é abstrato. Use um tipo concreto como Deputado ou Senador."
    );
}
}
