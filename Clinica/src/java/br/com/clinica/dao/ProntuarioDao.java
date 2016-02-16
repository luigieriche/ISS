/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.util.HibernateUtil;
import br.com.clinica.model.Prontuario;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author luiz.ferreira
 */
public class ProntuarioDao implements InterfaceProntuario{
 
    @Override
    public Prontuario getProntuario(Long id_prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Prontuario) ss.load(Prontuario.class, id_prontuario);
    }

    @Override
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
    }

    @Override
    public void remover(Prontuario prontuario) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        
         try {
            System.out.println("Entoru Try");
            ss.beginTransaction();
            try {
                 System.out.println("Entoru delete");
                ss.delete(prontuario);
                 System.out.println("Entoru Commit");
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

    @Override
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

    
    @Override
    public List<Prontuario> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From prontuario ").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    public List<Prontuario> busca(String nome, String campo) {
         System.out.println("Entrou Busca");
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From prontuario p where p." + campo +" = '" + nome + "'").list();
        ss.getTransaction().commit();
        //ss.close();
        return lista;
        
    }

   
 
    
}
    

