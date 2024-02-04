package scripts;

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
		
		PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("leo@yopmail.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		
	}
}
