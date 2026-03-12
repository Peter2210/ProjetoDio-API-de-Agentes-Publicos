package br.com.agentespublicos.api.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.com.agentespublicos.api.enums.EstadoCivil;
import br.com.agentespublicos.api.model.AgentePublicoExt.Contato;
import br.com.agentespublicos.api.model.AgentePublicoExt.Endereco;
import br.com.agentespublicos.api.model.AgentePublicoExt.HistoricoFuncional;
import br.com.agentespublicos.api.model.AgentePublicoExt.Lotacao;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AgentePublico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String cin;
    private LocalDate dataNascimento;
    private String naturalidade;
    private String nacionalidade;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @OneToMany
    @JoinColumn(name = "agente_publico_id")
    private Set<Endereco> enderecos = new HashSet<>();

    @Embedded
    private Contato contato;

    @OneToMany
    private Set<Lotacao> lotacoes = new HashSet<>();

    @OneToMany
    private Set<HistoricoFuncional> historico = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Lotacao> getLotacoes() {
        return lotacoes;
    }

    public void setLotacoes(Set<Lotacao> lotacoes) {
        this.lotacoes = lotacoes;
    }

    public Set<HistoricoFuncional> getHistorico() {
        return historico;
    }

    public void setHistorico(Set<HistoricoFuncional> historico) {
        this.historico = historico;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgentePublico other = (AgentePublico) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}