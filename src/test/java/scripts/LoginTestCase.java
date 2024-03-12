package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.LoginPage;

public class LoginTestCase extends BaseClass{

	@Test 
	public void login() throws InterruptedException {
		
		testCase=extentReports.createTest("Provider login").log(Status.PASS, "This case is pass");
		PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("miracle@mailinator.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		LoginPage.WelcomePopup.click();
		
	}
}
 