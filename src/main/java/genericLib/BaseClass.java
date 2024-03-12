package genericLib;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports extentReports;
	public ExtentSparkReporter htmlReporter;
	public ExtentTest testCase;
	public PropertyFileData pdata=new PropertyFileData();
	public WebDriverUtilities driverutilities=new WebDriverUtilities();


	/*
	 * public void Extent() { extentReports=new ExtentReports(); htmlReporter=new
	 * ExtentSparkReporter("ExtentReport.html");
	 * extentReports.attachReporter(htmlReporter);
	 * WebDriverManager.chromedriver().setup();
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Tamilvanan\\eclipse-workspace\\MMH360\\chromedriver.exe");
	 * ChromeOptions options=new ChromeOptions(); options.
	 * setBinary("C:\\selenium\\selenium server jar\\chrome-win64 (1)\\chrome-win64\\chrome.exe"
	 * ); driver=new ChromeDriver(options);
	 * 
	 * }
	 */


	@BeforeMethod
	public void OpenApp() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tamilvanan\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.setBinary("C:\\selenium\\selenium server jar\\chrome-win64 (2)\\chrome-win64\\chrome.exe"); 
		extentReports=new ExtentReports(); 
		htmlReporter=new ExtentSparkReporter("AllTests.html");
		extentReports.attachReporter(htmlReporter);
		
		driver=new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));


	}

	@AfterMethod
	public void Extent() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.quit();
		extentReports.flush();
		Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		
		/*
		 * WebDriverManager.chromedriver().setup();
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Tamilvanan\\eclipse-workspace\\MMH360\\chromedriver.exe");
		 * ChromeOptions options=new ChromeOptions(); options.
		 * setBinary("C:\\selenium\\selenium server jar\\chrome-win64 (1)\\chrome-win64\\chrome.exe"
		 * ); driver=new ChromeDriver(options);
		 */
		

	}

}
