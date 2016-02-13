/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author luiz.ferreira
 */
@ManagedBean
@SessionScoped
public class MensagemController {
    
     public void sendEmail()  {
         System.out.println("OOOOOOOOOOOOOOOOOOI");
         
        SimpleEmail email = new SimpleEmail();
        //Utilize o hostname do seu provedor de email
        System.out.println("alterando hostname...");
        email.setHostName("smtp.gmail.com");
        //Quando a porta utilizada não é a padrão (gmail = 465)
        email.setSmtpPort(465);
         try {
             //Adicione os destinatários
             email.addTo("luiz_paschoeto@hotmail.com", "Luiz_Henrique");
             email.setFrom("fhlluiz@gmail.com", "Luiz_Henrique");
             email.setMsg("This is a simple test of commons-email");
         } catch (EmailException ex) {
             Logger.getLogger(MensagemController.class.getName()).log(Level.SEVERE, null, ex);
         }
        //Configure o seu email do qual enviará
       
        //Adicione um assunto
        email.setSubject("Test message");
        //Adicione a mensagem do email
        
        //Para autenticar no servidor é necessário chamar os dois métodos abaixo
        System.out.println("autenticando...");
        email.setSSL(true);
        email.setAuthentication("fhlluiz@gmail.com", "864hzyw6");
        System.out.println("enviando...");
        
         try {
             email.send();
         } catch (EmailException ex) {
             Logger.getLogger(MensagemController.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println("Email enviado!");
     }
    
}
