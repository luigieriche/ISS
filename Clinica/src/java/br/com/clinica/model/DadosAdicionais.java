/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Felippe
 */
@Entity(name="dadosAdicionais")
public class DadosAdicionais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pessoa;
    private String fuma;
    private String bebe;
    private String colesterol;
    private String doenca_cardiaca;
    private String cirurgias;
    private String alergias;
    private String convenio;
    
    public DadosAdicionais() {
    }

    public DadosAdicionais(Long id_pessoa, String fuma, String bebe, String colesterol, String doenca_cardiaca, 
                            String cirurgias, String alergias, String convenio) {
        
        this.id_pessoa = id_pessoa;
        this.fuma = fuma;
        this.bebe = bebe;
        this.colesterol = colesterol;
        this.doenca_cardiaca = doenca_cardiaca;
        this.cirurgias = cirurgias;
        this.alergias = alergias;
        this.convenio = convenio;
    }
    
    public Long getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    
    public String getFuma() {
        return fuma;
    }
    
    public void setFuma(String fuma) {
        this.fuma = fuma;
    }
    
    public String getBebe() {
        return bebe;
    }
    
     public void setBebe(String bebe) {
        this.bebe = bebe;
    }
    
    public String getColesterol() {
        return colesterol;
    }
    
     public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }
    
    public String getDoenca_cardiaca() {
        return doenca_cardiaca;
    }
    
     public void setDoenca_cardiaca(String doenca_cardiaca) {
        this.doenca_cardiaca = doenca_cardiaca;
    }
    
    public String getCirurgias() {
        return cirurgias;
    }
    
     public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }
    
    public String getAlergias() {
        return alergias;
    }
    
     public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    public String getConvenio() {
        return convenio;
    }
    
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_pessoa != null ? id_pessoa.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DadosAdicionais)) {
            return false;
        }
        DadosAdicionais other = (DadosAdicionais) object;
        if ((this.id_pessoa == null && other.id_pessoa != null) || (this.id_pessoa != null && !this.id_pessoa.equals(other.id_pessoa))) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "modelo.DadosAdicionais[ id_pessoa=" + id_pessoa + " ]";
    }   
    
}