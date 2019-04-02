package Locators;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingTagName {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		tagNameLocator();
	}
	public void tagNameLocator()
	{
		
		List<WebElement> list=driver.findElements(By.tagName("input"));
		System.out.println("no of elements of input are :"+ list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("name"));
		}
		driver.close();
	}

	public static void main(String args[])
	{
		LocatingUsingTagName lutn=new LocatingUsingTagName();
		lutn.luanchBrowser();
	}
}
