package scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AppointmentsSetting;
import pomPages.LoginPage;
import pomPages.PaymentSetting;

public class PaymentTestCase extends BaseClass{

	@Test
	public void payment() throws InterruptedException {
		

		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("leo@yopmail.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		
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
