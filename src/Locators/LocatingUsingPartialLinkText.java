package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingPartialLinkText {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		linkText();
	}
	public void linkText()
	{
		driver.findElement(By.partialLinkText("click")).click();
		System.out.println("successful");
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatingUsingLinkText lult=new LocatingUsingLinkText();
		lult.luanchBrowser();
	}
}
