package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDown {
	WebDriver driver;
	
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		listOutDropDown();
	}
	public void listOutDropDown()
	{
		/*List<WebElement> list=driver.findElements(By.name("continents"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		Select select =new Select(driver.findElement(By.name("continents")));
		System.out.println(select.isMultiple());
		List<WebElement> list=select.getOptions();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDropDown pdd=new PrintDropDown();
		pdd.luanchBrowser();
	}

}
