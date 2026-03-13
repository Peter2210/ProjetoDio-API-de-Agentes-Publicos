package br.com.agentespublicos.api.mapper;

import org.springframework.stereotype.Component;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;
import br.com.agentespublicos.api.model.AgentePublico;

@Component
public class AgentePublicoMapper {

    public AgentePublicoDTO toDTO(AgentePublico agente) {

        AgentePublicoDTO dto = new AgentePublicoDTO();

        dto.setId(agente.getId());
        dto.setNome(agente.getNome());
        dto.setCpf(agente.getCpf());
        dto.setDataNascimento(agente.getDataNascimento());
        dto.setEstadoCivil(agente.getEstadoCivil());

        return dto;
    }

    public AgentePublico toEntity(AgentePublicoDTO dto) {

        AgentePublico agente = new AgentePublico() {};

        agente.setId(dto.getId());
        agente.setNome(dto.getNome());
        agente.setCpf(dto.getCpf());
        agente.setDataNascimento(dto.getDataNascimento());
        agente.setEstadoCivil(dto.getEstadoCivil());

        return agente;
    }
}
