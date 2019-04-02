package KeybordEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEventDemo {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		keyboardEvent();
	}
	public void keyboardEvent()
	{
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("gdfh");
		Actions act = new Actions(driver);
		/*act.sendKeys(Keys.TAB).perform();
		act.sendKeys("gdfdgg").perform();
		act.sendKeys(Keys.ENTER).perform();*/
		
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.SHIFT).perform();
		act.sendKeys("gsdshdf").perform();
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("test pass");
		
		driver.quit();
		
	}
	public static void main(String args[])
	{
		 KeyboardEventDemo kwd=new  KeyboardEventDemo();
		 kwd.luanchBrowser();
	}

}
