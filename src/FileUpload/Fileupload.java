package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	WebDriver driver;
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		upload();
	}
	public void upload()
	{
		WebElement file=driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\varsha_patke\\Desktop\\Resume.docx");
		WebElement check=driver.findElement(By.id("terms"));
		check.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
		System.out.println("test pass");
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fileupload fu=new Fileupload();
		fu.luanchBrowser();

	}

}
