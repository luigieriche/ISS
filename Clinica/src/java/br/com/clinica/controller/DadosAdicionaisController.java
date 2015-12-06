/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;

import br.com.clinica.dao.DadosAdicionaisDao;
//import br.com.clinica.dao.InterfaceDadosAdicionais;
import br.com.clinica.model.DadosAdicionais;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Felippe
 */
@ManagedBean
@SessionScoped
public class DadosAdicionaisController implements Serializable {
    
    private DadosAdicionais dadosAdicionais;
    private DataModel listaDadosAdicionais;
    
    public DadosAdicionais getDadosAdicionais() {
        if (this.dadosAdicionais == null){
            this.dadosAdicionais = new DadosAdicionais();
        }
        return dadosAdicionais;
    }
    
     public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
     
     
    public DataModel getListaDadosAdicionais() {
        List<DadosAdicionais> lista = new DadosAdicionaisDao().list();
        listaDadosAdicionais = new ListDataModel(lista);
        return listaDadosAdicionais;
    } 
    
    
     public void prepararCadastrarDadosAdicionais(ActionEvent actionEvent){
        dadosAdicionais = new DadosAdicionais();
    }
    
     public void prepararAlterarDadosAdicionais(ActionEvent actionEvent){
        dadosAdicionais = (DadosAdicionais)(listaDadosAdicionais.getRowData());
    }
     
    public void cadastrar(ActionEvent actionEvent){
        DadosAdicionaisDao dao = new DadosAdicionaisDao();
        dao.salvar(dadosAdicionais);
    }
    
    public void alterar(ActionEvent actionEvent){
        DadosAdicionaisDao dao = new DadosAdicionaisDao();
        dao.atualizar(dadosAdicionais);
    }
     
    public String excluir(){
          DadosAdicionais dadosAdicionais = (DadosAdicionais)(listaDadosAdicionais.getRowData());
          DadosAdicionaisDao dao = new DadosAdicionaisDao();
          dao.remover(dadosAdicionais);
          return "index";
      }

    private static class InterfaceDadosAdicionais {

        public InterfaceDadosAdicionais() {
        }
    }
       
    
}
