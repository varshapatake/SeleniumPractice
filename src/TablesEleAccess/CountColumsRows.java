package TablesEleAccess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountColumsRows {
WebDriver driver;
public void luanchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php#");
	count();
}
public void count()
{
	List<WebElement> list=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	System.out.println(list.size());
	
	List<WebElement> list1=driver.findElements(By.xpath("//table[@class='dataTable']//tr/td[5]"));
	System.out.println(list1.size());
	for(int i=0;i<list1.size();i++)
	{
		System.out.println(list1.get(i).getText());
	}
	driver.close();
}
public static void main(String args[])
{
	CountColumsRows ccr=new CountColumsRows();
	ccr.luanchBrowser();
}
}
