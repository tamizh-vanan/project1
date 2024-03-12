package scripts;

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
import pomPages.AppointmentsSetting;
import pomPages.ApptType;
import pomPages.LoginPage;

public class ApptTypeTestCase extends BaseClass{

	@Test 
	public void appttype() {
		testCase=extentReports.createTest("Creating Appointment type");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("miracle@mailinator.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		LoginPage.WelcomePopup.click();
		
        PageFactory.initElements(driver, AppointmentsSetting.class);
		AppointmentsSetting.settings.click();
		AppointmentsSetting.Appointments.click();
		
		PageFactory.initElements(driver, ApptType.class);
		ApptType.apptType.click();
		ApptType.addapptType.click();
		ApptType.appttypename.sendKeys("diagnosis");
		ApptType.duration.click();
		ApptType.durValue.click();
		ApptType.vidFee.sendKeys("1");
		//ApptType.phFee.sendKeys("2");
		ApptType.save.click();
		
		
		
		
		
		
		
	}
}
