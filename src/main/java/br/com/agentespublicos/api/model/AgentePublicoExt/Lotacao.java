package br.com.agentespublicos.api.model.AgentePublicoExt;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CargoPublico cargoPublico;

    @ManyToOne
    private OrgaoPublico orgao;

    private String setor;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CargoPublico getCargoPublico() {
        return cargoPublico;
    }

    public void setCargoPublico(CargoPublico cargoPublico) {
        this.cargoPublico = cargoPublico;
    }

    public OrgaoPublico getOrgao() {
        return orgao;
    }

    public void setOrgao(OrgaoPublico orgao) {
        this.orgao = orgao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}