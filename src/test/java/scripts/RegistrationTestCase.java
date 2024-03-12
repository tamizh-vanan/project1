package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilities;
import pomPages.Registration;

public class RegistrationTestCase  extends BaseClass{
	
	@Test 
	
	public void register() throws InterruptedException {
		testCase=extentReports.createTest("Provider Registration");
		PageFactory.initElements(driver, Registration.class);
		
		
		Registration.firstName.sendKeys("tamilvanan");
		Registration.lastName.sendKeys("vanann");
		Registration.email.click();
		Registration.email.sendKeys("arcoldd@yopmail.com");
		Registration.password.sendKeys("Welcome@123");
		Registration.confirmPassword.sendKeys("Welcome@123");
		Registration.MobileNo.sendKeys("789512354");
		Thread.sleep(5000);
		driverutilities.scrollBar(driver);
		Thread.sleep(3000);
		Registration.speciality.click();
		Registration.specialityOption.click();
		Registration.clinicName.sendKeys("root clinic");
		Thread.sleep(2000);
		Registration.checkBox.click();
		driverutilities.switchframe(driver);
		Registration.robot.click();
		
		
	
		
	}

}
