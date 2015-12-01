package br.com.clinica.testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import br.com.clinica.dao.InterfacePessoa;
import br.com.clinica.dao.PessoaDao;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Luiz
 */
public class teste {
    
    //private Session sessao;
    //private Transaction trans;
    
    public static void main(String[]args){
   
        List<Pessoa> lista = new PessoaDao().list();
        String rec = "";
        for (Pessoa pessoa : lista){
            rec = rec + "\n Nome: " + pessoa.getNome() + " Email " + pessoa.getEmail() + " Telefone " + 
                    pessoa.getCelular();
        }
        JOptionPane.showMessageDialog(null, rec);

    }
}
