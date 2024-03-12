package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	
	@FindBy(id="mat-input-0")
	public static WebElement firstName;
	
	@FindBy(id="mat-input-1")
	public static WebElement lastName;
	@FindBy(xpath ="//input[@data-placeholder='Email address']")
	public static WebElement email;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	public static WebElement password;
	@FindBy(xpath="//input[@id='mat-input-4']")
	public static WebElement confirmPassword;
	
	@FindBy(xpath="//input[@type='number']")
	public static WebElement MobileNo;
	
	@FindBy(xpath="//span[text()='Speciality']")
	public static WebElement speciality;
	
	@FindBy(xpath="//mat-option[@id='mat-option-6']")
	public static WebElement specialityOption;
	
	@FindBy(xpath="//input[@id='mat-input-6']")
	public static WebElement clinicName;
	
	@FindBy(xpath="//*[@id=\'mat-checkbox-1\']/label/div")
	public static WebElement checkBox;
	
	@FindBy(xpath="//span[@role='checkbox']")
	public static WebElement robot;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	public static WebElement registerbtn;
}







