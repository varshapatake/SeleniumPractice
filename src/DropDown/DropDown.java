package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dropdown();
	}
	public void dropdown() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Select select=new Select(driver.findElement(By.id("continents")));
	    select.selectByIndex(1);
		System.out.println("you select "+select.getFirstSelectedOption().getAttribute("value"));
	    Thread.sleep(3000);
		driver.close();
	}
	public static void main(String args[]) throws InterruptedException
	{
		DropDown dd=new DropDown();
		dd.luanchBrowser();
	}

}
