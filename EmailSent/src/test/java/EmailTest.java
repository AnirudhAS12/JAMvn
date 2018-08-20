import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmailTest {
  @Test
  public void sampleTest() {
	  int a=10;
	  int b=20;
	  Assert.assertEquals(a, b);
	  System.out.println("Test Done");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Test Started");
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  
	  if(result.getStatus()==ITestResult.FAILURE) {
		  SendEmailJava.sendEmail();
		  System.out.println("Email Sent");
	  }
	  
	  
	  System.out.println("Test Ended");
  }

}
