package br.com.agentespublicos.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Ministro extends AgentePublico{

    @ManyToOne
    private Ministerio ministerio;

    private String presidenteNomeacao;

    private LocalDate dataNomeacao;

    private LocalDate dataSaida;

    public Ministerio getMinisterio() {
        return ministerio;
    }

    public void setMinisterio(Ministerio ministerio) {
        this.ministerio = ministerio;
    }

    public String getPresidenteNomeacao() {
        return presidenteNomeacao;
    }

    public void setPresidenteNomeacao(String presidenteNomeacao) {
        this.presidenteNomeacao = presidenteNomeacao;
    }

    public LocalDate getDataNomeacao() {
        return dataNomeacao;
    }

    public void setDataNomeacao(LocalDate dataNomeacao) {
        this.dataNomeacao = dataNomeacao;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    

}
