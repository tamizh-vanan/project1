package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointmentsSetting {

	@FindBy (xpath="//span[text()='Settings']")
	public static WebElement settings; 
	
	@FindBy (xpath="(//span[text()='Appointments'])[2]")
	public static WebElement Appointments;
	
	@FindBy (xpath="//span[text()=' Edit']")
	public static WebElement edit;
	
	@FindBy (xpath="//span[text()='Based on appointment type']")
	public static WebElement WFT;
	
	@FindBy (xpath="//button[text()=' Save']")
	public static WebElement save;
}
