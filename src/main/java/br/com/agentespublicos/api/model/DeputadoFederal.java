package br.com.agentespublicos.api.model;

import br.com.agentespublicos.api.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class DeputadoFederal extends AgentePublico{

    @ManyToOne
    private PartidoPolitico partido;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private Integer legislatura;

    private Long numeroVotos;

    private String gabinete;

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getLegislatura() {
        return legislatura;
    }

    public void setLegislatura(Integer legislatura) {
        this.legislatura = legislatura;
    }

    public Long getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(Long numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    
}
