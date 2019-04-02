package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingName {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		nameLocator();
	}
	
	public void nameLocator() throws InterruptedException
	{
		WebElement email=driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys("dfghfjh@gmail.com");
		
		WebElement password=driver.findElement(By.name("passwd"));
		password.clear();
		password.sendKeys("esdgfgjh");
		
		WebElement submit=driver.findElement(By.name("SubmitLogin"));
		submit.submit();
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		LocatingUsingName lun=new LocatingUsingName();
		lun.luanchBrowser();
	}

}
