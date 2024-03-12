package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAppt {
	
	@FindBy (xpath="(//img[@alt='copylink'])[2]")
	public static WebElement BookapptCopy;

	@FindBy (xpath="//span[text()='Appointment type']")
	public static WebElement apptTypeBtn;
	
	@FindBy (xpath="//mat-option[@id='mat-option-1']")
	public static WebElement apptTypeOption;
	
	@FindBy (xpath="(//span[text()='Next available: Thursday, 8 Feb'])[1]")
	public static WebElement nextava;
	
	@FindBy (xpath="(//mat-chip[text()=' 01:30 AM '])[1]")
	public static WebElement slot;
	
	@FindBy (xpath="//input[@data-placeholder='First name']")
	public static WebElement firstName;
	
	@FindBy (xpath="//input[@data-placeholder='Last name']")
	public static WebElement lastName;
	
	@FindBy (xpath="(//button[@aria-label='Open calendar'])[1]")
	public static WebElement dobCalendar;
	
	@FindBy (xpath="//div[text()=' 02 ']")
	public static WebElement dobOption;
	
	@FindBy (xpath="//input[@formcontrolname='nhiId']")
	public static WebElement nhi;
	
	@FindBy (xpath="//span[text()='Gender']")
	public static WebElement gender;
	
	@FindBy (xpath="//span[text()=' Male ']")
	public static WebElement genderOption;
	
	@FindBy (xpath="//input[@data-placeholder='Email address']")
	public static WebElement email;
	
	@FindBy (xpath="//input[@data-placeholder='Confirm email address']")
	public static WebElement confirmEmail;
	
	@FindBy (xpath="//input[@data-placeholder='Mobile number']")
	public static WebElement mobile;
	
	@FindBy (xpath="(//button[text()='Proceed to payment'])[1]")
	public static WebElement paymentBtn;
	
	@FindBy (xpath="//mat-checkbox[@id='mat-checkbox-2']")
	public static WebElement checkbox;
	
	@FindBy (xpath="(//span[text()='CONFIRM'])[1]")
	public static WebElement click;
	
	
	
}
