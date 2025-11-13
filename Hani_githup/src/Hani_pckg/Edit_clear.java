package Hani_pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Edit_clear {
	public WebDriver driver;
	 @BeforeTest
 public void beforeTest() {
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoqa.com/webtables ");
	  }
  @Test
  public void f() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id='addNewRecordButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Bhargavi");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Gohil");
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("bhargavigohil535@gmail.com");
		driver.findElement(By.xpath("//*[@id='age']")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("30000");
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("QA");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='edit-record-4']")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).clear();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Hani");
		driver.findElement(By.xpath("//*[@id='lastName']")).clear();
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Parmar");
		driver.findElement(By.xpath("//*[@id='userEmail']")).clear();
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("haniparmar505@gmail.com");
		driver.findElement(By.xpath("//*[@id='age']")).clear();
		driver.findElement(By.xpath("//*[@id='age']")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id='salary']")).clear();
		driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("25000");
		driver.findElement(By.xpath("//*[@id='department']")).clear();
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("QA");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		driver.findElement(By.xpath("//*[@id='delete-record-4']")).click();
	
  }
 

  @AfterTest
  public void afterTest() {
  }

}
