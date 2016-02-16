/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import java.util.List;
import br.com.clinica.model.Prontuario;

/**
 *
 * @author luiz.ferreira
 */
public interface InterfaceProntuario {
    public Prontuario getProntuario(Long id_prontuario);
    public void salvar(Prontuario prontuario);
    public void remover(Prontuario prontuario);
    public void atualizar(Prontuario prontuario);
    public List<Prontuario> list();
}
