package WebElementCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRegistrationForm {
	WebDriver driver;
	
	public void LuanchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		islogoPresent();
		dataEntry();
		submitForm();
	}
	public void islogoPresent()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@src='img/logo.png']"));
		Boolean status=logo.isDisplayed();
		System.out.println(logo.getTagName());
		System.out.println(logo.getText());
		if(status)
		{
			System.out.println("logo present you can proceed");
		}
	}
	
	public void dataEntry()
	{
		WebElement text=driver.findElement(By.xpath("//h3[@class='page-subheading']"));
		System.out.println(text.getCssValue("color"));
		System.out.println(text.getSize());
		System.out.println(text.getText());
		System.out.println(text.getText().length());
		System.out.println(text.getLocation());
		
		WebElement email=driver.findElement(By.name("email"));
		Boolean e_status=email.isEnabled();
		System.out.println(email.getTagName());
		if(e_status)
		{
		  email.clear();
		  email.sendKeys("varshapatake@gmail.com");
		}
				
		WebElement password=driver.findElement(By.name("passwd"));
		Boolean p_status=password.isEnabled();
		System.out.println(password.getTagName());
		if(p_status)
		{
		   password.clear();
		   password.sendKeys("123varku@1");
		}	
	}
	
	public void submitForm() throws InterruptedException
	{
		WebElement submit=driver.findElement(By.id("SubmitLogin"));
		System.out.println(submit.getTagName());
		System.out.println(submit.getText());
		
		Boolean s_status=submit.isEnabled();
		if(s_status)
		{
		submit.submit();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestRegistrationForm trf=new TestRegistrationForm();
		trf.LuanchBrowser();

	}

}
