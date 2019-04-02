package MouseEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEventDemo {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		mouseClick();
	}
	public void mouseClick()
	{
		WebElement submit=driver.findElement(By.id("SubmitLogin"));
		Actions mouse=new Actions(driver);
		Action mousehavor=mouse.moveToElement(submit).build();
		mousehavor.perform();
		System.out.println("successfully perform mouse action");
		driver.close();
	}
	public static void main(String args[])
	{
		MouseEventDemo med=new MouseEventDemo();
		med.luanchBrowser();
	}

}
