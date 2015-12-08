/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;


import br.com.clinica.dao.UsuarioDao;
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
        List<Usuario> lista = new UsuarioDao().list();
        listaUsuario = new ListDataModel(lista);
        return listaUsuario;
    }
    
    public String ValidaUsuairo(){
        Usuario validador = new Usuario();
     
          List<Usuario> lista = new UsuarioDao().list();
        int encontrou = -1;
          
        for (int i=0;i<lista.size();i++){
            validador = lista.get(i);
            
            if (validador.getUsuario().equals(usuario.getUsuario()) && validador.getSenha().equals(usuario.getSenha()))                  
             encontrou = i;
        }
        
       return "menu";
    }
}
