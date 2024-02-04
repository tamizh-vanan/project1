package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulerSetting {

	
	@FindBy(xpath="//span[text()='Schedule list']")
	public static WebElement schedule;
	
	@FindBy (xpath="//button[text()=' Create Appointment Schedule']")
	public static WebElement createSchedule;
	
	@FindBy (xpath="(//button[@aria-label='Open calendar'])[1]")
	public static WebElement fromCalendar;
	
	@FindBy(xpath="//button[@aria-label='Next month']")
	public static WebElement nextbtn;
	
	@FindBy (xpath="//div[text()=' 1 ']")
	public static WebElement fromDate;
	
	@FindBy (xpath="(//button[@aria-label='Open calendar'])[3]")
	public static WebElement ToCalendar;
	
	@FindBy(xpath="//button[@aria-label='Next month']")
	public static WebElement nextbtn1;
	
	@FindBy (xpath="//div[text()=' 29 ']")
	public static WebElement toDate;
	
	@FindBy (xpath="//span[text()=' Select all']")
	public static WebElement selectAll;
	
	@FindBy (xpath="//input[@data-placeholder='Session name']")
	public static WebElement sessionName;
	
	@FindBy (xpath="(//span[text()='Start time'])[1]")
	public static WebElement startTime;
	
	@FindBy (xpath="//span[text()=' 1:00 AM ']")
	public static WebElement startOption;
	
	@FindBy(xpath="(//span[text()='End time'])[1]")
	public static WebElement endTime;
	
	@FindBy (xpath="//span[text()=' 9:00 PM ']")
	public static WebElement endOption;
	
	@FindBy (xpath="(//span[text()='Appointment type'])[1]")
	public static WebElement appttype;
	
	@FindBy (xpath="//span[text()=' diagnosis ']")
	public static WebElement apptOption;
	
	@FindBy (xpath="(//button[text()=' Add slot'])[1]")
	public static WebElement addSlot;
	
	@FindBy (xpath="//span[text()=' Confirm ']")
	public static WebElement confirmBtn;
	
	@FindBy (xpath="//button[text()='Yes']")
	public static WebElement yesBtn;
	
}
