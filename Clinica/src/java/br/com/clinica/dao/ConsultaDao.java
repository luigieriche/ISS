/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.util.HibernateUtil;
import java.util.List;
import br.com.clinica.model.Consulta;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author luiz.ferreira
 */
public class ConsultaDao{

    
    public Consulta getConsulta(Long id_consulta) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Consulta) ss.load(Consulta.class, id_consulta);
    }

    
    public void salvar(Consulta consulta) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.save(consulta);
        ss.getTransaction().commit();
        //consulta = new Consulta();
        //ss.close();
        
    }

   
    public void remover(Consulta consulta) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.delete(consulta);
        ss.getTransaction().commit();
        //ss.close();
    }

    
    public void atualizar(Consulta consulta) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.update(consulta);
        ss.getTransaction().commit();
        //ss.close();
    }

    
    public List<Consulta> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From consulta").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    
}

