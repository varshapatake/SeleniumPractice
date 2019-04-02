package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFour {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\NewSeleniumJar\\supriya_jar\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/personal/");
		operationOnElementsClick();
	}
	
	public void operationOnElementsClick() throws InterruptedException
	{
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Corporate Banking - Home')]"));
		element.click();
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		TestCaseFour tcf=new TestCaseFour();
		tcf.luanchBrowser();
	}

}
