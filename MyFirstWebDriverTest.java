package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          WebDriver driver = new FirefoxDriver(); 
          
          driver.manage().window().maximize();
          
          driver.get("https://nichethyself.com/tourism/home.html");
          
        WebElement user = driver.findElement(By.name("username"));
          user.sendKeys("stc123");
          WebElement password = driver.findElement(By.name("password"));
          password.sendKeys("12345");
          user.submit();
          
        driver.getTitle();
        
        WebDriver driver1;
        

          driver1  = new FirefoxDriver();
	}
}
	
          
         
        





	       
