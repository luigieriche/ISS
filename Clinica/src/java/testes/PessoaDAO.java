package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import hibernate.HibernateUtil;
import javax.swing.JOptionPane;
import modelo.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Luiz
 */
public class PessoaDAO {
    
    //private Session sessao;
    //private Transaction trans;
    
    public static void main(String[]args){
    //public void inserir(){
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe seu email: "));
        pessoa.setCelular(JOptionPane.showInputDialog("Informe seu Celular: "));
        pessoa.setTelefone(JOptionPane.showInputDialog("Informe seu Telefone: "));
        pessoa.setData_nascimento(JOptionPane.showInputDialog("Informe seu Data de Nascimento: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Informe seu Sexo: "));
        pessoa.setCpf(JOptionPane.showInputDialog("Informe seu CPF: "));
        pessoa.setNumero(JOptionPane.showInputDialog("Informe seu numero: "));
        pessoa.setCidade(JOptionPane.showInputDialog("Informe seu Cidade: "));
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(pessoa);
        trans.commit();
      
        /*try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.save(pessoa);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Salvar Registro!");
        }finally{
            sessao.close();
        }*/
        
        
    
    }
}
