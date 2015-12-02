/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.util.HibernateUtil;
import java.util.List;
import br.com.clinica.model.Pessoa;
import org.hibernate.Session;

/**
 *
 * @author luiz.ferreira
 */
public class PessoaDao implements InterfacePessoa{

    @Override
    public Pessoa getPessoa(Long id_pessoa) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Pessoa) ss.load(Pessoa.class, id_pessoa);
    }

    @Override
    public void salvar(Pessoa pessoa) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.save(pessoa);
        ss.getTransaction().commit();
        //ss.close();
        
    }

    @Override
    public void remover(Pessoa pessoa) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.delete(pessoa);
        ss.getTransaction().commit();
        ss.close();
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.update(pessoa);
        ss.getTransaction().commit();
        ss.close();
    }

    @Override
    public List<Pessoa> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From pessoa ").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    
}
