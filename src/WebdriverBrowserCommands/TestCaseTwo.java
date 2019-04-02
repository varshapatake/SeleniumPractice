package WebdriverBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseTwo {
	WebDriver driver;
	
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\NewSeleniumJar\\supriya_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		performCommands();
	}
	
    public void performCommands()
    {
    	String actual_url="https://www.google.com/";
    	driver.get(actual_url);
    	String url=driver.getCurrentUrl();
    	if(actual_url.equals(url))
    	{
    		System.out.println("you are on correct page");
    	}
    	else
    	{
    		System.out.println("You are not on correct page");
    	}
    	System.out.println("actual Title:"+actual_url);
    	System.out.println("your page title:"+url);
    	System.out.println(driver.getTitle());
    	System.out.println(driver.getTitle().length());
    	System.out.println(driver.getPageSource().length());
    	
    }
	public static void main(String args[])
	{
		TestCaseTwo tct=new TestCaseTwo();
		tct.luanchBrowser();
	}

}
