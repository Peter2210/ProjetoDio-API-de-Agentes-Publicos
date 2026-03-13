package br.com.agentespublicos.api.service.AgentePublicoServiceImpl;

import org.springframework.stereotype.Service;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;
import br.com.agentespublicos.api.mapper.AgentePublicoMapper;
import br.com.agentespublicos.api.model.AgentePublico;
import br.com.agentespublicos.api.repository.AgentePublicoRepository;
import br.com.agentespublicos.api.service.AgentePublicoService;
import br.com.agentespublicos.api.service.BaseServiceImpl;

@Service
public class AgentePublicoServiceImpl extends BaseServiceImpl<AgentePublico, AgentePublicoDTO, Long> implements AgentePublicoService{

    public AgentePublicoServiceImpl(AgentePublicoRepository repository, AgentePublicoMapper mapper) {
        super(repository, mapper);
    }

    
}
