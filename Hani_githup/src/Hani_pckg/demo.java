package Hani_pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class demo {
	private ChromeDriver driver;
	@BeforeTest
	  public void beforeTest() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/");
	  }
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
	  driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Bhargavi");
	  driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Gohil");
	  driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9510624318");
	  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("bhargavigohil535@gmail.com");
	  driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("Narol");
	  driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Ahmedabad");
	  driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Gujarat");
	  driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("380001");
	  Select drpCountry = new Select(driver.findElement(By.xpath("//*[@name='country']")));
	  drpCountry.selectByVisibleText("INDIA");
	  driver.findElement(By.xpath("//*[@name='email']")).sendKeys("user1@test.com");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user1");
	  driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("user1");
	  Thread.sleep(5000);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@name='submit']")).click();
	  driver.findElement(By.xpath("//*[text()=' sign-in ']")).click();
      driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("user1@test.com");
      driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user1");
      driver.findElement(By.xpath("//*[@name='submit']")).click();
      driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();
      

	
	  
	  
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
  }

}
