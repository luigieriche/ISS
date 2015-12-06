/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.model.DadosAdicionais;
import br.com.clinica.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Felippe
 */
public class DadosAdicionaisDao implements InterfaceDadosAdicionais{

    public DadosAdicionaisDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DadosAdicionaisDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public DadosAdicionais getDadosAdicionais(Long id_pessoa) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (DadosAdicionais) ss.load(DadosAdicionais.class, id_pessoa);
    }
    
    @Override
    public void salvar(DadosAdicionais dadosAdicionais) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.save(dadosAdicionais);
        ss.getTransaction().commit();
        
    }
    
    @Override
    public void remover(DadosAdicionais dadosAdicionais) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.delete(dadosAdicionais);
        ss.getTransaction().commit();
        ss.close();
    }
    
    @Override
    public void atualizar(DadosAdicionais dadosAdicionais) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.update(dadosAdicionais);
        ss.getTransaction().commit();
        ss.close();
    }
    
    
    @Override
    public List<DadosAdicionais> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From dadosAdicionais ").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    
}
