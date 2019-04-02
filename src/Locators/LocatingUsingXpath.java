package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingXpath {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		xpathLocator();
	}
	public void xpathLocator()
	{
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("dfsfghjg@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
		password.clear();
		password.sendKeys("fsfsdg24235");
		WebElement submit=driver.findElement(By.xpath("//button[@id='SubmitLogin']//span"));
		submit.submit();
		driver.close();
		System.out.println("Test pass");
		
	}
	public static void main(String args[])
	{
		LocatingUsingXpath lux=new LocatingUsingXpath();
		lux.luanchBrowser();
		
	}

}
