package br.com.agentespublicos.api.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agentespublicos.api.mapper.BaseMapper;

public abstract class BaseServiceImpl<E, D, ID> implements BaseService<D, ID> {

    protected final JpaRepository<E, ID> repository;
    protected final BaseMapper<E, D> mapper;

    protected BaseServiceImpl(JpaRepository<E, ID> repository, BaseMapper<E, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<D> buscarTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public D buscarPorId(ID id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    @Override
    public D salvar(D dto) {

        E entity = mapper.toEntity(dto);

        return mapper.toDTO(repository.save(entity));
    }

    @Override
    public D atualizar(ID id, D dto) {

        E entity = mapper.toEntity(dto);

        return mapper.toDTO(repository.save(entity));
    }

    @Override
    public void deletar(ID id) {
        repository.deleteById(id);
    }
}