package scripts;


import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.BookAppt;
import pomPages.LoginPage;

public class BookAppointmentTestCase extends BaseClass{

	@Test
	public void bookAppointment() throws InterruptedException {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("leo@yopmail.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		
		driverutilities.switchTabs(driver);
		driver.get("https://uatwebmmh360.mmh-demo.com/pages/patientAppointment/patient-home/d767b744-4598-4579-8aa6-a28207b60692/pca");
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, BookAppt.class);
		Thread.sleep(2000);
		BookAppt.apptTypeBtn.click();
		BookAppt.apptTypeOption.click();
		driverutilities.scrollBar(driver);
		Thread.sleep(2000);
		BookAppt.nextava.click();
		BookAppt.slot.click();
		BookAppt.firstName.sendKeys("fNanme");
		BookAppt.lastName.sendKeys("lNmae");
		BookAppt.dobCalendar.click();
		BookAppt.dobOption.click();
		BookAppt.nhi.sendKeys("BSI1245");
		BookAppt.gender.click();
		BookAppt.genderOption.click();
		BookAppt.email.sendKeys("TAMIL@YOPMAIL.COM");
		BookAppt.confirmEmail.sendKeys("TAMIL@YOPMAIL.COM");
		BookAppt.mobile.sendKeys("8524789632");
		Thread.sleep(2000);
		driverutilities.scrollBar(driver);
		Thread.sleep(2000);
		BookAppt.paymentBtn.click();
		BookAppt.checkbox.click();
		BookAppt.click.click();
		
	}
}
