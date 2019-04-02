package TablesEleAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessTableElements {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		getTableContent();
	}
	public void getTableContent()
	{
		String value=driver.findElement(By.xpath("//table[@width='270']//tr[5]/td[1]")).getText();
		System.out.println(value);
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessTableElements ate=new AccessTableElements();
		ate.luanchBrowser();

	}

}
