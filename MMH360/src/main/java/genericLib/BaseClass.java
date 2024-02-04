package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public PropertyFileData pdata=new PropertyFileData();
	public WebDriverUtilities driverutilities=new WebDriverUtilities();
	
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamilvanan\\eclipse-workspace\\MMH360\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\selenium\\selenium server jar\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void CloseApp() {
		//driver.quit();
		
	}
	
	
	
	
}
