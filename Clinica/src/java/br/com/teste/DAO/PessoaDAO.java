/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.DAO;

import br.com.teste.models.Pessoa;
import java.util.List;

/**
 *
 * @author luiz.ferreira
 */
public interface PessoaDAO {
    
    public void save(Pessoa pessoa);
    public Pessoa getPessoa(long id);
    public List<Pessoa> list();
    public void remove(Pessoa pessoa);
    public void update(Pessoa pessoa);
   
}
