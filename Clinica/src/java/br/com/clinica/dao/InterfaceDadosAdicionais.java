/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import java.util.List;
import br.com.clinica.model.DadosAdicionais;

/**
 *
 * @author Felippe
 */
interface InterfaceDadosAdicionais {
    public DadosAdicionais getDadosAdicionais(Long id_pessoa);
    public void salvar(DadosAdicionais dadosAdicionais);
    public void remover(DadosAdicionais dadosAdicionais);
    public void atualizar(DadosAdicionais dadosAdicionais);
    public List<DadosAdicionais> list();
    
}
