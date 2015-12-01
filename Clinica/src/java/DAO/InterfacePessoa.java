/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author luiz.ferreira
 */
public class InterfacePessoa {
    public Pessoa getPessoa(Long id_pessoa){return null;};
    public void salvar(Pessoa pessoa){}
    public void remover(Pessoa pessoa){}
    public void atualizar(Pessoa pessoa){}
    public List<Pessoa> list(){return null;};
}
