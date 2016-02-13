
package br.com.clinica.model;

import java.util.Date;
import javax.persistence.Temporal;


public class Mensagem {

    private int idMensagem;
    private int idPaciente;
    private String titulo;
    private String mensagem;
    private String tipo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEnvio;

    public int getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getMensagem() {
    return mensagem;
    }

    public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
    }

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }
}