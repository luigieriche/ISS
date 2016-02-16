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
@Entity(name="dadosProntuario")
public class Prontuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_prontuario;
    
    private int id_paciente;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_cadastro;
    
    private String leito;
    private String diagnostico;
    private String prescricao;
    private String exames;
    
    public Prontuario (){}
    
    public Prontuario(int id_prontuario, int id_paciente, Date data_cadastro, String leito, String diagnostico, String prescricao, String exames){
        this.id_prontuario = id_prontuario;
        this.id_paciente = id_paciente;
        this.data_cadastro = data_cadastro;
        this.leito = leito;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.exames = exames;
    }


    public int getId_prontuario() {
        return id_prontuario;
    }

    public void setId_prontuario(int id_prontuario) {
        this.id_prontuario = id_prontuario;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
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
    
    

}
