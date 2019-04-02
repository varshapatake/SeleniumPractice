package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TableDemo {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://toolsqa.com/automation-practice-table");
      String sRow = "1";
      String sCol = "2";
 
      String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
      System.out.println(sCellValue);
      String sRowValue = "Clock Tower Hotel";
 
     for (int i=1;i<=5;i++){
     String sValue = null;
     sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
     if(sValue.equalsIgnoreCase(sRowValue)){
 
     for (int j=1;j<=5;j++){
     String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
     System.out.println(sColumnValue);
   }
    break;
   }
   }
   driver.close();
 }
}