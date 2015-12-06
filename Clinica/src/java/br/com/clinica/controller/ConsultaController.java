/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;


import br.com.clinica.dao.ConsultaDao;
import br.com.clinica.model.Consulta;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;



/**
 *
 * @author luiz.ferreira
 */
@ManagedBean
@SessionScoped
public class ConsultaController implements Serializable{
    
    private Consulta consulta;
    private DataModel listaConsulta;

    public Consulta getConsulta() {
        if (this.consulta == null){
            this.consulta = new Consulta();
        }
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public DataModel getListaConsulta() {
        List<Consulta> lista = new ConsultaDao().list();
        listaConsulta = new ListDataModel(lista);
        return listaConsulta;
    }
    
    public void prepararAdicionarConsulta(ActionEvent actionEvent){
        consulta = new Consulta();
    }
    
     public void prepararAlterarConsulta(ActionEvent actionEvent){
        consulta = (Consulta)(listaConsulta.getRowData());
    }
     
     public void adicionar(ActionEvent actionEvent){
        ConsultaDao dao = new ConsultaDao();
        dao.salvar(consulta);
    }
     
      public void alterar(ActionEvent actionEvent){
        ConsultaDao dao = new ConsultaDao();
        dao.atualizar(consulta);
    }
      
      
    
      public String excluir(){
          Consulta consulta = (Consulta)(listaConsulta.getRowData());
          ConsultaDao dao = new ConsultaDao();
          dao.remover(consulta);
          return "index";
      }
}
