package com.learn4earn.headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Options_Example {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		
		//options.addArguments("headless");
		//options.addArguments("start-maximized");
		
		// PageLoadStrategy
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); // All these 3 lines of code is so fast which leads to unable to find element 'signin'
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setHeadless(true);
		
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new FirefoxDriver(options);
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
