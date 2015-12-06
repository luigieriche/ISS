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
 * @author LuizHenrique
 */
@Entity(name="consulta")
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_consulta;
    private Long id_paciente;
    private Long id_usuario;
    private String data_consulta;
    private String sintomas;
    private String diagnostico;
    private String status;
    private String receita;

    public Long getId() {
        return id_consulta;
    }

    public void setId(Long id) {
        this.id_consulta = id;
    }

    public Long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_consulta != null ? id_consulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.id_consulta == null && other.id_consulta != null) || (this.id_consulta != null && !this.id_consulta.equals(other.id_consulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.clinica.model.Consulta[ id=" + id_consulta + " ]";
    }

    public Consulta() {
    }

    public Consulta(Long id_paciente, Long id_usuario, String data_consulta, String sintomas, String diagnostico, String status, String receita) {
        this.id_paciente = id_paciente;
        this.id_usuario = id_usuario;
        this.data_consulta = data_consulta;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.status = status;
        this.receita = receita;
    }
    
}
