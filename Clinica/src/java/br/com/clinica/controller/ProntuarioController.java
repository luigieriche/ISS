/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;

import br.com.clinica.model.Prontuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;

/**
 *
 * @author luiz.ferreira
 */
@ManagedBean
@ViewScoped
public class ProntuarioController {
    
    private Prontuario prontuario;
    private String parametro = null;
    private String campo = null;
    private DataModel listaProntuario;

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public DataModel getListaProntuario() {
        return listaProntuario;
    }

    public void setListaProntuario(DataModel listaProntuario) {
        this.listaProntuario = listaProntuario;
    }
    
}
