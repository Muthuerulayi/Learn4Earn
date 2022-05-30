package com.learn4earn.apr24assignment;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemoqaAdBlocked {
	
	public static WebDriver driver;
	public static Alert alert;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		// Chrome Browser AdBlock
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\muthu\\Desktop\\Selenium\\CRX_AdBlock\\extension_4_46_0_0.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		
		// Don't know how to switch to previous browser tab to see the actions happening.
		
		// following xpath locator is not working. Only the cssSelector works.
		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		
		// Alert Window
		driver.findElement(By.cssSelector("div.category-cards > div:nth-of-type(3)")).click();
		
		//Alert Link
		driver.findElement(By.cssSelector("div.accordion>div:nth-of-type(3)>div>ul>li:nth-child(2)")).click();
		
		// Alert Box
		driver.findElement(By.cssSelector("button#alertButton")).click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		// Timer Alert Box
		driver.findElement(By.cssSelector("button[id=timerAlertButton]")).click();
		Thread.sleep(6000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		// Confirmation Box
		driver.findElement(By.cssSelector("button#confirmButton")).click();
		//Thread.sleep(2000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		// Validate the Confirmation Message
		WebElement confirmationMessage = driver.findElement(By.xpath("//span[@id='confirmResult' and text()='Ok']"));
		//WebElement confirmationMessage = driver.findElement(By.xpath("//span[@id='confirmResult' and text()='Cancel']"));
		if(confirmationMessage.isDisplayed()) {
			System.out.println("Successful confirmation message");
		}
		Thread.sleep(2000);
		
		// Prompt Box
		driver.findElement(By.cssSelector("button#promtButton")).click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Muthu");
		Thread.sleep(6000);
		alert.accept();
		
		// validate the text entered
		WebElement myNameConfirmation = driver.findElement(By.xpath("//span[@id='promptResult' and text()='Muthu']"));
		if(myNameConfirmation.isDisplayed()) {
			System.out.println("You entered Muthu");
		}
		
		// Quit WebDriver session
		driver.quit();
		
	}

}
