package com.learn4earn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert_AssertAll {
	
	public static WebDriver driver;
	SoftAssert softassert;
	
	@Test (priority = 1)
	public void launchDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		softassert = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
	}
	
	@Test (priority = 2, enabled = true, dependsOnMethods = {"launchDriver"})
	public void rediffSigninLinkSoftAssert() {
		
		softassert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		softassert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		softassert.assertAll();
		
	}
	
	@Test (priority = 3, enabled = true, dependsOnMethods = {"launchDriver"})
	public void rediffUsernameSoftAssert() {
		
		softassert.assertEquals(driver.getTitle(), "Rediffmail");
		softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled());
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		softassert.assertAll();
		
	}
	
	@Test (priority = 4, enabled = true, dependsOnMethods = {"launchDriver", "rediffSigninLinkSoftAssert"})
	public void rediffPasswordSoftAssert() {
		
		softassert.assertTrue(driver.findElement(By.id("password")).isEnabled());
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		//softassert.assertAll();
		
	}
	
	@Test (priority = 5, enabled = true, dependsOnMethods = {"launchDriver", "rediffSigninLinkSoftAssert"})
	public void rediffSigninButtonSoftAssert() {
		
		softassert.assertTrue(driver.findElement(By.className("signinbtn")).isEnabled());
		driver.findElement(By.className("signinbtn")).click();
		
		//softassert.assertAll();
		
	}
	
	@Test (priority = 6, enabled = true, dependsOnMethods = {"rediffSigninButtonSoftAssert"})
	public void rediffLogoutLinkSoftAssert() throws Exception {
		
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
		driver.findElement(By.className("rd_logout")).click();
		
		//softassert.assertAll();
		
	}
	
	@Test (priority = 7, enabled = true, dependsOnMethods = {"rediffLogoutLinkSoftAssert"})
	public void rediffHomeLinkSoftAssert() throws Exception {
		
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).isEnabled());
		driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();
		
		softassert.assertAll();
		
	}

}
