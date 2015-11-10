/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.teste.models.Pessoa;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author luiz.ferreira
 */
public class FilmHelper {
    
    Session session = null;
    
    public FilmHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getFilmTitles() {
    List<Pessoa> PessoaList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Pessoa");
        PessoaList = (List<Pessoa>) q.list();
    } catch (Exception e) {
    }
    return PessoaList;
}
    
}
