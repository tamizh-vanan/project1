package scripts;

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
		
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("leo@yopmail.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		
		PageFactory.initElements(driver, AppointmentsSetting.class);
		
		AppointmentsSetting.settings.click();
		AppointmentsSetting.Appointments.click();
		AppointmentsSetting.edit.click();
		AppointmentsSetting.save.click();
		
		
	}
	
}

