package br.com.agentespublicos.api.model;

import java.time.LocalDate;

import br.com.agentespublicos.api.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class Senador extends AgentePublico {

    @ManyToOne
    private PartidoPolitico partido;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDate anoInicioMandato;

    private LocalDate anoFimMandato;

    @ManyToOne
    private AgentePublico suplente1;

    @ManyToOne
    private AgentePublico suplente2;

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

    public LocalDate getAnoInicioMandato() {
        return anoInicioMandato;
    }

    public void setAnoInicioMandato(LocalDate anoInicioMandato) {
        this.anoInicioMandato = anoInicioMandato;
    }

    public LocalDate getAnoFimMandato() {
        return anoFimMandato;
    }

    public void setAnoFimMandato(LocalDate anoFimMandato) {
        this.anoFimMandato = anoFimMandato;
    }

    public AgentePublico getSuplente1() {
        return suplente1;
    }

    public void setSuplente1(AgentePublico suplente1) {
        this.suplente1 = suplente1;
    }

    public AgentePublico getSuplente2() {
        return suplente2;
    }

    public void setSuplente2(AgentePublico suplente2) {
        this.suplente2 = suplente2;
    }


}
