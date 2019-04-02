package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingId {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		idLocator();
	}
	public void idLocator() throws InterruptedException
	{
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("ffgsdhgg@gmail.com");
		
		WebElement password=driver.findElement(By.id("passwd"));
		password.clear();
		password.sendKeys("dgsdgfh");
		
		WebElement submit=driver.findElement(By.id("SubmitLogin"));
		submit.submit();
		
		Thread.sleep(1000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocatingUsingId lui=new LocatingUsingId();
		lui.luanchBrowser();

	}

}
