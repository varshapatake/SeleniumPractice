package CheckBoxRadioButtonOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		checkbox();
	}
	
	public void checkbox()
	{
		List<WebElement> list=driver.findElements(By.name("profession"));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getAttribute("value").equals("Automation Tester"))
			{
				list.get(i).click();
				System.out.println(list.get(i).getAttribute("value") );
			}
		}
		List<WebElement> list1=driver.findElements(By.name("exp"));
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getAttribute("value").equals("3"))
			{
				list1.get(i).click();
				System.out.println("experience: "+list1.get(i).getAttribute("value")+" years");
			}
		}
		driver.close();
	}

	public static void main(String args[])
	{
		CheckBox cb=new CheckBox();
		cb.luanchBrowser();
	}
}
