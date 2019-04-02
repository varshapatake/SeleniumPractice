package CheckBoxRadioButtonOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	WebDriver driver;
	public void luanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		selectradioButton();
	
	}
	
	public void selectradioButton() throws InterruptedException
	{
		List<WebElement> list=driver.findElements(By.name("sex"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
			if(list.get(i).getAttribute("value").equals("Male"))
			{
				list.get(i).click();
				System.out.println(list.get(i).getAttribute("value"));
			}	
		}
		
		
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadioButton rb=new RadioButton();
		rb.luanchBrowser();

	}

}
