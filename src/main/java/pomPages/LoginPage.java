package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy (xpath="(//span[text()='Sign in'])[2]")
	public static WebElement signInBtn;

	@FindBy (xpath="//input[@type='email']")
	public static WebElement Email;
	
	
	@FindBy (xpath="//input[@type='password']")
	public static WebElement Password;
	
	
	@FindBy (xpath="//button[@type='submit']")
	public static WebElement LoginBtn;
	
	@FindBy (xpath="(//img[@alt='eyeoutline'])[2]")
	public static WebElement WelcomePopup;
}
