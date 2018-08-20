import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {
//public static void main(String[] args) throws EmailException {
//	
//	sendEmail();
//}

public static void sendEmail() throws EmailException {
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("iamanirudhas@gmail.com", "9343302723"));
	email.setSSLOnConnect(true);
	email.setFrom("iamanirudhas@gmail.com");
	email.setSubject("A TestMail from Selenium");
	email.setMsg("This is a test mail sent from selenium automation)");
	email.addTo("anirudhsrinath531@gmail.com");
	email.send();
}
}
