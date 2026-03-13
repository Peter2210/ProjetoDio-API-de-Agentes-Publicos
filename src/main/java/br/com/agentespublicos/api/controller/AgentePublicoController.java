package br.com.agentespublicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agentespublicos.api.dto.AgentePublicoDTO;
import br.com.agentespublicos.api.service.AgentePublicoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("AgentePublico")
public class AgentePublicoController {

    @Autowired
    private AgentePublicoService agentePublicoService;

 @GetMapping
    public Iterable<AgentePublicoDTO> buscarTodos() {
        return agentePublicoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public AgentePublicoDTO buscarPorId(@PathVariable Long id) {
        return agentePublicoService.buscarPorId(id);
    }

    @GetMapping("/{nome}")
    public AgentePublicoDTO buscarPorNome(@PathVariable String nome) {
        return agentePublicoService.buscarPorNome(nome);
    }

    @PostMapping
    public void inserir(@RequestBody AgentePublicoDTO agenteDTO) {
        agentePublicoService.inserirAgentePublico(agenteDTO);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody AgentePublicoDTO agenteDTO) {
        agentePublicoService.atualizarAgentePublico(id, agenteDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        agentePublicoService.deletarAgentePublico(id);
    }
}
