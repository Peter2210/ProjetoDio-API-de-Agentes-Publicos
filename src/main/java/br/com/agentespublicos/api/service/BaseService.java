package br.com.agentespublicos.api.service;

import java.util.List;

public interface BaseService<DTO, ID> {

    List<DTO> buscarTodos();

    DTO buscarPorId(ID id);

    DTO salvar(DTO dto);

    DTO atualizar(ID id, DTO dto);

    void deletar(ID id);

}