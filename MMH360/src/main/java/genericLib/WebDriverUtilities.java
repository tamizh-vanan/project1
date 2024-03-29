package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void SwitchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alterpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void scrollBar(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy("+x+","+y+")");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
		//js.executeScript("window.scrollBy(0,1000)");
	}
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);	
			
			}
		}
}
