package com.learn4earn.apr24assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoqaAlertWithBlockingAd {
	
	public static WebDriver driver;
	
	// JavascriptExecutor interface to handle the permanent overlay of the ad present on demoqa site
	public static JavascriptExecutor executor;
	
	// Alert interface to handle the Alert boxes
	public static Alert alert;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		executor = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		
		WebElement alertPage = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		executor.executeScript("arguments[0].click();", alertPage);
		Thread.sleep(2000);
		
		WebElement alertsLink = driver.findElement(By.cssSelector("div.accordion>div:nth-of-type(3)>div>ul>li:nth-child(2)"));
		executor.executeScript("arguments[0].click();", alertsLink);
		Thread.sleep(2000);
		
		WebElement alertBox = driver.findElement(By.cssSelector("button#alertButton"));
		executor.executeScript("arguments[0].click();", alertBox);
		Thread.sleep(2000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		WebElement alertBox5Sec = driver.findElement(By.cssSelector("button[id=timerAlertButton]"));
		executor.executeScript("arguments[0].click()", alertBox5Sec);
		Thread.sleep(6000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		
		WebElement confirmBox = driver.findElement(By.cssSelector("button#confirmButton"));
		executor.executeScript("arguments[0].click()", confirmBox);
		Thread.sleep(2000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		
		WebElement confirmationMessage = driver.findElement(By.xpath("//span[@id='confirmResult' and text()='Ok']"));
		//WebElement confirmationMessage = driver.findElement(By.xpath("//span[@id='confirmResult' and text()='Cancel']"));
		if(confirmationMessage.isDisplayed()) {
			System.out.println("Successful confirmation message");
		}
		Thread.sleep(2000);
		
		WebElement promptBox = driver.findElement(By.cssSelector("button#promtButton"));
		executor.executeScript("arguments[0].click()", promptBox);
		Thread.sleep(2000);
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Muthu");
		//executor.executeScript("document.getElementById('promtButton').value='Selenium'");
		Thread.sleep(6000);
		alert.accept();
		Thread.sleep(2000);
		
		WebElement myNameConfirmation = driver.findElement(By.xpath("//span[@id='promptResult' and text()='Muthu']"));
		if(myNameConfirmation.isDisplayed()) {
			System.out.println("You entered Muthu");
		}
		
		driver.quit();
		
	}

}
