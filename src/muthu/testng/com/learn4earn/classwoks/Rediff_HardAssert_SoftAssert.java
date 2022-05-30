package com.learn4earn.classwoks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Importing another class
//import com.learn4earn.classwoks.AllAnnotations;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_HardAssert_SoftAssert {
	
	public static WebDriver driver;
	SoftAssert softassert;
	
	@Test
	public void launchDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		softassert = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");

	}
	
//	@Test
//	public void testNGValidationsHardAssert() throws Exception {
//		
//		Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
//		
//		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
//		driver.findElement(By.className("signin")).click();
//		
//		Assert.assertEquals(driver.getTitle(), "Rediffmail");
//		
//		Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled());
//		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
//		
//		Assert.assertTrue(driver.findElement(By.id("password")).isEnabled());
//		driver.findElement(By.id("password")).sendKeys("Selenium@123");
//		
//		Assert.assertTrue(driver.findElement(By.className("signinbtn")).isEnabled());
//		driver.findElement(By.className("signinbtn")).click();
//		
//		Thread.sleep(2000);
//		Assert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
//		driver.findElement(By.className("rd_logout")).click();
//		
//		Thread.sleep(2000);
//		Assert.assertTrue(driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).isEnabled());
//		driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();
//		
//	}
	
	@Test
	public void testNGValidationsSoftAssert() throws Exception {
		
		softassert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		softassert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		softassert.assertEquals(driver.getTitle(), "Rediffmail");
		
		softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled());
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		softassert.assertTrue(driver.findElement(By.id("password")).isEnabled());
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		softassert.assertTrue(driver.findElement(By.className("signinbtn")).isEnabled());
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
		driver.findElement(By.className("rd_logout")).click();
		
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).isEnabled());
		driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();
		
		softassert.assertAll();
		
	}
	
}