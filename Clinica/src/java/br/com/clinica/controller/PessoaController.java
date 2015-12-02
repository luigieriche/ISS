/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;

import br.com.clinica.dao.InterfacePessoa;
import br.com.clinica.dao.PessoaDao;
import br.com.clinica.model.Pessoa;
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
public class PessoaController implements Serializable{
    
    private Pessoa pessoa;
    private DataModel listaPessoa;

    public Pessoa getPessoa() {
        if (this.pessoa == null){
            this.pessoa = new Pessoa();
        }
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public DataModel getListaPessoas() {
        List<Pessoa> lista = new PessoaDao().list();
        listaPessoa = new ListDataModel(lista);
        return listaPessoa;
    }
    
    public void prepararAdicionarPessoa(ActionEvent actionEvent){
        pessoa = new Pessoa();
    }
    
     public void prepararAlterarPessoa(ActionEvent actionEvent){
        pessoa = (Pessoa)(listaPessoa.getRowData());
    }
     
     public void adicionar(ActionEvent actionEvent){
        InterfacePessoa dao = new PessoaDao();
        dao.salvar(pessoa);
    }
     
      public void alterar(ActionEvent actionEvent){
        InterfacePessoa dao = new PessoaDao();
        dao.atualizar(pessoa);
    }
    
      public String excluir(){
          Pessoa pessoa = (Pessoa)(listaPessoa.getRowData());
          InterfacePessoa dao = new PessoaDao();
          dao.remover(pessoa);
          return "index";
      }
}
