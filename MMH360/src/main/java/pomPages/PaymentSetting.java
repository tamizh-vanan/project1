package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentSetting {

	@FindBy (xpath="//div[text()='payments']")
	public static WebElement paymentBtn;
	
	@FindBy (xpath="//span[text()=' Edit']")
	public static WebElement edit;
	
	@FindBy(xpath="//div[text()='Pay during the call or pay at the time of booking ']")
	public static WebElement option;
	
	@FindBy(xpath="//button[text()=' Save']")
	public static WebElement save;
}
