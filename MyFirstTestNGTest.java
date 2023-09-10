package scripts;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {

	WebDriver driver;

	@Test

	public void verifylogintoNicheThyselfisSuccessful() throws InterruptedException {
		System.out.println("I am inside loginto Niche Thyself");

		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		user.submit();

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		password.submit();

		String expectedTitleAfterLogin = "My account";
		String actualTitleAfterLogin;
		actualTitleAfterLogin = driver.getTitle();

		// * if (expectedTitleAfterLogin.equals(actualTitleAfterLogin))]
		// * System.out.println("Test case Passed!!!")
		// * System.out.println("Test case Failed!!!")

		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
	}
	// Assignment

	@Test

	public void Flipkart() throws InterruptedException {
		
		driver.get("https://www.flipkart.com/");
		

		;

		
		//3rd
	@Test

	public void verifynavigatetowikipedia() throws InterruptedException {
		driver.get("https://www.wikipedia.org/");

	}
//	}

//	 8
	@Test

	public void handlingMultipleSelect() throws InterruptedException {
	   driver.get("https://www.wikipedia.org/");
	   
	   driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Selenium");
	   
	   
	   String title=driver.getTitle();
	   
	   assert.assertEquals("Selenium-Wikipedia");
	  
	  
	    
		
   }
	// 9Assignment

	private boolean assertEquals(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void handlingCheckBox() throws InterruptedException {
		driver.get("http://www.cookbook.seleniumacademy.com/Config.html");

		driver.findElement(By.xpath("//input[@value='Diesel']")).click();

		WebElement ABS = driver.findElement(By.xpath("//input[@value='ABS']"));
		ABS.click();

	}
//				

//	   }

	// 9assignment
	@Test

	public void handlingMultiSelect() throws InterruptedException {
		driver.get("http://cookbook.seleniumacademy.com/Config.html");

		WebElement checkbox = driver.findElement(By.name("ABS"));

		driver.findElement(By.xpath("//option[@value = 'ABS']")).click();

		Thread.sleep(5000);

		driver.getTitle();

	}
	// 13Assignment

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am inside Before Method");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am inside After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am inside After Class");

	}

}
