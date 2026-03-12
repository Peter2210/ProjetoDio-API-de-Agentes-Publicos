package br.com.agentespublicos.api.model.AgentePublicoExt;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contato {

    private String telefone;
    private String celular;
    private String emailPessoal;
    private String emailInstitucional;
    private String facebook;
    private String twitter;
    private String instagram;

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmailPessoal() {
        return emailPessoal;
    }
    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
    public String getEmailInstitucional() {
        return emailInstitucional;
    }
    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    
}
