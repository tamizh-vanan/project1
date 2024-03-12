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
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AppointmentsSetting;
import pomPages.LoginPage;
import pomPages.PaymentSetting;

public class PaymentTestCase extends BaseClass{

	@Test 
	public void payment() throws InterruptedException {
		
        testCase=extentReports.createTest("Creating Payment setting");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("miracle@mailinator.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		LoginPage.WelcomePopup.click();
		
        PageFactory.initElements(driver, AppointmentsSetting.class);
		AppointmentsSetting.settings.click();
		AppointmentsSetting.Appointments.click();
		
		PageFactory.initElements(driver, PaymentSetting.class);
		PaymentSetting.paymentBtn.click();
		Thread.sleep(2000);
		PaymentSetting.edit.click();
		PaymentSetting.option.click();
		PaymentSetting.save.click();
		
	}
}
