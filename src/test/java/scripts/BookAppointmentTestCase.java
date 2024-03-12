package scripts;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.BookAppt;
import pomPages.LoginPage;

public class BookAppointmentTestCase extends BaseClass{

	@Test 
	public void bookAppointment() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		testCase=extentReports.createTest("Patient Booking appointment");
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, BookAppt.class);
		LoginPage.signInBtn.click();
		LoginPage.Email.sendKeys("miracle@mailinator.com");
		LoginPage.Password.sendKeys("Welcome@123");
		LoginPage.LoginBtn.click();
		LoginPage.WelcomePopup.click();
		BookAppt.BookapptCopy.click();
		
		String copy = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		  System.out.println(copy);
		  
		driverutilities.switchTabs(driver);
		driver.get(copy);
		
		
		
		
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
