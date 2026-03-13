package br.com.agentespublicos.api.mapper;

import org.springframework.stereotype.Component;

import br.com.agentespublicos.api.dto.DeputadoFederalDTO;
import br.com.agentespublicos.api.model.DeputadoFederal;

@Component
public class DeputadoFederalMapper implements BaseMapper<DeputadoFederal, DeputadoFederalDTO> {

    @Override
    public DeputadoFederalDTO toDTO(DeputadoFederal deputado) {
        DeputadoFederalDTO dto = new DeputadoFederalDTO();

        dto.setId(deputado.getId());
        dto.setNome(deputado.getNome());
        dto.setPartido(deputado.getPartido());

        return dto;
    }

    @Override
    public DeputadoFederal toEntity(DeputadoFederalDTO dto) {

        DeputadoFederal deputado = new DeputadoFederal();

        deputado.setId(dto.getId());
        deputado.setNome(dto.getNome());
        deputado.setPartido(dto.getPartido());

        return deputado;
    }

}
