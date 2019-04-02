package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingClassname {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		classNameLocator();
	}
	public void classNameLocator()
	{
		WebElement validate=driver.findElement(By.className("page-subheading"));
		System.out.println(validate.getText());
		driver.close();
		
		/*WebElement password=driver.findElement(By.className("is_required validate account_input form-control"));
		password.clear();
		password.sendKeys("sfhhgh");*/
		
	}
	public static void main(String args[])
	{
		LocatingUsingClassname lucn=new LocatingUsingClassname();
		lucn.luanchBrowser();
	
	}

}
