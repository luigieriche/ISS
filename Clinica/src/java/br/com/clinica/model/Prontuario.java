/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author luiz.ferreira
 */
@Entity(name="prontuario")
public class Prontuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_prontuario;
    private Long id_paciente;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_cadastro;
    
    private String leito;
    private String diagnostico;
    private String prescricao;
    private String exames;
    
    public Prontuario (){
    }
    
    public Prontuario(Long id_prontuario, Long id_paciente, Date data_cadastro, String leito, String diagnostico, String prescricao, String exames){
        this.id_prontuario = id_prontuario;
        this.id_paciente = id_paciente;
        this.data_cadastro = data_cadastro;
        this.leito = leito;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.exames = exames;
    }

    public Long getId_prontuario() {
        return id_prontuario;
    }

    public void setId_prontuario(Long id_prontuario) {
        this.id_prontuario = id_prontuario;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_prontuario != null ? id_prontuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prontuario)) {
            return false;
        }
        Prontuario other = (Prontuario) object;
        if ((this.id_prontuario == null && other.id_prontuario != null) || (this.id_prontuario != null && !this.id_prontuario.equals(other.id_prontuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pessoa[ id_prontuario=" + id_prontuario + " ]";
    }

}
