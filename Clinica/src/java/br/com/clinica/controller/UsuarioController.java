/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;


import br.com.clinica.dao.UsuarioDao;
import br.com.clinica.model.Pessoa;
import br.com.clinica.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;


/**
 *
 * @author Luiz
 */
@ManagedBean
@SessionScoped
public class UsuarioController implements Serializable{
    
    private Usuario usuario;
    private DataModel listaUsuario;
    
    public Usuario getUsuario() {
      if (this.usuario == null){
          this.usuario = new Usuario();
      }
      return usuario;
    }
    
    public DataModel getListaUsuario() {
        List<usuario> lista = new UsuarioDao().list();
        listaUsuario = new ListDataModel(lista);
        return listaUsuario;
    }
}
