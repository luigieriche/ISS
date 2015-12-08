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
 * @author luiz.davantel
 */
public class UsuarioDao{

    @Override
    public List<Pessoa> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From usuario ").list();
        ss.getTransaction().commit();
        return lista;
    }
    
    
}
