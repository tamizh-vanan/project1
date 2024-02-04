package scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AppointmentsSetting;
import pomPages.LoginPage;
import pomPages.SchedulerSetting;

public class CreateSchedulerTestCase extends BaseClass{
@Test
	public void schedule() throws InterruptedException {
	PageFactory.initElements(driver, LoginPage.class);
	LoginPage.signInBtn.click();
	LoginPage.Email.sendKeys("leo@yopmail.com");
	LoginPage.Password.sendKeys("Welcome@123");
	LoginPage.LoginBtn.click();
	
    PageFactory.initElements(driver, AppointmentsSetting.class);
	AppointmentsSetting.settings.click();
	
	PageFactory.initElements(driver, SchedulerSetting.class);
	SchedulerSetting.schedule.click();
	SchedulerSetting.createSchedule.click();
	SchedulerSetting.fromCalendar.click();
	SchedulerSetting.nextbtn.click();
	SchedulerSetting.fromDate.click();
	SchedulerSetting.ToCalendar.click();
	SchedulerSetting.nextbtn1.click();
	SchedulerSetting.toDate.click();
	SchedulerSetting.selectAll.click();
	Thread.sleep(2000);
	SchedulerSetting.sessionName.sendKeys("morning session");
	SchedulerSetting.startTime.click();
	SchedulerSetting.startOption.click();
	SchedulerSetting.endTime.click();
	SchedulerSetting.endOption.click();
	SchedulerSetting.appttype.click();
	SchedulerSetting.apptOption.click();
	SchedulerSetting.addSlot.click();
	Thread.sleep(2000);
	SchedulerSetting.confirmBtn.click();
	SchedulerSetting.yesBtn.click();
	
	
		
	}
	
}
