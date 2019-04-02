package MiltipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		handleWindow();
	}
	public void handleWindow()
	{
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windows=driver.getWindowHandles();
		int count=windows.size();
		System.out.println("No of windows are:"+count);
		
		for(String child:windows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				WebElement email=driver.findElement(By.name("emailid"));
				email.clear();
				email.sendKeys("sdfgdfsdgf@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			    String userid= driver.findElement(By.xpath("//*[contains(text(),'User ID :')]//following-sibling::td")).getText();
			    String password=driver.findElement(By.xpath("//*[contains(text(),'Password :')]//following-sibling::td")).getText();
			    System.out.println("User Id: "+userid+"\nPassword: "+password);
			    driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title:"+driver.getTitle());
		
	}
	       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowHandler wh=new WindowHandler();
		wh.luanchBrowser();
	}

}
