package MultipleSelect;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutipleOptionSelect {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		multiselect();
	}
	public void multiselect() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Select select=new Select(driver.findElement(By.name("selenium_commands")));
		System.out.println(select.isMultiple());
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.deselectByIndex(1);
		Thread.sleep(2000);
		List<WebElement> list=select.getOptions();
		for(int i=0;i<list.size();i++)
		{
			select.selectByIndex(i);
		}
		select.deselectByIndex(3);
		List<WebElement> list1=select.getAllSelectedOptions();
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getText());
		}
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MutipleOptionSelect mos=new MutipleOptionSelect();
		mos.luanchBrowser();

	}

}
