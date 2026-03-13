package br.com.agentespublicos.api.service.AgentePublicoServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;
import br.com.agentespublicos.api.mapper.AgentePublicoMapper;
import br.com.agentespublicos.api.model.AgentePublico;
import br.com.agentespublicos.api.repository.AgentePublicoRepository;
import br.com.agentespublicos.api.service.AgentePublicoService;

@Service
public class AgentePublicoServiceImpl implements AgentePublicoService{

    @Autowired
    private AgentePublicoRepository agentePublicoRepository;
    @Autowired
    private AgentePublicoMapper agentePublicoMapper;

    @Override
    public Iterable<AgentePublicoDTO> buscarTodos() {

        return agentePublicoRepository.findAll().stream().map(agentePublicoMapper::toDTO).toList();
    }

    @Override
    public AgentePublicoDTO buscarPorId(Long id) {

        return agentePublicoRepository.findById(id).map(agentePublicoMapper::toDTO).orElse(null);
    }

    @Override
    public AgentePublicoDTO buscarPorNome(String nome) {

        return agentePublicoRepository.findByNome(nome).map(agentePublicoMapper::toDTO).orElse(null);
    }

    @Override
    public void inserirAgentePublico(AgentePublicoDTO agenteDTO) {

        AgentePublico agente = agentePublicoMapper.toEntity(agenteDTO);

        agentePublicoRepository.save(agente);
    }

    @Override
    public void atualizarAgentePublico(Long id, AgentePublicoDTO agenteDTO) {

        Optional<AgentePublico> agenteExistente = agentePublicoRepository.findById(id);

        if (agenteExistente.isPresent()) {

            AgentePublico agente = agentePublicoMapper.toEntity(agenteDTO);

            agente.setId(id);

            agentePublicoRepository.save(agente);
        }
    }

    @Override
    public void deletarAgentePublico(Long id) {

        agentePublicoRepository.deleteById(id);

    }
}
