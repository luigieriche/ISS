/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.model.Prontuario;
import br.com.clinica.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author luiz.ferreira
 */
public class ProntuarioDao {
 
    public Prontuario getPessoa(Long id_prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Prontuario) ss.load(Prontuario.class, id_prontuario);
    }

    public void salvar(Prontuario prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            ss.beginTransaction();
            try {
                ss.save(prontuario);
                ss.getTransaction().commit();
            } catch (Exception ex) {
                // Log the exception here
                ss.getTransaction().rollback();
                throw ex;
            }
        } finally {
            HibernateUtil.getSessionFactory().getCurrentSession().close();

        }
        prontuario = new Prontuario();
    }

    public void remover(Prontuario prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        
         try {
            ss.beginTransaction();
            try {
                ss.delete(prontuario);
                ss.getTransaction().commit();
            } catch (Exception ex) {
                // Log the exception here
                ss.getTransaction().rollback();
                throw ex;
            }
        } finally {
            HibernateUtil.getSessionFactory().getCurrentSession().close();

        }
    }

    public void atualizar(Prontuario prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            ss.beginTransaction();
            try {
                ss.update(prontuario);
                ss.getTransaction().commit();
            } catch (Exception ex) {
                
                ss.getTransaction().rollback();
                throw ex;
            }
        } finally {
            HibernateUtil.getSessionFactory().getCurrentSession().close();
        }

    }

    public List<Prontuario> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From prontuario ").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    public List<Prontuario> busca(String nome, String campo) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From prontuario p where p." + campo +" = '" + nome + "'").list();
        ss.getTransaction().commit();
        //ss.close();
        return lista;
        
    }
    
    
}
    

