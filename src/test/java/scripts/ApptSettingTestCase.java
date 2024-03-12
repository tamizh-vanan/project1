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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AppointmentsSetting;
import pomPages.LoginPage;

public class ApptSettingTestCase extends BaseClass{
	
	@Test 
	public void apptsetting() throws InterruptedException {
		testCase=extentReports.createTest("Verifying appointment settings").log(Status.PASS, "This case is pass");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("miracle@mailinator.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		LoginPage.WelcomePopup.click();
		
		PageFactory.initElements(driver, AppointmentsSetting.class);
		
		AppointmentsSetting.settings.click();
		AppointmentsSetting.Appointments.click();
		AppointmentsSetting.edit.click();
		Thread.sleep(2000);
		AppointmentsSetting.WFT.click();
		Thread.sleep(2000);
		AppointmentsSetting.save.click();
		
		
	}
	
}

