package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApptType {

	@FindBy (xpath="//div[text()='Appointment types']")
	public static WebElement apptType;
	
	@FindBy (xpath="//button[text()='ADD APPOINTMENT TYPE ']")
	public static WebElement addapptType;
	
	@FindBy (xpath="//input[@data-placeholder='Appointment type']")
	public static WebElement appttypename;
	
	@FindBy (xpath="//span[text()='Duration']")
	public static WebElement duration;
	
	@FindBy(xpath="//span[text()=' 15 ']")
	public static WebElement durValue;
	
	@FindBy(xpath="//input[@data-placeholder='Video appointment fee NZ$ ( incl GST )']")
	public static WebElement vidFee;
	
	@FindBy(xpath="//input[@data-placeholder='In-person fee NZ$ ( incl GST )']")
	public static WebElement phFee;
	
	@FindBy(xpath="//span[text()='Save']")
	public static WebElement save;
	
}
