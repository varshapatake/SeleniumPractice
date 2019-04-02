package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCases {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\NewSeleniumJar\\supriya_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	    driver.quit();
	}
	public static void main(String args[])
	{
		FirstTestCases ftc=new FirstTestCases();
		ftc.luanchBrowser();
	}

}
