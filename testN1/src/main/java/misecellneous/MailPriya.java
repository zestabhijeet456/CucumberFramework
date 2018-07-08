package misecellneous;

import java.util.Properties;
/*
 * <!-- https://mvnrepository.com/artifact/javax.mail/mail -->
<dependency>
    <groupId>javax.mail</groupId>
    <artifactId>mail</artifactId>
    <version>1.4.7</version>
</dependency>

 */
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailPriya  
{  
 public static void main(String [] args){  
      String to = "priyasaha35@gmail.com";//change accordingly  
      String from = "priyasaha25@gmail.com";//change accordingly  
      String host = "smtp.gmail.com";//or IP address  
  
     //Get the session object  
      Properties props = System.getProperties();  
      props.setProperty("mail.smtp.host", host);  
      props.put("mail.smtp.auth", "true"); 
      props.put("mail.smtp.port", "465");  
      props.put("mail.debug", "true");  
      props.put("mail.smtp.socketFactory.port", "465");  
      props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
      props.put("mail.smtp.socketFactory.fallback", "false"); 
      Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {  
          protected PasswordAuthentication getPasswordAuthentication() {  
        	    return new PasswordAuthentication("priyasaha25@gmail.com","lionking12389");  
        	      }  
        	    });  
  
     //compose the message  
      try{  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Ping");  
         message.setText("Hello, this is example of sending email  ");  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}  
   }  
}  