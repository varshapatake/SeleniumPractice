package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		handleAlert();
	}
	public void handleAlert() throws InterruptedException
	{
		WebElement id=driver.findElement(By.name("cusid"));
		id.sendKeys("34565");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HandlingAlert ha=new HandlingAlert();
		ha.luanchBrowser();
		

	}

}
