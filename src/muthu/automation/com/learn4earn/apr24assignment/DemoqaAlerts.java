package com.learn4earn.apr24assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoqaAlerts {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver;  // if we want to declare WebDriver object inside main method public static keywords are not allowed
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demoqa.com");
		driver.get("https://demoqa.com/alertsWindows");
		Thread.sleep(2000);
		
		// Not working due to the permanent ad overlay
		
		// div.category-cards > div:nth-of-type(3)

		
//		driver.findElement(By.cssSelector("div.category-cards > div:nth-of-type(3)")).click();
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.accordion>div:nth-of-type(3)>div>ul>li:nth-child(2)")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button#alertButton")).click();
//		Thread.sleep(2000);

	}

}
