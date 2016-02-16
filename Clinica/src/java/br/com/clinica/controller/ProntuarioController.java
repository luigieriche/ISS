/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;

import br.com.clinica.dao.InterfaceProntuario;
import br.com.clinica.dao.ProntuarioDao;
import br.com.clinica.model.Prontuario;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz.ferreira
 */
@ManagedBean
@ViewScoped
public class ProntuarioController implements Serializable{
    
    private Prontuario prontuario;
    private String parametro = null;
    private String campo = null;
    private DataModel listaProntuario;

    public Prontuario getProntuario() {
        if (this.prontuario == null){
            this.prontuario = new Prontuario();
        }
        return prontuario;
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
    
    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }
    
     public DataModel getListaProntuarios() {
        List<Prontuario> lista = new ProntuarioDao().list();
        listaProntuario = new ListDataModel(lista);
        return listaProntuario;
    }
     
    
     public DataModel getBuscaProntuarios() {
        List<Prontuario> lista;         
        if (parametro == null || "".equals(parametro))
            {lista = new ProntuarioDao().list();}
        else
            {lista = new ProntuarioDao().busca(parametro, campo);}
        
        listaProntuario = new ListDataModel(lista);
        return listaProntuario;
    }
    
     public void prepararAlterarProntuario(ActionEvent actionEvent){
        prontuario = (Prontuario)(listaProntuario.getRowData());
    }
     
     public void adicionar(ActionEvent actionEvent){
        InterfaceProntuario dao = new ProntuarioDao();
        dao.salvar(prontuario);
        this.prontuario = new Prontuario();
    }
     
      public void alterar(ActionEvent actionEvent){
        InterfaceProntuario dao = new ProntuarioDao();
        dao.atualizar(prontuario);
        this.prontuario = new Prontuario();
    }
    
      public void excluir(){
          Prontuario prontuario = (Prontuario)(listaProntuario.getRowData());
          InterfaceProntuario dao = new ProntuarioDao();
          dao.remover(prontuario);
      }
      
      public Calendar parseData(String data) throws ParseException{
      try{
          Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(date);
          return calendar;
      }catch (ParseException e){
          throw new IllegalArgumentException(e);
        }
      }
    
}
